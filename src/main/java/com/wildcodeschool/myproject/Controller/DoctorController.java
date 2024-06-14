package com.wildcodeschool.myproject.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @GetMapping("/doctor/1")
    public String showDoctor1() {
        return "William";
    }
    @GetMapping("/doctor/10")
    public String showDoctor10() {
        return "John";
    }
    @GetMapping("/doctor/13")
    public String showDoctor13() {
        return "Jodie";
    }
}
