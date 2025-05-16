package me.sathish.graphqlrecipe.stravaruns;

import jakarta.persistence.*;
import me.sathish.graphqlrecipe.runner.Runner;
@Entity
@Table(name="strava_runs")
public class StravaRun {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String date;
    private String duration;
    private String distance;
    @ManyToOne
    private Runner runnerUser;
    public StravaRun() {}
    public StravaRun(Integer id, String name, String date, String duration, String distance) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.duration = duration;
        this.distance = distance;
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
