package com.school.KSI.api;

import com.school.KSI.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/teachers") //It gives endpoint
@RestController //this api class implements rest api
public class TeacherController {
    private TeachersService teacherService;
    @Autowired
    public TeacherController(TeachersService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping
    public List<List<Object>> getAllTeachers(){
        return teacherService.getAllTeachers();
    }
}
