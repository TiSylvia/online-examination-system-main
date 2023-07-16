package com.exam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping("/getIndex")
    public ModelAndView getIndex() {
        return new ModelAndView("index");
    }

    @RequestMapping("/getIndex2")
    public String getIndex2() {
        System.out.println("进入controller");
        return "index";
    }

}
