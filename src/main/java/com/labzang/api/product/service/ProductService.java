package com.labzang.api.product.service;

import java.util.List;

import com.labzang.api.common.domain.Messenger;
import com.labzang.api.product.domain.ProductDTO;
import com.labzang.api.product.repository.ProductRepository;

public interface ProductService {

    
    Messenger save(ProductDTO product);
    Messenger saveAll(List<ProductDTO> products);
    Messenger update(ProductDTO product);
    Messenger delete(String id);
    Messenger findById(String id);
    Messenger findAll();
}
