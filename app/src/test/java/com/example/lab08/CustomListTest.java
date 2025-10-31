package com.example.lab08; // <-- match your app's actual package

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    private CustomList makeEmptyList() {
        return new CustomList(null, new java.util.ArrayList<City>());
    }

    @Test
    public void testHasCity() {
        CustomList list = makeEmptyList();
        City calgary = new City("Calgary", "AB");

        assertFalse(list.hasCity(calgary));

        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }
}
