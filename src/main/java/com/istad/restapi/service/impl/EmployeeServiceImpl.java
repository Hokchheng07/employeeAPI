package com.istad.restapi.service.impl;

import com.istad.restapi.Repository.EmployeeRepository;
import com.istad.restapi.domain.Employee;
import com.istad.restapi.dto.CreateEmployeeRequest;
import com.istad.restapi.dto.EmployeeResponse;
import com.istad.restapi.mapper.EmployeeMapper;
import com.istad.restapi.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;
    private final EmployeeMapper employeeMapper;
    @Override
    public List<EmployeeResponse> getAllEmployees() {
        return repository.getEmployeesList()
                .stream()
                .map(employeeMapper::toResponse)
                .toList();
    }

    @Override
    public EmployeeResponse getEmployeeById(Integer id) {
        return repository.getEmployeesList()
                .stream()
                .filter(emp-> emp.getId().equals(id))
                .findFirst()
                .map(employeeMapper::toResponse)
                .orElseThrow(
                        () -> new ResponseStatusException(
                                HttpStatus.NOT_FOUND, " Employee with id: %d not found".formatted(id)
                        )
                );
    }

    @Override
    public EmployeeResponse createEmployee(CreateEmployeeRequest employeeRequest) {

        if(checkIfEmailExist(employeeRequest.email())){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Email : %s , already exists!".formatted(employeeRequest.email()));
        }

        Employee employee = employeeMapper.fromCreateEmployeeRequest(employeeRequest);


        return employeeMapper.toResponse(employee);
    }

    private Boolean checkIfEmailExist(String email){
        return repository.getEmployeesList()
                .stream()
                .anyMatch(em -> em.getEmail().toLowerCase().equalsIgnoreCase(email));
    }

}
