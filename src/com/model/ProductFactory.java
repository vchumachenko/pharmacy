package com.model;

public final class ProductFactory {

    private ProductFactory(){

    }

    public static Product get(ProductType type){
        return switch (type){
            case ZODAK -> new Product(ProductType.ZODAK,20, 90);
            case ASPIRIN -> new Product(ProductType.ASPIRIN,60, 450);
            case NUROFEN -> new Product(ProductType.NUROFEN,12, 100);
            case MEALXEN -> new Product(ProductType.MEALXEN,100, 1000);
            case SOLPADEINE -> new Product(ProductType.SOLPADEINE,8, 90);
        };
    }
}
