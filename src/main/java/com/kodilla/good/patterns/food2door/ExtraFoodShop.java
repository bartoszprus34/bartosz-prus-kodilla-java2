package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Supplier {

    private String name;
    private final Map<String, Integer> depotOfExtraFoodShop = new HashMap<>();

    public ExtraFoodShop() {
        this.name = "Extra Food Shop";
        putProductsInMap();
    }

    private void putProductsInMap() {
        depotOfExtraFoodShop.put("spinach", 5000);
        depotOfExtraFoodShop.put("cauliflower", 300);
        depotOfExtraFoodShop.put("cucumber", 1200);
    }

    private void updateDepotStatus(String product, Integer quantityOfProducts) {
        Integer depotStatus = depotOfExtraFoodShop.get(product) - quantityOfProducts;
        depotOfExtraFoodShop.put(product, depotStatus);
    }

    public String getName() {
        return name;
    }

    public void process(Order order) {
        if (depotOfExtraFoodShop.containsKey(order.getTypeOfProduct()) && depotOfExtraFoodShop.get(order.getTypeOfProduct()) >= order.getQuantity()) {
            updateDepotStatus(order.getTypeOfProduct(), order.getQuantity());
            System.out.println("Your order number is: " + order.getOrderNumber());
            System.out.println("You ordered " + order.getTypeOfProduct() + " in quantity " + order.getQuantity());
            System.out.println("Order processing in progress");
            System.out.println("Thank you for using the services \"Extra Food Shop\"");
        } else {
            System.out.println("The selected product is not available.");
        }
    }
}