package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Car;

@Controller
@RequestMapping("/variable-expressions")
public class VriableExpressionsController {

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("name", "新竹星河");

        Car car = new Car();
        car.setSpeed(100);
        car.setBodyColor("スカイブルー");
        model.addAttribute("car", car);

        return "variable-expressions";

    }

}
