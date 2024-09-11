package com.hms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String rootMap(){
        return "Hello Spring!";
    }

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String testURL(){
        return "Hello testURL!";
    }
}
