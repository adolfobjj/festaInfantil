package br.com.festaInfantil.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
@Data
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private User host;

    @Column(nullable = false)
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String theme;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "event")
    private Set<Guest> guests;

    @OneToMany(mappedBy = "event")
    private Set<GiftList> giftList;


}
