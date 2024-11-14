package ru.fodi.Tako.Restaurant.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "order", schema = "public", catalog = "Tako")
public class Order {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_order")
    private long idOrder;
    @Column(name = "data")
    private String data;
}
