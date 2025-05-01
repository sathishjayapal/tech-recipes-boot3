package me.sathish.graphqlrecipe.repos;

import me.sathish.graphqlrecipe.data.Country;
import org.springframework.data.repository.ListCrudRepository;

public interface CountryRepo extends ListCrudRepository <Country, Long> {
    // Custom query methods can be defined here if needed

}
