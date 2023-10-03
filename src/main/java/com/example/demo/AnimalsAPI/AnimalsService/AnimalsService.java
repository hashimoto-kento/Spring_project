package com.example.demo.AnimalsAPI.AnimalsService;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.AnimalsAPI.AnimalsData.AnimalsData;
import com.example.demo.AnimalsAPI.AnimalsRepository.AnimalsRepository;

@Service
public class AnimalsService {

    private final AnimalsRepository animalsRepository;

    public AnimalsService(AnimalsRepository animalsRepository) {
        this.animalsRepository = animalsRepository;
    }

    public List<AnimalsData> getAnimalsData() throws IOException {

        AnimalsData[] animalsList = animalsRepository.getAnimalsData();

        return Arrays.asList(animalsList);
    }

    public List<AnimalsData> getSpecificAnimalsData(String animalsId) throws IOException {

        AnimalsData[] hitAnimalsList = animalsRepository.getSpecificAnimalsData(animalsId);

        return Arrays.asList(hitAnimalsList);
    }
}