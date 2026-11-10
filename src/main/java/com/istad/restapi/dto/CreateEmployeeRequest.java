package com.istad.restapi.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CreateEmployeeRequest (
        String name,

        String email,

        BigDecimal salary,

        LocalDate hiredDate

        ){
}
