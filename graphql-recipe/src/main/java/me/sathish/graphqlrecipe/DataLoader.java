package me.sathish.graphqlrecipe;

import me.sathish.graphqlrecipe.garminruns.GarminRepo;
import me.sathish.graphqlrecipe.garminruns.GarminRun;
import me.sathish.graphqlrecipe.runner.Runner;
import me.sathish.graphqlrecipe.runner.RunnerRepo;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {
    private RunnerRepo runnerRepo;
    private GarminRepo garminRunRepo;
    public DataLoader(RunnerRepo runnerRepo, GarminRepo garminRunRepo) {
        this.runnerRepo = runnerRepo;
        this.garminRunRepo = garminRunRepo;
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {
        loadData();
    }
    private void loadData() {
        Runner runnerSathish= new Runner("John Doe", "sathishk.dot@gmail.com");
        runnerRepo.save(runnerSathish);
        garminRunRepo.saveAll(List.of(
                new GarminRun("Morning Run",
                        "5km run in the park", "2023-10-01", "00:30:00",
                        "5km",runnerRepo.getReferenceById(1L)),
                new GarminRun("Evening Run",
                        "10km run in the city", "2023-10-02", "01:00:00",
                        "10km",runnerRepo.getReferenceById(1L))));
    }
}
