package br.com.festaInfantil.demo.service;

import br.com.festaInfantil.demo.entity.Event;
import br.com.festaInfantil.demo.repository.GiftListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiftListService {
    @Autowired
    private GiftListRepository giftListRepository;

    public GiftList save(GiftList giftList) {
        return giftListRepository.save(giftList);
    }

    public List<GiftList> findByEvent(Event event) {
        return giftListRepository.findByEvent(event);
    }
}
