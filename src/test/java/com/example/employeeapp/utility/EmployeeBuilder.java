package com.example.employeeapp.utility;

import com.example.employeeapp.dto.EmployeeDTO;
import com.example.employeeapp.entity.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeBuilder {
    public static List<EmployeeDTO> getListDTO() {
        return Arrays.asList(new EmployeeDTO(101,"Koushik","DEV",100000),
                new EmployeeDTO(102,"Lasya","OPT",200000));
    }

    public static List<Employee> getListEntities() {
        return Arrays.asList(new Employee(101,"Koushik","DEV",100000),
                new Employee(102,"Lasya","OPT",200000));
    }

    public static EmployeeDTO getDTO() {
        return new EmployeeDTO(101,"Koushik","DEV",100000);
    }

    public static Employee getEntity() {
        return new Employee(101,"Koushik","DEV",100000);
    }

}
