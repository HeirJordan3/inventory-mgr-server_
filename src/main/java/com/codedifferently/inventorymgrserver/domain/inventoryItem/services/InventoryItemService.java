package com.codedifferently.inventorymgrserver.domain.inventoryItem.services;

import com.codedifferently.inventorymgrserver.domain.core.exceptions.ItemNotFoundException;
import com.codedifferently.inventorymgrserver.domain.inventoryItem.models.InventoryItem;

import java.util.List;

public interface InventoryItemService {
    InventoryItem create (InventoryItem inventoryItem);
    InventoryItem getById(Long id) throws ItemNotFoundException;
    InventoryItem getByName(String name) throws ItemNotFoundException;
    List<InventoryItem> getAll();
    void delete(Long id);
}
