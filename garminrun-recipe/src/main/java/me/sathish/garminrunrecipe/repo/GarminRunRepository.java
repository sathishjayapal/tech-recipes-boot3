package me.sathish.garminrunrecipe.repo;

import me.sathish.garminrunrecipe.data.GarminRun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarminRunRepository extends JpaRepository<GarminRun, Long> {}
