package me.sathish.graphqlrecipe.stravaruns.service;

import me.sathish.graphqlrecipe.stravaruns.data.StravaRun;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StravaRunService {

    public List<StravaRun> getAllRuns() {
        // This is a placeholder implementation. Replace with actual logic to fetch Garmin runs.
        return List.of(
                new StravaRun("1", "5km Strava run in the park", "2023-10-01", "00:30:00", "5km"),
                new StravaRun("2", "10km Strava run in the city", "2023-10-02", "01:00:00", "10km")
        );
    }
}
