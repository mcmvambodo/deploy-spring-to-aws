package doitwell.group.springaws.controllers.entity;

import lombok.*;

import java.time.LocalDate;

public abstract class UserEntity {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private LocalDate dob;
    private String residence;

    public abstract String writeEntity();
}
