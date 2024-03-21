package com.straumann.publicproductcatalog.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<ProductDAO> products;

    public ProductRepository() {
        products = new ArrayList<ProductDAO>();
        products.add(new ProductDAO(1, "BLX", "Straumann", "0001", ProductCategoryDAO.IMPLANT, 250F, PriceCurrencyDAO.EUR));
        products.add(new ProductDAO(2, "BLX", "Straumann", "0002", ProductCategoryDAO.IMPLANT, 250F, PriceCurrencyDAO.EUR));
        products.add(new ProductDAO(3, "BLX", "Straumann", "0003", ProductCategoryDAO.IMPLANT, 250F, PriceCurrencyDAO.EUR));
        products.add(new ProductDAO(4, "BLX", "Straumann", "0004", ProductCategoryDAO.IMPLANT, 250F, PriceCurrencyDAO.EUR));
        products.add(new ProductDAO(5, "BLX", "Straumann", "0005", ProductCategoryDAO.IMPLANT, 250F, PriceCurrencyDAO.EUR));
        products.add(new ProductDAO(6, "BLX", "Straumann", "0006", ProductCategoryDAO.IMPLANT, 250F, PriceCurrencyDAO.EUR));
        products.add(new ProductDAO(7, "BLX", "Straumann", "0007", ProductCategoryDAO.IMPLANT, 250F, PriceCurrencyDAO.EUR));
        products.add(new ProductDAO(8, "BLX", "Straumann", "0008", ProductCategoryDAO.IMPLANT, 250F, PriceCurrencyDAO.EUR));

    }

}
