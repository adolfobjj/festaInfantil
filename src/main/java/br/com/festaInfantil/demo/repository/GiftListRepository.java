package br.com.festaInfantil.demo.repository;

import br.com.festaInfantil.demo.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftListRepository extends JpaRepository<GiftList, Long> {
    List<GiftList> findByEvent(Event event);
}
