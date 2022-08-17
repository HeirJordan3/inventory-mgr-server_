package com.codedifferently.inventorymgrserver.domain.inventoryItem.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InventoryTest {

    @Test
    public void constructorTest01(){
        InventoryItem inventoryItem = new InventoryItem("Diapers","This is some diapers","Baby", "08172022");
        inventoryItem.setId(1L);

        String expected = "1 Diapers This is some diapers Baby 08172022";
        String actual = inventoryItem.toString();

        Assertions.assertEquals(expected,actual);

    }

}
