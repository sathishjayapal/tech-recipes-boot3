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
        // This is a placeholder implementation. Replace with actual logic to fetch Garmin runs.
        return garminRepo.findAll();
    }
    @PostConstruct
    public void init() {
        // This method is called after the bean is created
        // You can use it to initialize any data or perform setup tasks
        garminRepo.saveAll(List.of(
                new GarminRun("1", "Morning Run",
                        "5km run in the park", "2023-10-01", "00:30:00",
                        "5km",runnerService.getRunnerById(1)),
                new GarminRun("2", "Evening Run",
                        "10km run in the city", "2023-10-02", "01:00:00",
                        "10km",runnerService.getRunnerById(1))));
        System.out.println("GarminRunService initialized");
    }
}
