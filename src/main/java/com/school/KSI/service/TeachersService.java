package com.school.KSI.service;

import com.school.KSI.dao.StudentDao;
import com.school.KSI.dao.TeachersDao;
import com.school.KSI.model.Student;
import com.school.KSI.model.Teachers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachersService {

    private final TeachersDao teacherDao;
    @Autowired
    public TeachersService(TeachersDao teacherDao) {
        this.teacherDao = teacherDao;
    }


    public void addTeacher(Teachers teachers) {
    }

    public List<List<Object>> getAllTeachers() {
        return teacherDao.selectAllTeachers();
    }
}
