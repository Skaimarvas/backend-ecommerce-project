package com.example.becommerce.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@Table(name = "member", schema = "becommerce")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;

    @JsonManagedReference
    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "role_id")
    private Roles roles;


    @JsonManagedReference
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Card> cards = new ArrayList<>();

    @JsonManagedReference
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Address> addresses = new ArrayList<>();

    @JsonManagedReference
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Store> stores = new ArrayList<>();

}
