package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    private ArrayList<String> bagels;
    private int basketLimit = 2;
    private int numberOfBaskets = 10;

    public Basket() {
        this.bagels = new ArrayList<>();

    }

    public boolean addBagel(String bagelType) {
        if (bagels.size() < basketLimit) {
            bagels.add(bagelType);

            return true;
        }
        return false;
    }


    public boolean removeBagel(String bagelType) {
        if (bagels.contains(bagelType)){
            bagels.remove(bagelType);

            return true;
        }
        return false;
    }



}
