package com.bllackdev.bllackdelivery.service;

import com.bllackdev.bllackdelivery.dto.OrderDTO;
import com.bllackdev.bllackdelivery.dto.ProductDTO;
import com.bllackdev.bllackdelivery.entity.Order;
import com.bllackdev.bllackdelivery.entity.OrderStatus;
import com.bllackdev.bllackdelivery.entity.Product;
import com.bllackdev.bllackdelivery.repository.OrderRepository;
import com.bllackdev.bllackdelivery.repository.ProductRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Transactional(readOnly = true)
    public List<OrderDTO> findAll() {
        List<Order> list = orderRepository.findOrderWithProducts();
        return list.stream().map(_list -> new OrderDTO(_list)).collect(Collectors.toList());
    }

    @Transactional
    public OrderDTO insert(OrderDTO dto) {
        Order order = new Order(null, dto.getAddress(), dto.getLatitude(),
                                dto.getLongitude(), Instant.now(), OrderStatus.PENDING);
        for (ProductDTO p : dto.getProduct()) {
            Product product = productRepository.getOne(p.getId());
            order.getProducts().add(product);
        }
        order = orderRepository.save(order);
        return new OrderDTO(order);
    }


}
