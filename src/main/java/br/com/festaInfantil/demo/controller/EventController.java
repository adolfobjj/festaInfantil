package br.com.festaInfantil.demo.controller;

import br.com.festaInfantil.demo.entity.Event;
import br.com.festaInfantil.demo.entity.User;
import br.com.festaInfantil.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<Event> createEvent(@RequestBody Event event) {
        return ResponseEntity.ok(eventService.save(event));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Event> getEventById(@PathVariable Long id) {
        Optional<Event> event = eventService.findById(id);
        return event.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/host/{hostId}")
    public ResponseEntity<List<Event>> getEventsByHost(@PathVariable Long hostId) {
        User host = new User();
        host.setId(hostId);
        return ResponseEntity.ok(eventService.findByHost(host));
    }
}
