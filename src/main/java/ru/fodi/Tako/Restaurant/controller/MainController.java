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

    @DeleteMapping("/delete/order/{id}")
    public ResponseEntity<String> deleteOrderById(@PathVariable("id") long id) {
        dataAccessLayer.deleteOrderById(id);
        return ResponseEntity.ok("Order deleted");
    }

    @DeleteMapping("/delete/product/{id}")
    public ResponseEntity<String> deleteProductById(@PathVariable("id") long id) {
        dataAccessLayer.deleteProductById(id);
        return ResponseEntity.ok("Product deleted");
    }

//    Get

    @GetMapping("/get/client/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable("id") long id){
        Client client = dataAccessLayer.getClientById(id);
        if (client == null) {
            return ResponseEntity.notFound().build();
        } else{
            return ResponseEntity.ok(client);
        }
    }

    @GetMapping("/get/additive/{id}")
    public ResponseEntity<Additive> getAdditiveById(@PathVariable("id") long id){
        Additive additive = dataAccessLayer.getAdditiveById(id);
        if (additive == null) {
            return ResponseEntity.notFound().build();
        } else{
            return ResponseEntity.ok(additive);
        }
    }

    @GetMapping("/get/menu/{id}")
    public ResponseEntity<Menu> getMenuById(@PathVariable("id") long id){
        Menu menu = dataAccessLayer.getMenuById(id);
        if (menu == null) {
            return ResponseEntity.notFound().build();
        } else{
            return ResponseEntity.ok(menu);
        }
    }

    @GetMapping("/get/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") long id){
        Product product = dataAccessLayer.getProductById(id);
        if (product == null) {
            return ResponseEntity.notFound().build();
        } else{
            return ResponseEntity.ok(product);
        }
    }

    @GetMapping("/get/order/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable("id") long id){
        Order order = dataAccessLayer.getOrderById(id);
        if (order == null) {
            return ResponseEntity.notFound().build();
        } else{
            return ResponseEntity.ok(order);
        }
    }

//    Patch

    @PatchMapping("/patch/client/{id}")
    public ResponseEntity<Client> patchClientById(@PathVariable("id") long id, @RequestBody Client client){
        Client updatedClient = dataAccessLayer.patchClientById(id, client);
        if (client == null) {
            return ResponseEntity.notFound().build();
        } else{
            return ResponseEntity.ok(client);
        }
    }
}
