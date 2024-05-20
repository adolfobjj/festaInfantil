package br.com.festaInfantil.demo.entity;

import br.com.festaInfantil.demo.enums.InvitationStatus;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @ManyToOne
    @JoinColumn(name = "guest_id", nullable = false)
    private User guest;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private InvitationStatus status;
}


