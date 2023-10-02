package com.example.demo.minus.MinusController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.minus.MinusService.MinusService;

@Controller
public class MinusController {

    private final MinusService minusService; 

    public MinusController(MinusService minusService) { 
        this.minusService = minusService; 
    }

    @GetMapping("minus") 
    public String requestAnswer() {
        return "minus.html";
    }

    @PostMapping("calculate") 
    public String subtract(@RequestParam("number1") int number1, @RequestParam("number2") int number2, Model model) {

        int result = minusService.subtract(number1, number2);

        model.addAttribute("result", result);

        return "minus.html";
    }
}