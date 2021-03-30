package com.wildcodeschool.TheDoctor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DavidTennantController {

    @GetMapping("/doctor/10")
    @ResponseBody
    public static String index() {
        return "David Tennant<br /><a href='/'>Back to main page</a>";
    }

}
