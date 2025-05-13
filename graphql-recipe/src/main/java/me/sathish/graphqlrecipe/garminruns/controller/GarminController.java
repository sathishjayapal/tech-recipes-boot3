package me.sathish.graphqlrecipe.garminruns.controller;

import java.util.List;
import me.sathish.graphqlrecipe.garminruns.data.GarminRun;
import me.sathish.graphqlrecipe.garminruns.service.GarminRunService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/garmin")
@RestController
public class GarminController {
    private final GarminRunService garminRunService;

    public GarminController(GarminRunService garminRunService) {
        this.garminRunService = garminRunService;
    }
    // Define your REST endpoints here
    // For example:
    @GetMapping("/runs")
    public List<GarminRun> getAllRuns() {
        return garminRunService.getAllRuns();
    }
    @QueryMapping
    public List<GarminRun> getGarminRuns () {
        return garminRunService.getAllRuns();
    }
}
