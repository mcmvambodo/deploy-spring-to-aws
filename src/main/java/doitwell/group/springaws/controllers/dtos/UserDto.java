package doitwell.group.springaws.controllers.dtos;

import lombok.Data;

import java.time.LocalDate;


@Data
public class UserDto {
    private String firstname;
    private String lastname;
    private String email;
    private String pass;
    private LocalDate dob = LocalDate.now();
}
