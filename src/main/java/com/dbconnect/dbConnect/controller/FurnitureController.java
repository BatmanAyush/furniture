package com.dbconnect.dbConnect.controller;

import com.dbconnect.dbConnect.model.Furniture;
import com.dbconnect.dbConnect.repo.FurnitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class FurnitureController {

    @Autowired
    private FurnitureRepository furnitureRepository;

    @PostMapping("/saveFurniture")
    public ResponseEntity<String> saveFurniture(@RequestBody Furniture furniture) {
        furnitureRepository.save(furniture);
        return ResponseEntity.ok("Furniture saved successfully");
    }
}
