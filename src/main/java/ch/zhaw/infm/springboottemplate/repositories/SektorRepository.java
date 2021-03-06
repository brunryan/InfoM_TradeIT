package ch.zhaw.infm.springboottemplate.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.infm.springboottemplate.entities.Sektor;

public interface SektorRepository extends JpaRepository<Sektor, Long> {

	List<Sektor> findAllByOrderByName();

	Optional<Sektor> findByName(String industriegebiet);

}