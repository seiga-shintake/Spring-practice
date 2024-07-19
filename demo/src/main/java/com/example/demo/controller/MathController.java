package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.MathReceiveForm;

@Controller
@RequestMapping("/math1")
public class MathController {

    @RequestMapping("")
    public String index(){
        return "mathForm";
    }

        @RequestMapping("math2")
        public String receivemath(MathReceiveForm mathReceiveForm,Model model){
            model.addAttribute("num1",mathReceiveForm.getNum1());
            model.addAttribute("num2",mathReceiveForm.getNum2());
            model.addAttribute("totalNum", mathReceiveForm.totalNum(mathReceiveForm.getNum1(), mathReceiveForm.getNum2(), mathReceiveForm.getNumkind()));
            return "mathFinish";

        }

}
