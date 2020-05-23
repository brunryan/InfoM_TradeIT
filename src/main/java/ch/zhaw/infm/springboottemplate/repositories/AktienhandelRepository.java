package ch.zhaw.infm.springboottemplate.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.infm.springboottemplate.entities.Aktienhandel;

public interface AktienhandelRepository extends JpaRepository<Aktienhandel, Long> {

	
	//NEED HELP HERE?
	List<Aktienhandel> findAllByOrderByName();

	Optional<Aktienhandel> findByName(String name);

}