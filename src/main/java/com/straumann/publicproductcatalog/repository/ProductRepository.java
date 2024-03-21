package com.straumann.publicproductcatalog.repository;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<ProductDAO> products;

    public ProductRepository() {
        products = new ArrayList<ProductDAO>();
        products.add(new ProductDAO(1, "Implante BLX, Ø 3.75mm RB, SLActive® 10mm, Roxolid®", "Straumann", "061.4310", ProductCategoryDAO.IMPLANT, new BigDecimal("259.99"), PriceCurrencyDAO.EUR));
        products.add(new ProductDAO(2, "Implante TLX SP, Ø 4.5MM NT, SLA® 6MM, ROXOLID®", "Straumann", "035.2406S", ProductCategoryDAO.IMPLANT, new BigDecimal("185.20"), PriceCurrencyDAO.EUR));
        products.add(new ProductDAO(3, "Implante Axiom® TL PX Ø3.4 x 8 N1.5", "Anthogyr", "TPX34080N1", ProductCategoryDAO.IMPLANT, new BigDecimal("151.78"), PriceCurrencyDAO.EUR));
        products.add(new ProductDAO(4, "RC STRAUMANN® VARIOBASE® C, GH 1 MM, TAN", "Straumann", "022.0044", ProductCategoryDAO.ABUTMENT, new BigDecimal("89.90"), PriceCurrencyDAO.EUR));
        products.add(new ProductDAO(5, "PRO RESIN, MODEL X, MODELO DENTAL - BEIGE OSCURO", "Straumann", "019.3210", ProductCategoryDAO.RESTORATIVE_MATERIAL, new BigDecimal("102.50"), PriceCurrencyDAO.EUR));
        products.add(new ProductDAO(6, "Pilar de bola - Axiom® BL - AG 1.5 mm", "Anthogyr", "AXDA015", ProductCategoryDAO.ABUTMENT, new BigDecimal("78.45"), PriceCurrencyDAO.EUR));
        products.add(new ProductDAO(7, "Implante Helix GM, Titanium, 3.5X10 mm", "Neodent", "109.944", ProductCategoryDAO.IMPLANT, new BigDecimal("164.20"), PriceCurrencyDAO.EUR));
        products.add(new ProductDAO(8, "Análogo del implante / D 3,5", "Medentika", "R 50", ProductCategoryDAO.IMPLANT, new BigDecimal("155.20"), PriceCurrencyDAO.EUR));
    }

}
