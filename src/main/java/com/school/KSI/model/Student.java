package com.school.KSI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Date;


public class Student {

    private final int student_id;

    @NotBlank
    private final String class_name;

    @NotBlank
    private final String name;

    @NotBlank
    private final String lastname;

    @NotBlank
    private final String email;

    @NotNull
    private final int student_nu;

    @NotBlank
    private final String student_lesson_id;

    @NotBlank
    private final Date birth_day;


    public Student(@JsonProperty int student_id,
                   @JsonProperty String class_name,
                   @JsonProperty String name,
                   @JsonProperty String lastname,
                   @JsonProperty String email,
                   @JsonProperty int student_nu,
                   @JsonProperty String student_lesson_id,
                   @JsonProperty Date birth_day) {
        this.student_id = student_id;
        this.class_name = class_name;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.student_nu = student_nu;
        this.student_lesson_id = student_lesson_id;
        this.birth_day = birth_day;
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public int getStudent_nu() {
        return student_nu;
    }

    public String getStudent_lesson_id() {
        return student_lesson_id;
    }

    public Date getBirth_day() {
        return birth_day;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", class_name='" + class_name + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", student_nu=" + student_nu +
                ", student_lesson_id='" + student_lesson_id + '\'' +
                ", birth_day=" + birth_day +
                '}';
    }
}