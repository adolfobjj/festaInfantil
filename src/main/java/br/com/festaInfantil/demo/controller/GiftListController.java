package br.com.festaInfantil.demo.controller;

import br.com.festaInfantil.demo.entity.Event;
import br.com.festaInfantil.demo.entity.GiftList;
import br.com.festaInfantil.demo.service.GiftListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gifts")
public class GiftListController {
    @Autowired
    private GiftListService giftListService;

    @PostMapping
    public ResponseEntity<GiftList> addGift(@RequestBody GiftList giftList) {
        return ResponseEntity.ok(giftListService.save(giftList));
    }

    @GetMapping("/event/{eventId}")
    public ResponseEntity<List<GiftList>> getGiftsByEvent(@PathVariable Long eventId) {
        Event event = new Event();
        event.setId(eventId);
        return ResponseEntity.ok(giftListService.findByEvent(event));
    }
}
