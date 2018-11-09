package com.mycomoany.store.repository;

import com.mycomoany.store.domain.Shipment;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;


/**
 * Spring Data  repository for the Shipment entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
    Page<Shipment> findAllByInvoiceOrderCustomerUserLogin(String login, Pageable pageable);
    Shipment findOneByIdAndInvoiceOrderCustomerUserLogin(Long id, String
        login);
}
