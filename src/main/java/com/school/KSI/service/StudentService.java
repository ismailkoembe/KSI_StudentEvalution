package com.school.KSI.service;

import com.school.KSI.dao.StudentDao;
import com.school.KSI.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentDao studentDao;
    @Autowired
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }


    public void addStudent(Student student) {
    }

    public List<List<Object>> getAllStudent() {
        return studentDao.selectAllStudents();
    }

    public List<Object> studentById(int id) {
        return studentDao.selectStudentById(id);
    }
}
