package com.saugat.firstspringbootwebproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
    @RequestMapping("/student")
    public String student(){
        return "student";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){
        int result = num1 + num2;
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("addStudent")
    public String addStudent(Student student){
        return "studentResult";
    }
}
