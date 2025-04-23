package me.sathish.graphqlrecipe;

import org.springframework.boot.SpringApplication;

public class TestCatalogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(GraphqlRecipeApplication::main)
                .with(ContainersConfig.class)
                .run(args);
    }
}
