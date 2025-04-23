package me.sathish.garminrunrecipe.data;

import org.springframework.stereotype.Component;

@Component
public class GarminRunMapper {

    public GarminRun map(GarminRun garminRun) {
        GarminRun garminRunDto = new GarminRun();
        garminRunDto.setId(garminRun.getId());
        garminRunDto.setActivityID(garminRun.getActivityID());
        garminRunDto.setActivityDate(garminRun.getActivityDate());
        garminRunDto.setActivityType(garminRun.getActivityType());
        garminRunDto.setActivityName(garminRun.getActivityName());
        garminRunDto.setActivityDescription(garminRun.getActivityDescription());
        garminRunDto.setElapsedTime(garminRun.getElapsedTime());
        garminRunDto.setDistance(garminRun.getDistance());
        garminRunDto.setMaxHeartRate(garminRun.getMaxHeartRate());
        garminRunDto.setCalories(garminRun.getCalories());
        garminRunDto.setCreatedAt(garminRun.getCreatedAt());
        garminRunDto.setCreatedBy(garminRun.getCreatedBy());
        garminRunDto.setUpdatedAt(garminRun.getUpdatedAt());
        garminRunDto.setUpdatedBy(garminRun.getUpdatedBy());
        return garminRunDto;
    }
}
