package com.jindanupajit.javabootcamp.exercise1021;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("var1","I am Var-1");
        model.addAttribute("var2","I am Var-2");
        return "index";
    }
}
