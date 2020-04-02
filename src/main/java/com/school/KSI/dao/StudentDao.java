package com.school.KSI.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.school.KSI.model.Student;
import com.school.KSI.utilities.DBUtils;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository("student")
public class StudentDao {

    public static int insertStudent(int student_id,
                                    String class_name,
                                    String name,
                                    String lastname,
                                    String email,
                                    int student_nu,
                                    String student_lesson_id,
                                    Date birth_day){
        return 0;
    }

    public List<List<Object>> selectAllStudents() {
        List<List<Object>> allStudents = DBUtils.getQueryResultList("Select * from students");
        return allStudents;
    }
}
