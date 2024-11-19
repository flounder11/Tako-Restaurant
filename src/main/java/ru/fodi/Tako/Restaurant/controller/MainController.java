package ru.fodi.Tako.Restaurant.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.fodi.Tako.Restaurant.dal.DataAccessLayer;
import ru.fodi.Tako.Restaurant.model.*;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/unautorized")
@Slf4j
public class MainController {
    private final DataAccessLayer dataAccessLayer;

    public MainController(DataAccessLayer dataAccessLayer) {
        this.dataAccessLayer = dataAccessLayer;
    }

    @PostMapping("/create/client")
    public ResponseEntity<String> createClient(@RequestBody Client client) {
        dataAccessLayer.createClient(client);
        return ResponseEntity.ok("Client created");
    }

    @PostMapping("/create/additive")
    public ResponseEntity<String> createAdditive(@RequestBody Additive additive) {
        dataAccessLayer.createAdditive(additive);
        return ResponseEntity.ok("Additive created");
    }

    @PostMapping("/create/menu")
    public ResponseEntity<String> createMenu(@RequestBody Menu menu) {
        dataAccessLayer.createMenu(menu);
        return ResponseEntity.ok("Menu created");
    }

    @PostMapping("/create/order")
    public ResponseEntity<String> createOrder(@RequestBody Order order) {
        dataAccessLayer.createOrder(order);
        return ResponseEntity.ok("Order created");
    }

    @PostMapping("/create/product")
    public ResponseEntity<String> createPublic(@RequestBody Product product) {
        dataAccessLayer.createProduct(product);
        return ResponseEntity.ok("Product created");
    }
}
