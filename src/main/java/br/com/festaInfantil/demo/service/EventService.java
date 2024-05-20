package br.com.festaInfantil.demo.service;

import br.com.festaInfantil.demo.entity.Event;
import br.com.festaInfantil.demo.entity.User;
import br.com.festaInfantil.demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public Event save(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> findByHost(User host) {
        return eventRepository.findByHost(host);
    }

    public Optional<Event> findById(Long id) {
        return eventRepository.findById(id);
    }
}
