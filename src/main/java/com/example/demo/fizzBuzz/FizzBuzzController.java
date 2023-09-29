package com.example.demo.fizzBuzz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FizzBuzzController {

    private final FizzBuzzService fizzBuzzService;

    public FizzBuzzController(FizzBuzzService fizzBuzzService) { 
        this.fizzBuzzService = fizzBuzzService; 
                                                
    }

    @GetMapping("fizzBuzz") 
    public String fizzBuzz(Model model) {
        model.addAttribute("result", fizzBuzzService.generateFizzBuzz(0, 100));
        return "fizzBuzz.html";
    }
}