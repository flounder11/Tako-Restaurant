package ru.fodi.Tako.Restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.fodi.Tako.Restaurant.dal.DataAccessLayer;
import ru.fodi.Tako.Restaurant.model.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:8080/")
@RequestMapping("/unauthorized")
public class MainController {
    private DataAccessLayer dataAccessLayer;
    @Autowired
    public MainController(DataAccessLayer dataAccessLayer) {
        this.dataAccessLayer = dataAccessLayer;
    }

//    @GetMapping("/get/client")
//    public ResponseEntity getClient(){
//        return ResponseEntity.ok(DataAccessLayer.getClient());
//    }

    @PostMapping("/create/client")
    public ResponseEntity<String> createClient(@RequestBody Client client) {
        dataAccessLayer.createClient(client);
        return ResponseEntity.ok("Client created");
    }
}
