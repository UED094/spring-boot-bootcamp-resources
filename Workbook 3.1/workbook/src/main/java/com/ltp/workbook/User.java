package com.ltp.workbook;

import java.util.Date;
import java.util.UUID;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
    @NotBlank(message = "First name cannot be blank")
    @Size(min = 2, message = "First name is too short")
    private String firstName;
    @NotBlank(message = "Last name cannot be blank")
    @Size(min = 2, message = "Last name is too short")
    private String lastName;
    @NotBlank(message = "Username cannot be blank")
    @Size(min = 7, message = "Username should be at least 7 characters")
    private String username;
    @Email(message = "E-mail is not valid")
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message = "Birth date should be in the past")
    private Date birthDate;
    private String id;

    public User() {
        this.id = UUID.randomUUID().toString();
        ;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
