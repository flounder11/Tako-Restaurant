package ru.fodi.Tako.Restaurant.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "client", schema = "public", catalog = "Tako")
public class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_client")
    private long idClient;
    @Column(name = "name_client")
    private String nameClient;
    @Column(name = "phone_client")
    private String phoneClient;
    @Column(name = "email_client")
    private String emailClient;

    @ManyToOne
    @JoinColumn(name = "id_order")
    private Order order;
}
