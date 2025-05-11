package me.sathish.graphqlrecipe.stravaruns.controller;

import me.sathish.graphqlrecipe.stravaruns.data.StravaRun;
import me.sathish.graphqlrecipe.stravaruns.service.StravaRunService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
