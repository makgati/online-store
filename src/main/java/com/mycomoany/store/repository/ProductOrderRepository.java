package com.mycomoany.store.repository;

import com.mycomoany.store.domain.ProductOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.Optional;
/**
 * Spring Data  repository for the ProductOrder entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {

    Page<ProductOrder> findAllByCustomerUserLogin(String s, Pageable pageable);
    ProductOrder findOneByIdAndCustomerUserLogin(Long id, String login);

    @Override
    Optional<ProductOrder> findById(Long id);
}
