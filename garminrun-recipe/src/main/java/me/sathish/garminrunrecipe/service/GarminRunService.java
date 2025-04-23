package me.sathish.garminrunrecipe.service;

import java.util.List;
import java.util.stream.Collectors;
import me.sathish.garminrunrecipe.data.GarminRun;
import me.sathish.garminrunrecipe.data.GarminRunMapper;
import me.sathish.garminrunrecipe.repo.GarminRunRepository;
import org.springframework.stereotype.Service;

@Service
public class GarminRunService {

    private final GarminRunRepository garminRunRepository;
    private final GarminRunMapper garminRunMapper;

    public GarminRunService(GarminRunRepository garminRunRepository, GarminRunMapper garminRunMapper) {
        this.garminRunRepository = garminRunRepository;
        this.garminRunMapper = garminRunMapper;
    }

    public List<GarminRun> getAllGarminRuns() {
        List<GarminRun> garminRuns = garminRunRepository.findAll();
        return garminRuns.stream().map(garminRunMapper::map).collect(Collectors.toList());
    }
}
