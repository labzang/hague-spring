package com.labzang.api.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.labzang.api.common.domain.Messenger;
import com.labzang.api.product.domain.ProductDTO;
import com.labzang.api.product.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Override
    public Messenger save(ProductDTO product) {
        return productRepository.save(product);
    }

    @Override
    public Messenger saveAll(List<ProductDTO> products) {
        return productRepository.saveAll(products);
    }

    @Override
    public Messenger update(ProductDTO product) {
        return productRepository.update(product);
    }

    @Override
    public Messenger delete(String id) {
        return productRepository.delete(id);
    }

    @Override
    public Messenger findById(String id) {
        return productRepository.findById(id);
    }

    @Override
    public Messenger findAll() {
        return productRepository.findAll();
    }
    
}
