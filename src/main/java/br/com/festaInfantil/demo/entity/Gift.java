package br.com.festaInfantil.demo.entity;

import br.com.festaInfantil.demo.enums.GiftStatus;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Gift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Double price;

    @ManyToOne
    @JoinColumn(name = "gift_list_id", nullable = false)
    private GiftList giftList;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GiftStatus status;
}


