package me.sathish.garminrunrecipe.data;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "garmin_runs", schema = "garminrunrecipeschema")
public class GarminRun {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "garmin_runs_seq")
    @SequenceGenerator(
            name = "garmin_runs_seq",
            sequenceName = "garminrunrecipeschema.garmin_runs_seq",
            allocationSize = 50)
    private Long id;

    @Column(nullable = false)
    private Double activityID;

    @Column(name = "activity_date", nullable = false)
    private String activityDate;

    @Column(name = "activity_type", nullable = false)
    private String activityType;

    @Column(name = "activity_name", nullable = false)
    private String activityName;

    @Column(name = "activity_description")
    private String activityDescription;

    @Column(name = "elapsed_time")
    private String elapsedTime;

    @Column(nullable = false)
    private String distance;

    @Column(name = "max_heart_rate")
    private String maxHeartRate;

    private String calories;

    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;

    @Column(name = "created_by", nullable = false, length = 40)
    private String createdBy;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "updated_by", length = 40)
    private String updatedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getActivityID() {
        return activityID;
    }

    public void setActivityID(Double activityID) {
        this.activityID = activityID;
    }

    public String getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription;
    }

    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getMaxHeartRate() {
        return maxHeartRate;
    }

    public void setMaxHeartRate(String maxHeartRate) {
        this.maxHeartRate = maxHeartRate;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
