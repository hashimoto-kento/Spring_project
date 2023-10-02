package com.example.demo.multi.Multicontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.multi.MultiService.MultiService;

@Controller
public class MultiController {
    
    private final MultiService multiService;
    
    public MultiController(MultiService multiService) {
        this.multiService = multiService;
        
    }
    
    @GetMapping("multi")
    public String plus(Model model) {
        
        String result = "";
        
        result = String.valueOf(multiService.multi(5, 6));
        
        model.addAttribute("result", result);
        
        return "multi.html";
    }
    
}