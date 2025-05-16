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
    @OneToMany(mappedBy = "runnerUser")
    private Set<StravaRun> stravaRuns = new HashSet<>();
    @OneToMany(mappedBy = "runnerUser")
    private Set<GarminRun> garminRuns = new HashSet<>();
    @Version
    private Integer version; // Add this field for optimistic locking
    public Runner(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Runner() {

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
