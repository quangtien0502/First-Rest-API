package com.ra.service.student;

import com.ra.model.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student findById(Long id);
    Student save(Student student);
    void delete(Long id);
}
