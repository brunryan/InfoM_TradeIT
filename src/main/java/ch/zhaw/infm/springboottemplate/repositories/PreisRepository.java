package ch.zhaw.infm.springboottemplate.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.infm.springboottemplate.entities.Preis;

public interface PreisRepository extends JpaRepository<Preis, Long> {

	//NEED HELP HERE?
	
	List<Preis> findAllByOrderByName();

	Optional<Preis> findByName(String name);

}