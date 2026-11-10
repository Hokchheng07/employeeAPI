package com.istad.restapi.mapper;


import com.istad.restapi.domain.Employee;
import com.istad.restapi.dto.CreateEmployeeRequest;
import com.istad.restapi.dto.EmployeeResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    // Map from domain to DTO

    EmployeeResponse toResponse(Employee employee);

    // Map from DTO to domain

    Employee fromCreateEmployeeRequest(CreateEmployeeRequest employeeRequest);



}
