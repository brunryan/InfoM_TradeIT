package ch.zhaw.infm.springboottemplate.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.infm.springboottemplate.entities.Adresse;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {

	List<Adresse> findAllByOrderByName();

	Optional<Adresse> findByName(String ort);

}