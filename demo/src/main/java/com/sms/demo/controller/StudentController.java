package com.sms.demo.controller;

import com.sms.demo.entity.Student;
import com.sms.demo.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;


    //CREATE
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student saved = studentRepository.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
    //READ
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return ResponseEntity.ok(students);
    }
    //READ
    @GetMapping("/{rollno}")
    public ResponseEntity<Student> getStudentByRollno(@PathVariable("rollno") Long rollno) {
        Optional<Student> student = studentRepository.findById(rollno);
        if (student.isPresent()) {
            return ResponseEntity.ok(student.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


    //UPDATE
    @PutMapping("/{rollno}")
    public ResponseEntity<Student> updateStudentByRollno(@PathVariable("rollno") Long rollno, @RequestBody Student studentDetail) {
        Optional<Student> studentOptional = studentRepository.findById(rollno);
        if (studentOptional.isPresent()) {
            Student existingStudent = studentOptional.get();
            existingStudent.setName(studentDetail.getName());
            existingStudent.setCgpa(studentDetail.getCgpa());
            existingStudent.setBranch(studentDetail.getBranch());
            Student updatedStudent = studentRepository.save(existingStudent);
            return ResponseEntity.ok(updatedStudent);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }


    //DELETE by rollno
    @DeleteMapping("/{rollno}")
    public ResponseEntity<Void> deleteStudentByRollno(@PathVariable("rollno") Long rollno){
        Optional<Student> deleteStudent=studentRepository.findById(rollno);
        if(deleteStudent.isPresent()){
            studentRepository.deleteById(rollno);
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


    //DELETE fully
    @DeleteMapping
    public ResponseEntity<Void> deleteAllStudents(){
        studentRepository.deleteAll();
        return ResponseEntity.ok().build();
    }
}
