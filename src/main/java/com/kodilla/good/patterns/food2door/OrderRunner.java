package com.kodilla.good.patterns.food2door;

public class OrderRunner {
    public static void main(String[] args) {

        Order order1 = new Order("strawberry", 5, 305);
        Order order2 = new Order("coconut", 4,703);
        Order order3 = new Order("apple", 5,1083);

        SupplierMap supplierRetriever = new SupplierMap();
        supplierRetriever.process(order1);
        supplierRetriever.process(order2);
        supplierRetriever.process(order3);
    }
}