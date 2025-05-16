package me.sathish.graphqlrecipe.garminruns;

import jakarta.persistence.*;
import me.sathish.graphqlrecipe.runner.Runner;
@Entity
@Table(name="garmin_runs")
public class GarminRun {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private String date;
    private String duration;
    private String distance;
    @ManyToOne
    private Runner runnerUser;

    public GarminRun(String name, String description,
                     String date, String duration, String distance,
                     Runner runnerUser) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.duration = duration;
        this.distance = distance;
        this.runnerUser = runnerUser;
    }

    public GarminRun() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
