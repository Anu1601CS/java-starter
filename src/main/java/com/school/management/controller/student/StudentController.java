package com.school.management.controller.student;

import java.util.List;
import java.util.Optional;

import com.school.management.model.StudentModel;
import com.school.management.services.student.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/")
    public static String main(String[] args) {
        return "Welcome to Class";
    }

    @GetMapping("/students")
    public List<StudentModel> getStudents(String[] args) {
        return studentService.getStudents();
    }

    @GetMapping("/students/{id}")
    public Optional getStudent(@PathVariable String id) {
        return studentService.getStudent(id);
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody StudentModel student) {
        studentService.addStudent(student);
    }

    // @PutMapping("/students")
    // public void updateStudents(@RequestBody StudentModel formdata) {
    //     studentService.updateStudents(formdata);
    // }

    @PutMapping("/students/{id}")
    public void updateStudent(@RequestBody StudentModel formdata, @PathVariable String id) {
        studentService.updateStudent(id, formdata);
    }

    @DeleteMapping("/students")
    public void deleteStudents() {
        studentService.deleteStudents();
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
    }
}