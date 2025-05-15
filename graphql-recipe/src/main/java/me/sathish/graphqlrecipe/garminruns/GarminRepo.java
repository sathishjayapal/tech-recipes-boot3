package me.sathish.graphqlrecipe.garminruns;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarminRepo extends JpaRepository<GarminRun, Long> {
}
