package me.sathish.graphqlrecipe.runner;

import org.springframework.stereotype.Service;

@Service
public class RunnerService {
    // This class is responsible for managing the runner data
    // It can include methods to fetch, update, and delete runner information

    // Example method to get a runner by ID
    public Runner getRunnerById(Integer id) {
        // Logic to fetch the runner from the database or any other source
        return new Runner(id, "John Doe", "sathishk.dot@gmail.com");
    }
}
