package com.labzang.api.product.controller;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


import com.labzang.api.product.domain.ProductDTO;
import com.labzang.api.product.service.ProductService;

import lombok.RequiredArgsConstructor;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.labzang.api.common.domain.Messenger;

@Controller
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @PostMapping("")
    public String save(ProductDTO product, Model model) {
        Messenger messenger = productService.save(product);
        model.addAttribute("messenger", messenger);
        return "product/save";
    }

    @PostMapping("/all")
    public String saveAll(List<ProductDTO> products, Model model) {
        Messenger messenger = productService.saveAll(products);
        model.addAttribute("messenger", messenger);
        return "product/list";
    }

    @PutMapping("/{id}")
    public String update(ProductDTO product, Model model) {
        Messenger messenger = productService.update(product);
        model.addAttribute("messenger", messenger);
        return "product/detail";
    }

    @DeleteMapping("/{id}")
    public String delete(String id, Model model) {
        Messenger messenger = productService.delete(id);
        model.addAttribute("messenger", messenger);
        return "product/list";
    }

    @GetMapping("/id/{id}")
    public String findById(String id, Model model) {
        Messenger messenger = productService.findById(id);
        model.addAttribute("messenger", messenger);
        return "product/detail";
    }

    @GetMapping("/all")
    public String findAll(Model model) {
        Messenger messenger = productService.findAll();
        model.addAttribute("messenger", messenger);
        return "product/list";
    }
    
}
