package com.connerly.peopledbweb.biz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message="First name is required")
    private String firstName;

    @NotEmpty(message="Last name is required")
    private String lastName;

    @Past(message="DoB must be in past")
    @NotNull(message="Must specify a date of birth")
    private LocalDate dob;

    @Email(message="Valid email is required")
    @NotEmpty(message="Must provide a valid email address")
    private String email;

    private BigDecimal salary;

}
