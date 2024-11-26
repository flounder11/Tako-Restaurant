package ru.fodi.Tako.Restaurant.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Entity
@Data
@Table(name = "menu", schema = "public", catalog = "Tako")
public class Menu {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_menu")
    private long idMenu;
    @Column(name = "description_menu")
    private String descriptionMenu;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;
}
