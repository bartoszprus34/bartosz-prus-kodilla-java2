package com.kodilla.good.patterns.food2door;

import java.util.Map;

public interface Supplier {

    String getName();

    void process(Order order);

}