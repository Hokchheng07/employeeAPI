package com.istad.restapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private static int nextId = 3;

    private Integer id;

    private String name;

    private String email;

    private BigDecimal salary;

    private LocalDate hiredDate;

    private Boolean isActive;

    public Employee(String name,String email, BigDecimal salary, LocalDate hiredDate) {
        this.id = nextId++;
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.hiredDate = hiredDate;
        this.isActive = Boolean.TRUE;
    }
}
