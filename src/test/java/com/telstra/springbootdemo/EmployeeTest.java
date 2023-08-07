package com.telstra.springbootdemo;
import com.telstra.springbootdemo.model.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

@Test
public void getSalaryTest() {
	Employee employee= new Employee(1001, "Ram", "Manager", 50000);
	assertEquals(50000,employee.getSalary());
}

}