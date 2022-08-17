package com.codedifferently.inventorymgrserver.domain.inventoryItem.repos;

import com.codedifferently.inventorymgrserver.domain.inventoryItem.models.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<InventoryItem,Long> {

}
