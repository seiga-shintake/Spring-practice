package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.User;
import com.example.demo.form.UserForm;

@Controller
@RequestMapping("/User")
public class UserController {

    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index() {
        return "advanceForm";
    }

    @RequestMapping("/check")
    public String toCheck(UserForm userForm/*String name,String adless,int gender,String pass,String gendeString*/) {

        // UserForm userForm = new UserForm();
        // userForm.setName(name);
        // userForm.setAdless(adless);
        // userForm.setGender(gender);
        // userForm.setPass(pass);
    
        User user = new User();
        user.setName(userForm.getName());
        user.setAdless(userForm.getAdless());
        user.setGender(userForm.getGender());
        user.setPass(userForm.getPass());
        user.setGenderString(user.genderChange(userForm.getGender()));
        
        session.setAttribute("User", user);

        return "advanceCheck";
    }

    @RequestMapping("/finish")
    public String toFinish() {
        return "advanceFinished";
    }

}
