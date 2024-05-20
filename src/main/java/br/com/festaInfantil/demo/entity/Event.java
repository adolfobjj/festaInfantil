package br.com.festaInfantil.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.apache.catalina.User;

import java.util.Date;
import java.util.Set;

@Data
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(nullable = false)
    private String location;

    @ManyToOne
    @JoinColumn(name = "host_id", nullable = false)
    private User host;

    @OneToMany(mappedBy = "event")
    private Set<Guest> guests;

    @OneToMany(mappedBy = "event")
    private Set<GiftList> giftLists;
}
