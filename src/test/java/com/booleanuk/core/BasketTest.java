package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagelType() {
        Basket basket = new Basket();
        String bagelType = "Original";

        Assertions.assertTrue(basket.addBagel(bagelType));

    }

    @Test
    public void testRemoveBagel() {
        Basket basket = new Basket();
        basket.addBagel("Special");

        String bagelType = "Special";

        Assertions.assertTrue(basket.removeBagel(bagelType));

    }

    @Test
    public void testChangeBasketCapacity() {
        Basket basket = new Basket();

        basket.addBagel("Onion");
        basket.addBagel("Cheese");
        basket.addBagel("Lettuce");

        Assertions.assertTrue(basket.addBagel("Meat"));

        basket.changeBasketCapacity(10);

        Assertions.assertTrue(basket.addBagel("Plain"));
        
    }


}
