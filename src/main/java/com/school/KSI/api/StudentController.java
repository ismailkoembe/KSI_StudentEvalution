package com.school.KSI.api;

import com.school.KSI.model.Student;
import com.school.KSI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/students") //It gives endpoint
@RestController //this api class implements rest api
public class StudentController {
    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<List<Object>> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping (path = "{id}")
    //It defines that id is path parameter
    public List<Object> getStudentById(@PathVariable("id") int id){
        return studentService.studentById(id);
    }

}
