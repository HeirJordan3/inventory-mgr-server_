package com.codedifferently.inventorymgrserver.domain.inventoryItem.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // JPA tp save to DB
@NoArgsConstructor // will generate non arg constructor
@RequiredArgsConstructor // generate our parameterized constructor
@Data // genenrate our getters and setters
public class InventoryItem {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String description;
    @NonNull
    private String category;
    @NonNull
    private String dateTime;

    public String toString(){
        return String.format("%d %s %s %s %s", id,name,description,category,dateTime);
    }
}
