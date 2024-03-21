package com.straumann.publicproductcatalog.repository;

import java.math.BigDecimal;

public class ProductDAO {

    private Integer id;
    private String name;
    private String brand;
    private String code;
    private ProductCategoryDAO category;
    private BigDecimal price;
    private PriceCurrencyDAO currency;
    private ProductStatusDAO status;

    public ProductDAO(Integer id, String name, String brand, String code, ProductCategoryDAO category, BigDecimal price, PriceCurrencyDAO currency) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.code = code;
        this.category = category;
        this.price = price;
        this.currency = currency;
    }
}
