package com.example.becommerce.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "card", schema = "becommerce")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "card_no")
    private String cardNo;
    @Column(name = "expire_month")
    private int expireMonth;
    @Column(name = "expire_year")
    private int expireYear;
    @Column(name = "name_on_card")
    private String nameOnCard;

    @JsonBackReference
    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "member_id")
    private Member member;
}
