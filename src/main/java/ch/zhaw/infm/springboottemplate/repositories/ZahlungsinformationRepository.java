package ch.zhaw.infm.springboottemplate.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.infm.springboottemplate.entities.Kreditkartenanbieter;

public interface ZahlungsinformationRepository extends JpaRepository<Kreditkartenanbieter, Long> {

List<Kreditkartenanbieter> findAllByOrderByName();

Optional<Kreditkartenanbieter> findByName(int kreditkartennr);

}