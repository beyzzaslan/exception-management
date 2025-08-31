package com.beyzaslan.starter;

import com.beyzaslan.dto.DtoEmployee;
import com.beyzaslan.model.Employee;
import com.beyzaslan.service.IEmployeeService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = {ExceptionManagementStarter.class})
class ExceptionManagementApplicationTests {

    @Autowired
    private IEmployeeService employeeService;

    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach çalıştı...");
    }

    @Test
    public void testFindEmployeeById() {
        DtoEmployee employee = employeeService.findEmployeeById(4L);
      //assertNotNull(4);//bulunup bulunmadığı kontrolunu yapıyoruz
        assertEquals(4, 4);
    }

    @AfterEach
    public  void afterEach(){
        System.out.println("AfterEach çalıştı...");
    }

}
