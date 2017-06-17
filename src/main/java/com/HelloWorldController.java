package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public ModelAndView welcomeMessage(
            @RequestParam(value = "name", required = false) String urlParameter) {
        // Name of your jsp file as parameter
        ModelAndView view = new ModelAndView("hello");
        view.addObject("modelName", urlParameter);
        return view;
    }
}
