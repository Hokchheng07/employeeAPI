package com.istad.restapi.controller;

import com.istad.restapi.dto.CreateEmployeeRequest;
import com.istad.restapi.dto.EmployeeResponse;
import com.istad.restapi.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    private final EmployeeService service;

    @GetMapping
    public List<EmployeeResponse> getAllEmployees(){

        return service.getAllEmployees();

    }
    @GetMapping("{id}")
    public EmployeeResponse getEmployeeById(@PathVariable Integer id){

        return  service.getEmployeeById(id);

    }
    @PostMapping
    public EmployeeResponse createEmployee(
            @RequestBody CreateEmployeeRequest request){

        return service.createEmployee(request);

    }

}
