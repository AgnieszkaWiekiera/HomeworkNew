package lekcja5.zadanie4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
class EmployeeTest {

    @Test
    void shouldRetrieveEmployeeDescription() {
        //given
        Employee employee = new Employee("John", "Smith", BigDecimal.ZERO, BigDecimal.ZERO);
        //when
        String actualEmployeeInfo = employee.getEmployeeInfo();
        //then
        Assertions.assertNotNull(actualEmployeeInfo);
        Assertions.assertEquals("Employee name : John Smith", actualEmployeeInfo);
    }

    @Test
    void shouldRetrieveEmployeeDetailsWithAge() {
        //given
        Employee employee = new Employee("John", "Smith", 45);
        //when
        String actualEmployeeDetails = employee.getEmployeeDetails();
        //then
        Assertions.assertNotNull(actualEmployeeDetails);
        Assertions.assertEquals("Employee details : John Smith is 45", actualEmployeeDetails);
    }

    @Test
    void shouldRetrieveBaseSalary() {
        //given
        BigDecimal baseSalary = new BigDecimal("3000");
        Employee employee = new Employee("John", "Smith", 45, baseSalary);
        //when
        BigDecimal actualBaseSalary = employee.getBaseSalary();
        //then
        Assertions.assertNotNull(actualBaseSalary);
        Assertions.assertEquals(baseSalary, actualBaseSalary);
    }

    @Test
    void shouldRetrieveBaseSalaryWithBonus() {
        //given
        BigDecimal baseSalary = new BigDecimal("3000");
        BigDecimal bonus = new BigDecimal("500");
        Employee employee = new Employee("John", "Smith",45, baseSalary, bonus);
        //when
        BigDecimal actualTotalSalary = employee.getTotalSalary();
        //then
        Assertions.assertNotNull(actualTotalSalary);
        Assertions.assertEquals(baseSalary.add(bonus), actualTotalSalary);
    }

    @Test
    void shouldRetrieveEmployeeBonus() {
        //given
        BigDecimal baseSalary = new BigDecimal("3000");
        BigDecimal bonus = new BigDecimal("500");
        Employee employee = new Employee("John", "Smith", 45,baseSalary, bonus);
        //when
        BigDecimal actualBonus = employee.getBonus();
        //then
        Assertions.assertNotNull(actualBonus);
        Assertions.assertEquals(bonus, actualBonus);
    }
}