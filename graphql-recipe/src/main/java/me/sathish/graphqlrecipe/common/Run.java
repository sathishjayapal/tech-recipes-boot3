package me.sathish.graphqlrecipe.common;
public record Run(Integer id, String name, String description, String date, String duration, String distance, String runnerName) {
    public  Run (Integer id, String name, String date, String duration, String distance, String runnerName) {
        this(id, name, null, date, null, distance, runnerName);
    }
    public Run(Integer id, String name, String description, String date, String duration, String distance, String runnerName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.duration = duration;
        this.distance = distance;
        this.runnerName = runnerName;
    }
}
