package br.com.festaInfantil.demo.controller;

import br.com.festaInfantil.demo.entity.Event;
import br.com.festaInfantil.demo.entity.Guest;
import br.com.festaInfantil.demo.entity.User;
import br.com.festaInfantil.demo.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guests")
public class GuestController {
    @Autowired
    private GuestService guestService;

    @PostMapping
    public ResponseEntity<Guest> inviteGuest(@RequestBody Guest guest) {
        return ResponseEntity.ok(guestService.save(guest));
    }

    @GetMapping("/event/{eventId}")
    public ResponseEntity<List<Guest>> getGuestsByEvent(@PathVariable Long eventId) {
        Event event = new Event();
        event.setId(eventId);
        return ResponseEntity.ok(guestService.findByEvent(event));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Guest>> getGuestsByUser(@PathVariable Long userId) {
        User user = new User();
        user.setId(userId);
        return ResponseEntity.ok(guestService.findByGuest(user));
    }
}
