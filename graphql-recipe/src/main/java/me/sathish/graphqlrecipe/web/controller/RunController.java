package me.sathish.graphqlrecipe.web.controller;

import java.util.ArrayList;
import java.util.List;
import me.sathish.graphqlrecipe.common.Run;
import me.sathish.graphqlrecipe.garminruns.GarminRun;
import me.sathish.graphqlrecipe.garminruns.GarminRunService;
import me.sathish.graphqlrecipe.stravaruns.StravaRun;
import me.sathish.graphqlrecipe.stravaruns.StravaRunService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/runs")
public class RunController {
    private final GarminRunService garminRunService;
    private final StravaRunService stravaRunService;

    public RunController(GarminRunService garminRunService, StravaRunService stravaRunService) {
        this.garminRunService = garminRunService;
        this.stravaRunService = stravaRunService;
    }
    //    @SchemaMapping(typeName = "Query",value = "allOrders")
    @QueryMapping
    public List<Run> getAllRuns() {
        garminRunService.getAllRuns();
        stravaRunService.getAllRuns();
        List<GarminRun> garminRuns = garminRunService.getAllRuns();
        List<StravaRun> stravaRuns = stravaRunService.getAllRuns();
        List<Run> combinedRuns = new ArrayList<>();
        garminRuns.forEach(garminRun -> combinedRuns.add(new Run(
                garminRun.getId(),
                garminRun.getName(),
                garminRun.getDescription(),
                garminRun.getDate(),
                garminRun.getDuration(),
                garminRun.getDistance())));
        stravaRuns.forEach(stravaRun -> combinedRuns.add(new Run(
                stravaRun.getId(),
                stravaRun.getName(),
                stravaRun.getDate(),
                stravaRun.getDuration(),
                stravaRun.getDistance())));
        return combinedRuns;
    }
}
