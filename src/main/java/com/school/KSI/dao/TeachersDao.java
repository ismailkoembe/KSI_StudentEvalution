package com.school.KSI.dao;

import com.school.KSI.utilities.DBUtils;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository ("teachers")
public class TeachersDao{

    public static int insertTeacher(int teacher_id,
                                    String name,
                                    String lastname,
                                    String email,
                                    int teacher_nu,
                                    int teacher_department,
                                    Date birth_day) {
        return 0;
    }

    public List<List<Object>> selectAllTeachers() {
        List<List<Object>> allTeachers = DBUtils.getQueryResultList("Select * from teachers");
        return allTeachers;
    }
}
