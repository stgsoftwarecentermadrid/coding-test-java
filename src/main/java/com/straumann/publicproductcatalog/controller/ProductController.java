package com.straumann.publicproductcatalog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    //TODO añade url del endpoint
    public ResponseEntity<List<QualityAd>> qualityListing() {
        //TODO rellena el cuerpo del método
        return ResponseEntity.notFound().build();
    }

    //TODO añade url del endpoint
    public ResponseEntity<List<PublicAd>> publicListing() {
        //TODO rellena el cuerpo del método
        return ResponseEntity.notFound().build();
    }

    //TODO añade url del endpoint
    public ResponseEntity<Void> calculateScore() {
        //TODO rellena el cuerpo del método
        return ResponseEntity.notFound().build();
    }

}
