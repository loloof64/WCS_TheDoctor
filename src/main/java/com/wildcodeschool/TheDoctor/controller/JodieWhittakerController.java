package com.wildcodeschool.TheDoctor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JodieWhittakerController {

    @GetMapping("/doctor/13")
    @ResponseBody
    public static String index() {
        return "Jodie Whittaker<br /><a href='/'>Back to main page</a>";
    }

}
