package me.sathish.graphqlrecipe.runner;

import jakarta.annotation.PostConstruct;
import me.sathish.graphqlrecipe.common.Run;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RunnerService {
    private final RunnerRepo runnerRepo;

    public RunnerService(RunnerRepo runnerRepo) {
        this.runnerRepo = runnerRepo;
    }
    // This class is responsible for managing the runner data
    // It can include methods to fetch, update, and delete runner information

    // Example method to get a runner by ID
    public Runner getRunnerById(Integer id) {
        // Logic to fetch the runner from the database or any other source
        return runnerRepo.getReferenceById(1L);
    }
    @PostConstruct
    public void init() {
        // This method is called after the bean is created
        // You can use it to initialize any data or perform setup tasks
        Runner runner= new Runner(1, "John Doe", "sathishk.dot@gmail.com");
        runnerRepo.save(runner);
        System.out.println("RunnerService initialized");
    }
}
