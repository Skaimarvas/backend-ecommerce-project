package com.example.becommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "roles", schema = "becommerce")
public class Roles {

    private long id;
    private String name;
    private String code;

}
