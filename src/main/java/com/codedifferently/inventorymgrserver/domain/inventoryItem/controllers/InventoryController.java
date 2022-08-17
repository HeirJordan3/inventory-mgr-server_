package com.codedifferently.inventorymgrserver.domain.inventoryItem.controllers;

import com.codedifferently.inventorymgrserver.domain.inventoryItem.models.InventoryItem;
import com.codedifferently.inventorymgrserver.domain.inventoryItem.services.InventoryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi/inventory")
public class InventoryController {

    private InventoryItemService inventoryItemService;

    @Autowired
    public InventoryController(InventoryItemService inventoryItemService) {
        this.inventoryItemService = inventoryItemService;
    }

    @GetMapping
    public ResponseEntity<List<InventoryItem>> getAll(){
        List<InventoryItem> inventoryItems = inventoryItemService.getAll();
        return new ResponseEntity<>(inventoryItems, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<InventoryItem> create (@RequestBody InventoryItem inventoryItem){
        inventoryItem = inventoryItemService.create(inventoryItem);
        return new ResponseEntity<>(inventoryItem, HttpStatus.CREATED);
    }



}
