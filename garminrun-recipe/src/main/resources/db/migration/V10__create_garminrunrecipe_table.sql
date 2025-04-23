CREATE SCHEMA garminrunrecipeschema;
create sequence garminrunrecipeschema.garmin_runs_seq start with 1 increment by 50;
CREATE TABLE IF NOT EXISTS garminrunrecipeschema.garmin_runs
(
    id                   bigint      DEFAULT nextval('garminrunrecipeschema.garmin_runs_seq') not null,
    activityID           numeric                                        not null,
    activity_date        text                                          not null,
    activity_type        text                                          not null,
    activity_name        text                                             not null,
    activity_description text,
    elapsed_time         text,
    distance             text                                          not null,
    max_heart_rate       text,
    calories             text                                          ,
    created_at           timestamp                                          NOT NULL,
    created_by           varchar(40)                                   NOT NULL,
    updated_at           timestamp        DEFAULT NULL,
    updated_by           varchar(40) DEFAULT NULL,
    primary key (id)
);