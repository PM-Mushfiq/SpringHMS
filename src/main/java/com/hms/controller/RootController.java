package com.hms.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class RootController {

    @GetMapping(value="/")
    public String rootMap(){
        return "Hello Spring! auto load after change";
    }

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String testURL(){
        return "Hello testURL!";
    }
}
