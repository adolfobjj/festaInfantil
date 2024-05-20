package br.com.festaInfantil.demo.repository;

import br.com.festaInfantil.demo.entity.Event;
import br.com.festaInfantil.demo.entity.Guest;
import br.com.festaInfantil.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByEvent(Event event);
    List<Guest> findByGuest(User guest);
}
