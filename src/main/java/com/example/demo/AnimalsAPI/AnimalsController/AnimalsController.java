package com.example.demo.AnimalsAPI.AnimalsController;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.AnimalsAPI.AnimalsData.AnimalsData;
import com.example.demo.AnimalsAPI.AnimalsService.AnimalsService;

@Controller
public class AnimalsController {

    private final AnimalsService animalsService;

    public AnimalsController(AnimalsService animalsService) {
        this.animalsService = animalsService;
    }

    @GetMapping("animalsSearch")
    public String animalsSearch(Model model) throws IOException {

        List<AnimalsData> animalsList = animalsService.getAnimalsData();

        model.addAttribute("animalsList", animalsList);

        return "animalsAPISearch.html";
    }

    @GetMapping("animalsResult")
    public String animalDetails(@RequestParam("animalsId") String animalsId, Model model) throws IOException {

        List<AnimalsData> hitAnimalsList = animalsService.getSpecificAnimalsData(animalsId);

        model.addAttribute("hitAnimalsList", hitAnimalsList);

        return "animalsAPIResult.html";

    }

}