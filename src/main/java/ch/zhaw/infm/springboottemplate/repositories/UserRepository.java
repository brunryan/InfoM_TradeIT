package ch.zhaw.infm.springboottemplate.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.infm.springboottemplate.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findAllByOrderByName();

	Optional<User> findByName(String name);

}