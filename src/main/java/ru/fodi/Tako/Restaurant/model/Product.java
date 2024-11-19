package ru.fodi.Tako.Restaurant.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "product", schema = "public", catalog = "Tako")
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_product")
    private long productId;
    @Column(name = "name_product")
    private String nameProduct;
    @Column(name = "price_product")
    private double priceProduct;
    @Column(name = "description_product")
    private String descriptionProduct;

    @ManyToOne
    @JoinColumn(name = "id_additive")
    private Additive additive;
}
