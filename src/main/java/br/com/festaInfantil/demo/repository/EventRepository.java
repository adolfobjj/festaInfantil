package br.com.festaInfantil.demo.repository;

import br.com.festaInfantil.demo.entity.Event;
import br.com.festaInfantil.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByHost(User host);
}
