package com.school.KSI.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Date;

public class Teachers {

    private final int teacher_id;

    @NotBlank
    private final String name;

    @NotBlank
    private final String lastname;

    @NotBlank
    private final String email;

    @NotNull
    private final int teacher_nu;

    @NotNull
    private final int teacher_department;

    @NotBlank
    private final Date birth_day;

    public Teachers(@JsonProperty int teacher_id,
                    @JsonProperty String name,
                    @JsonProperty String lastname,
                    @JsonProperty String email,
                    @JsonProperty int teacher_nu,
                    @JsonProperty int teacher_department,
                    @JsonProperty Date birth_day) {
        this.teacher_id = teacher_id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.teacher_nu = teacher_nu;
        this.teacher_department = teacher_department;
        this.birth_day = birth_day;
    }

    public int getTeacher_id() {
        return teacher_id;
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

    public int getTeacher_nu() {
        return teacher_nu;
    }

    public int getTeacher_department() {
        return teacher_department;
    }

    public Date getBirth_day() {
        return birth_day;
    }
}
