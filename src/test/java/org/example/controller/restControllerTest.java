package org.example.controller;

import org.example.pojo.EmployeeDetails;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class restControllerTest {
    private restController testPostController;

    @BeforeEach
    void setUp() {
        // Instantiate the controller before each test
        testPostController = new restController();
    }

    @Test
    void testPostRequest_ValidAge_ShouldReturnTrue() {
        // Prepare the student object with age > 10
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.setEmpname("John");
        employeeDetails.setAge(15); // Age > 10

        // Call the method and assert the result
        Boolean result = testPostController.postController(employeeDetails);
        assertTrue(result, "Expected result to be true for age > 10");
    }

    @Test
    void testPostRequest_InvalidAge_ShouldReturnFalse() {
        // Prepare the student object with age <= 10
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.setEmpname("Jane");
        employeeDetails.setAge(5); // Age <= 10

        // Call the method and assert the result
        Boolean result = testPostController.postController(employeeDetails);
        assertFalse(result, "Expected result to be false for age <= 10");
    }

}