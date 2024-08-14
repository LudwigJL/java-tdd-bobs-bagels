package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagelType() {
        Basket basket = new Basket();

        String bagelType = "Original";

        Assertions.assertFalse(basket.addBagel(bagelType));
    }








}
