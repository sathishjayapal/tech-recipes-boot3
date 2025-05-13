package me.sathish.garminrunrecipe;

import org.springframework.boot.SpringApplication;

public class TestGarminrunRecipeApplication {

    public static void main(String[] args) {
        SpringApplication.from(GarminrunRecipeApplication::main)
                .with(TestcontainersConfiguration.class)
                .run(args);
    }
}
