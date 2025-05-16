package me.sathish.graphqlrecipe.common;
public record Run(Integer id, String name, String description, String date, String duration, String distance) {
    public Run (Integer id, String name, String date, String duration, String distance) {
        this(id, name, null, date, duration, distance);
    }
    public Run(Integer id, String name, String description, String date, String duration, String distance) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.duration = duration;
        this.distance = distance;
    }
}
