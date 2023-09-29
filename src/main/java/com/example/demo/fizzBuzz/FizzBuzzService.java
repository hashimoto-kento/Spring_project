package com.example.demo.fizzBuzz;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service; 

@Service
public class FizzBuzzService {

    public List<String> generateFizzBuzz(int start, int end) { 
        List<String> result = new ArrayList<>(); 
        
        for (int i = start; i <= end; i++) {
            
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
                
            } else if (i % 3 == 0) {
                result.add("Fizz");
                
            } else if (i % 5 == 0) {
                result.add("Buzz");
                
            } else {
                result.add(String.valueOf(i)); 
            }
        }
        return result;
    }
}