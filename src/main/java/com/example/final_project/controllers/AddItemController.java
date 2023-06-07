package com.example.final_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/addItems")
public class AddItemController {
    @GetMapping
    public String getAddItems(){
        return "addItems";
    }
}
