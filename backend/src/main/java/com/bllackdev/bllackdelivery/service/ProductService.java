package com.bllackdev.bllackdelivery.service;

import com.bllackdev.bllackdelivery.dto.ProductDTO;
import com.bllackdev.bllackdelivery.entity.Product;
import com.bllackdev.bllackdelivery.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> list = productRepository.findAllByOrderByNameAsc();
        return list.stream().map(_list -> new ProductDTO(_list)).collect(Collectors.toList());
    }
}
