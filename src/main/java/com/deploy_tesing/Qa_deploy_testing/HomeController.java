package com.deploy_tesing.Qa_deploy_testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home (){
        return "welcome";
    }

    @GetMapping("/home")
    public String demo (){
        return "welcome to home path";
    }

}
