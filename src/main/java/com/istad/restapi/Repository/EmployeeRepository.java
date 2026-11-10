package com.istad.restapi.Repository;


import com.istad.restapi.domain.Employee;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
public class EmployeeRepository {

    private final List<Employee> employeesList;

    public EmployeeRepository(){
        employeesList = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setName("Chhun Hokchheng");
        emp1.setSalary(BigDecimal.valueOf(2000.0));
        emp1.setHiredDate(
                LocalDate.of(2025,9,17)
        );
        emp1.setIsActive(true);


        Employee emp2 = new Employee();
        emp2.setId(2);
        emp2.setName("Leang Seavminh");
        emp2.setSalary(BigDecimal.valueOf(1000.0));
        emp2.setHiredDate(
                LocalDate.of(2024,8,17)
        );
        emp1.setIsActive(true);


        Employee emp3 = new Employee();
        emp3.setId(1);
        emp3.setName("Men Senghak");
        emp3.setSalary(BigDecimal.valueOf(3000.0));
        emp3.setHiredDate(
                LocalDate.of(2023,5,27)
        );
        emp3.setIsActive(true);
    }


}
