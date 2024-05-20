package br.com.festaInfantil.demo.entity;

import br.com.festaInfantil.demo.enums.Role;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @OneToMany(mappedBy = "host")
    private Set<Event> hostedEvents;

    @OneToMany(mappedBy = "guest")
    private Set<Guest> invitations;

    @OneToMany(mappedBy = "buyer")
    private Set<GiftList> purchasedGifts;
}
