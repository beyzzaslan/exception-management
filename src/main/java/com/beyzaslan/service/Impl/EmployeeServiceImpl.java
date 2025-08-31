package com.beyzaslan.service.Impl;

import com.beyzaslan.dto.DtoDepartment;
import com.beyzaslan.dto.DtoEmployee;
import com.beyzaslan.exception.BaseException;
import com.beyzaslan.exception.ErrorMessage;
import com.beyzaslan.exception.MessageType;
import com.beyzaslan.model.Department;
import com.beyzaslan.model.Employee;
import com.beyzaslan.repository.EmployeeRepository;
import com.beyzaslan.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public DtoEmployee findEmployeeById(Long id) {
        DtoEmployee dtoEmployee = new DtoEmployee();
        DtoDepartment dtoDepartment = new DtoDepartment();
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isEmpty()) {
            throw  new BaseException(new ErrorMessage((MessageType.NO_RECORD_EXIST),id.toString() ));
        }

        Employee employee = optional.get();
        Department department = employee.getDepartment();

        BeanUtils.copyProperties(employee, dtoEmployee);
        BeanUtils.copyProperties(department, dtoDepartment);
        //dto ların içine atıyoruz bunları burada

        dtoEmployee.setDepartment(dtoDepartment);
        return dtoEmployee;
    }
}
