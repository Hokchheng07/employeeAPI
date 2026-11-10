package com.istad.restapi.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public record EmployeeResponse(
        Integer id,

        String name,

        String email,

        BigDecimal salary,

        LocalDate hiredDate,

        Boolean isActive

) {

}
