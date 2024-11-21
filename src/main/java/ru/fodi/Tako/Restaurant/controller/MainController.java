package ru.fodi.Tako.Restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
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

//    Delete

    @DeleteMapping("/delete/client/{id}")
    public ResponseEntity<String> deleteClientById(@PathVariable("id") long id) {
        dataAccessLayer.deleteClientById(id);
        return ResponseEntity.ok("Client deleted");
    }

    @DeleteMapping("/delete/additive/{id}")
    public ResponseEntity<String> deleteAdditiveById(@PathVariable("id") long id) {
        dataAccessLayer.deleteAdditiveById(id);
        return ResponseEntity.ok("Additive deleted");
    }

    @DeleteMapping("/delete/menu/{id}")
    public ResponseEntity<String> deleteMenuById(@PathVariable("id") long id) {
        dataAccessLayer.deleteMenuById(id);
        return ResponseEntity.ok("Menu deleted");
    }

    @DeleteMapping("/delete/menu/{id}")
    public ResponseEntity<String> deleteOrderById(@PathVariable("id") long id) {
        dataAccessLayer.deleteOrderById(id);
        return ResponseEntity.ok("Order deleted");
    }

    @DeleteMapping("/delete/order/{id}")
    public ResponseEntity<String> deleteProductById(@PathVariable("id") long id) {
        dataAccessLayer.deleteProductById(id);
        return ResponseEntity.ok("Product deleted");
    }

    @DeleteMapping("/delete/product/{id}")
    public ResponseEntity<String> deletePublicById(@PathVariable("id") long id) {
        dataAccessLayer.deleteProductById(id);
        return ResponseEntity.ok("Product deleted");
    }

//    Get
}
