package me.sathish.graphqlrecipe.garminruns;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import me.sathish.graphqlrecipe.runner.Runner;

public class GarminRun {
    @Id
    @GeneratedValue
    private String id;
    private String name;
    private String description;
    private String date;
    private String duration;
    private String distance;
    @ManyToOne
    private Runner runnerUser;

    public GarminRun(String id, String name, String description, String date, String duration, String distance, Runner runnerUser) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.duration = duration;
        this.distance = distance;
        this.runnerUser = runnerUser;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
