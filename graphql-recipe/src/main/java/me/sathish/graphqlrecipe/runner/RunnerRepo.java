package me.sathish.graphqlrecipe.runner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RunnerRepo extends JpaRepository<Runner, Long> {

}
