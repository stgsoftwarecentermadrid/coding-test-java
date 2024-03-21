package com.straumann.publicproductcatalog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    //TODO añade url del endpoint
    public ResponseEntity<List<ProductDTO>> publicProductsListing() {
        //TODO rellena el cuerpo del método
        return ResponseEntity.notFound().build();
    }

}
