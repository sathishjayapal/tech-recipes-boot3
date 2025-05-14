package me.sathish.graphqlrecipe.garminruns;

import java.util.List;

import me.sathish.graphqlrecipe.runner.RunnerService;
import org.springframework.stereotype.Service;

@Service
public class GarminRunService {
    private final RunnerService runnerService;

    public GarminRunService(RunnerService runnerService) {
        this.runnerService = runnerService;
    }


    public List<GarminRun> getAllRuns() {
        // This is a placeholder implementation. Replace with actual logic to fetch Garmin runs.
        return List.of(
                new GarminRun("1", "Morning Run", "5km run in the park", "2023-10-01", "00:30:00", "5km",runnerService.getRunnerById(1)),
                new GarminRun("2", "Evening Run", "10km run in the city", "2023-10-02", "01:00:00", "10km",runnerService.getRunnerById(1)));
    }
}
