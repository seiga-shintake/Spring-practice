package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.example.demo.domain.Car;

@Controller
@RequestMapping("/each")
public class EachController {

    @RequestMapping("")
    public String index(Model model){

        List<Car> carList = new ArrayList<>();

        Car a = new Car(100,"赤");
        Car b = new Car(80,"ブラック");
        Car c = new Car(120,"白");

        carList.add(a);
        carList.add(b);
        carList.add(c);

        model.addAttribute("carList",carList);

        return "each";


    }

}
