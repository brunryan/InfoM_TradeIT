package ch.zhaw.infm.springboottemplate.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.infm.springboottemplate.entities.Art;

public interface ArtRepository extends JpaRepository<Art, Long> {

List<Art> findAllByOrderByName();

Optional<Art> findByName(String name);

}