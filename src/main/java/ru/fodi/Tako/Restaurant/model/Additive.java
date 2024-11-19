package ru.fodi.Tako.Restaurant.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "addditive", schema = "public", catalog = "Tako")
public class Additive {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_additive")
    private long idAdditive;
    @Column(name = "name_additive")
    private String nameAdditive;
    @Column(name = "price_additive")
    private double priceAdditive;
}
