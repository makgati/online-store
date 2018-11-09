package com.mycomoany.store.repository;

import com.mycomoany.store.domain.OrderItem;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;


/**
 * Spring Data  repository for the OrderItem entity.
 */
@SuppressWarnings("unused")
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    Page<OrderItem> findAllByOrderCustomerUserLogin(String login, Pageable
        pageable);
    OrderItem findOneByIdAndOrderCustomerUserLogin(Long id, String login);
}
