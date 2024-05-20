package br.com.festaInfantil.demo.entity;

import br.com.festaInfantil.demo.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
    private Role role= Role.ANFITRIAO;

    @OneToMany(mappedBy = "host")
    private Set<Event> hostedEvents;

    @OneToMany(mappedBy = "guest")
    private Set<Guest> invitations;

    @OneToMany(mappedBy = "buyer")
    private Set<GiftList> purchasedGifts;
}
