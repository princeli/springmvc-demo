package com.princeli.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class User implements Serializable {
    private Long id;

    @NotEmpty(message = "{user.name.null}")  
    @Length(min = 5, max = 20, message = "{user.name.length.illegal}")  
    @Pattern(regexp = "[a-zA-Z]{5,20}", message = "{user.name.illegal}")  
    private String name;

    @NotEmpty(message = "{user.password.null}")
    private String password;

    private Date birthday;

    private Double salary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}