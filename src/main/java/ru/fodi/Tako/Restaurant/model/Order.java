package ru.fodi.Tako.Restaurant.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

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

    @OneToMany
    @JoinColumn(name = "id_client")
    private Collection<Client> client;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;
}
