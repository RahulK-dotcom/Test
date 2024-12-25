package org.example.controller;
import org.example.pojo.EmployeeDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class restController {
    @GetMapping
    public String testController(){
        return "Hello World!!!!!!!";
    }
    @PostMapping
    public Boolean postController(@RequestBody EmployeeDetails employeeDetails){
        return employeeDetails.age>10;
    }
}
