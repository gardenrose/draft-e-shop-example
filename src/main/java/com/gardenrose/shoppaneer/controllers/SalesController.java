package com.gardenrose.shoppaneer.controllers;

import com.gardenrose.shoppaneer.models.Sale;
import com.gardenrose.shoppaneer.models.Word;
import com.gardenrose.shoppaneer.services.WordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class SalesController {

    private final WordService wordService;

    @Autowired
    public SalesController(WordService wordService) {
        this.wordService = wordService;
    }
    
    List<Sale> sales = new ArrayList<>(Arrays.asList(
        new Sale(1, "Plant A", 10.50),
        new Sale(2, "Soil B", 5.25),
        new Sale(3, "Fertilizer C", 15.00),
        new Sale(4, "Pot D", 7.99)
    ));

    @GetMapping("/sales")
    public List<Sale> getSales() {
        return sales;
    }

    @PostMapping("/enterSale")
    public void enterSale(@RequestParam int id, @RequestParam String product, @RequestParam float amount) {
        sales.add(new Sale(id, product, amount));
    }

    @PostMapping("/enterSaleBody") 
    public void enterSaleBod(@RequestParam Sale sale) {
        sales.add(sale);
    }
    
    @GetMapping("/hello")
    public String hello() {
        System.out.println("I have a cat Bily");
        return "Hello, Spring Boot is running!";
    }

    @GetMapping("/words")
    public List<Word> getAllWords() {
        return wordService.getAllWords();
    }

}