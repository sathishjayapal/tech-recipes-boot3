package me.sathish.graphqlrecipe.garminruns;

import java.util.List;

import jakarta.annotation.PostConstruct;
import me.sathish.graphqlrecipe.runner.RunnerService;
import org.springframework.stereotype.Service;

@Service
public class GarminRunService {
    private final RunnerService runnerService;
    private final GarminRepo garminRepo;

    public GarminRunService(RunnerService runnerService, GarminRepo garminRepo) {
        this.runnerService = runnerService;
        this.garminRepo = garminRepo;
    }


    public List<GarminRun> getAllRuns() {
        return garminRepo.findAll();
    }

}
