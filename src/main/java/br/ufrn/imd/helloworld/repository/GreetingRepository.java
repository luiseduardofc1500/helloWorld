package br.ufrn.imd.helloworld.repository;

import br.ufrn.imd.helloworld.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}
