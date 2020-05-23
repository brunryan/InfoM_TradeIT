package ch.zhaw.infm.springboottemplate.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.infm.springboottemplate.entities.Bank;

public interface BankRepository extends JpaRepository<Bank, Long> {

List<Bank> findAllByOrderByName();

Optional<Bank> findByName(String name);

}