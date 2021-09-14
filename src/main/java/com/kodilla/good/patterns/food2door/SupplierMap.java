package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class SupplierMap {

    private Map<String,Supplier> suppliers = new HashMap<>();

    public SupplierMap(){
        fillMap();
    }

    private void fillMap(){
        Supplier glutenFreeShop = new GlutenFreeShop();
        Supplier extraFoodShop = new ExtraFoodShop();
        Supplier healthyShop = new HealthyShop();
        suppliers.put("strawberry", healthyShop);
        suppliers.put("blueberry", healthyShop);
        suppliers.put("avocado", healthyShop);
        suppliers.put("spinach", extraFoodShop);
        suppliers.put("cauliflower", extraFoodShop);
        suppliers.put("cucumber", extraFoodShop);
        suppliers.put("kiwi", glutenFreeShop);
        suppliers.put("coconut", glutenFreeShop);
        suppliers.put("pear", glutenFreeShop);
    }

    public void process(Order order){
        if(suppliers.containsKey(order.getTypeOfProduct())){
            suppliers.get(order.getTypeOfProduct()).process(order);
        }else{
            System.out.println("Your order has not fulfil");
        }
    }
}