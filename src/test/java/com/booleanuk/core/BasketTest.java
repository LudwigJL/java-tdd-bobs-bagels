package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagelType() {
        Basket basket = new Basket();
        String bagelType = "Original";
        String bagelType2 = "Oal";
        String bagel3 = "hha";

        Assertions.assertTrue(basket.addBagel(bagelType));

    }

    @Test
    public void testRemoveBagel() {
        Basket basket = new Basket();
        basket.addBagel("Special");

        String bagelType = "Special";

        Assertions.assertFalse(basket.removeBagel(bagelType));




    }








}
