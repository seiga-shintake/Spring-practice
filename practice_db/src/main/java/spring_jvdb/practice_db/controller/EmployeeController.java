package spring_jvdb.practice_db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring_jvdb.practice_db.domain.Employee;
import spring_jvdb.practice_db.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @RequestMapping("/execute")
    public String execute(Model model){
        List<Employee> employee = service.findAll();
        model.addAttribute("employee", employee);

        return "finished";

    }
}
