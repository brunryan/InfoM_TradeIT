package ch.zhaw.infm.springboottemplate.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.infm.springboottemplate.entities.Titel;

public interface TitelRepository extends JpaRepository<Titel, Long> {

	List<Titel> findAllByOrderByName();

	Optional<Titel> findByName(String name);

}