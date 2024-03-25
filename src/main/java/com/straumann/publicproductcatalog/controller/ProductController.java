package com.straumann.publicproductcatalog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    //TODO add endpoint url
    public ResponseEntity<List<ProductDTO>> publicProductsListing() {
        //TODO fill body method
        return ResponseEntity.notFound().build();
    }

    //TODO add endpoint url
    public ResponseEntity<ProductDTO> modifyProduct(ProductDTO modifiedProductDTO) {
        //TODO fill body method
        return ResponseEntity.notFound().build();
    }

    //TODO add endpoint url
    public ResponseEntity<ProductDTO> addProduct(ProductDTO newProductDTO) {
        //TODO fill body method
        return ResponseEntity.notFound().build();
    }

}
