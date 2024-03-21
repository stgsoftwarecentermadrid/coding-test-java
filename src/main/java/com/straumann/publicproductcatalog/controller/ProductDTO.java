package com.straumann.publicproductcatalog.controller;

public class ProductDTO {

    private Integer id;
    private String name;
    private String brand;
    private String code;
    private ProductCategoryDTO category;
    private Float price;
    private PriceCurrencyDTO currency;
    private ProductStatusDTO status;

    public ProductDTO(Integer id, String name, String brand, String code, ProductCategoryDTO category, Float price, PriceCurrencyDTO currency) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.code = code;
        this.category = category;
        this.price = price;
        this.currency = currency;
    }
}
