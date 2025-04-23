package me.sathish.garminrunrecipe.controller;

import java.util.List;
import me.sathish.garminrunrecipe.data.GarminRun;
import me.sathish.garminrunrecipe.service.GarminRunService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/garminruns")
public class GarminRunController {

    private final GarminRunService garminRunService;

    public GarminRunController(GarminRunService garminRunService) {
        this.garminRunService = garminRunService;
    }

    @GetMapping
    public List<GarminRun> getAllGarminRuns() {
        return garminRunService.getAllGarminRuns();
    }
}
