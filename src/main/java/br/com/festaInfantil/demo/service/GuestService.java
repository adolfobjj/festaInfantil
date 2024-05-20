package br.com.festaInfantil.demo.service;

import br.com.festaInfantil.demo.entity.Event;
import br.com.festaInfantil.demo.entity.Guest;
import br.com.festaInfantil.demo.entity.User;
import br.com.festaInfantil.demo.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
    @Autowired
    private GuestRepository guestRepository;

    public Guest save(Guest guest) {
        return guestRepository.save(guest);
    }

    public List<Guest> findByEvent(Event event) {
        return guestRepository.findByEvent(event);
    }

    public List<Guest> findByGuest(User guest) {
        return guestRepository.findByGuest(guest);
    }
}
