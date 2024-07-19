package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.form.ReceiveForm;

@Controller
@RequestMapping("/recieve")
public class RecieveController {

    @RequestMapping("")
    public String index(){
        return "info-form";
    }

        @RequestMapping("recieve-info")
        public String recieveInfo(ReceiveForm recieveForm,Model model){
            model.addAttribute("name",recieveForm.getName());
            model.addAttribute("age",recieveForm.getAge());
            return "finished";
    } 
}
