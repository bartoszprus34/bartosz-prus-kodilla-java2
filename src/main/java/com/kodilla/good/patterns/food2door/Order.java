package com.kodilla.good.patterns.food2door;

public class Order {

    private final int quantity;
    private final String typeOfProduct;
    private final int orderNumber;

    public Order(String typeOfProduct, int quantity, int orderNumber) {
        this.quantity = quantity;
        this.typeOfProduct = typeOfProduct;
        this.orderNumber = orderNumber;
    }
    public int getQuantity() {
        return quantity;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
}