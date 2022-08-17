package com.codedifferently.inventorymgrserver.domain.inventoryItem.services;

import com.codedifferently.inventorymgrserver.domain.core.exceptions.ItemNotFoundException;
import com.codedifferently.inventorymgrserver.domain.inventoryItem.models.InventoryItem;
import com.codedifferently.inventorymgrserver.domain.inventoryItem.repos.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryItemService{

    private InventoryRepository inventoryRepository;

    @Autowired
    public InventoryServiceImpl(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @Override
    public InventoryItem create(InventoryItem inventoryItem) {
        inventoryItem = inventoryRepository.save(inventoryItem);

        return inventoryItem;
    }

    @Override
    public InventoryItem getById(Long id) throws ItemNotFoundException {
        return null;
    }

    @Override
    public InventoryItem getByName(String name) throws ItemNotFoundException {
        return null;
    }

    @Override
    public List<InventoryItem> getAll() {

        return inventoryRepository.findAll();
    }

    @Override
    public void delete(Long id) {

    }
}
