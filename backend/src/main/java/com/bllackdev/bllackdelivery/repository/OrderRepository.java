package com.bllackdev.bllackdelivery.repository;

import com.bllackdev.bllackdelivery.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
