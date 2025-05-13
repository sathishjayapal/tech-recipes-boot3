package me.sathish.graphqlrecipe.stravaruns.controller;

import java.util.List;
import me.sathish.graphqlrecipe.stravaruns.data.StravaRun;
import me.sathish.graphqlrecipe.stravaruns.service.StravaRunService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/strava")
@RestController
public class StravaController {
    private final StravaRunService stravaRunService;

    public StravaController(StravaRunService stravaRunService) {
        this.stravaRunService = stravaRunService;
    }
    // Define your REST endpoints here
    // For example:
    @GetMapping("/runs")
    public List<StravaRun> getAllRuns() {
        return stravaRunService.getAllRuns();
    }
}
