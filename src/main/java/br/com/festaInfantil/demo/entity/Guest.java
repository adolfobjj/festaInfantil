package br.com.festaInfantil.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Event event;

    @ManyToOne
    @JoinColumn(nullable = false)
    private User guest;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RsvpStatus rsvpStatus;


}

enum RsvpStatus {
    CONFIRMADO, PENDENTE, RECUSADO
}
