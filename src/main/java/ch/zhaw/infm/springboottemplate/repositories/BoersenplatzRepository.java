package ch.zhaw.infm.springboottemplate.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.infm.springboottemplate.entities.Boersenplatz;

public interface BoersenplatzRepository extends JpaRepository<Boersenplatz, Long> {

List<Boersenplatz> findAllByOrderByName();

Optional<Boersenplatz> findByName(String name);

}