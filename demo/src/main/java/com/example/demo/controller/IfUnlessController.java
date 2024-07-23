package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.example.demo.domain.Car;

@Controller
@RequestMapping("/if-unless")
public class IfUnlessController {

    @RequestMapping("")
    public String index(Model model){
        Car car = new Car();
        car.setSpeed(60);
    
    model.addAttribute("car", car);

    return "if-unless";
}
}
