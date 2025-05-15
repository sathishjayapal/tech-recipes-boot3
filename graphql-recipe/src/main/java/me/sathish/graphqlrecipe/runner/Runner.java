package me.sathish.graphqlrecipe.runner;

import jakarta.persistence.*;
import me.sathish.graphqlrecipe.garminruns.GarminRun;
import me.sathish.graphqlrecipe.stravaruns.StravaRun;

import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name="runners")
public class Runner {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;
    @OneToMany(mappedBy = "stravaRun")
    private Set<StravaRun> stravaRuns = new HashSet<>();
    @OneToMany(mappedBy = "garminRun")
    private Set<GarminRun> garminRuns = new HashSet<>();

    public Runner(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
