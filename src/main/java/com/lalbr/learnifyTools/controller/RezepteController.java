package com.lalbr.learnifyTools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RezepteController {
    
    @GetMapping("/rezepte")
    public String rezepteGetMapping(){
        return "rezepte";
    }

    @GetMapping("/rezepte/pizza")
    public String pizzaGetMapping(){
        return "rezepte/pizza";
    }
}
