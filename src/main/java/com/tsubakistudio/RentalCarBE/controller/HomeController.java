package com.tsubakistudio.RentalCarBE.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeController {
    @GetMapping
    public String greeting(){
        return "Dit con me chan doi vl";
    }
}
