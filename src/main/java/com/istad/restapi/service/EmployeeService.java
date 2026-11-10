package com.istad.restapi.service;

import com.istad.restapi.dto.CreateEmployeeRequest;
import com.istad.restapi.dto.EmployeeResponse;

import java.util.List;

public interface EmployeeService {

    // CRUD Operations
    List<EmployeeResponse> getAllEmployees();
    EmployeeResponse getEmployeeById(Integer id);
    EmployeeResponse createEmployee(CreateEmployeeRequest employeeRequest);
}
