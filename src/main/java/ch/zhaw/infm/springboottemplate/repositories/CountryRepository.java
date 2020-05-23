package ch.zhaw.infm.springboottemplate.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.infm.springboottemplate.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

List<Country> findAllByOrderByName();

Optional<Country> findByName(String countryName);

}