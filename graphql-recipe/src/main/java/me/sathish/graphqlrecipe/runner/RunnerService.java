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
}
