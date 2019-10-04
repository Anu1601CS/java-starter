package com.school.management.services.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.school.management.model.StudentModel;
import com.school.management.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentModel> getStudents() {
        List<StudentModel> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public Optional getStudent(String id) {
        return studentRepository.findById(id);
    }

    public void addStudent(StudentModel student) {
        studentRepository.save(student);
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }

    public void deleteStudents() {
        studentRepository.deleteAll();
    }

    public void updateStudent(String id, StudentModel fromData) {
        studentRepository.save(fromData);
    }

    // public void updateStudents(StudentModel fromData) {
    //     studentRepository.saveAll(fromData);
    // }
}
