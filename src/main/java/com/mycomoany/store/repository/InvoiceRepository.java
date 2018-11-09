package com.mycomoany.store.repository;

import com.mycomoany.store.domain.Invoice;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;


/**
 * Spring Data  repository for the Invoice entity.
 */
@SuppressWarnings("unused")
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    Page<Invoice> findAllByOrderCustomerUserLogin(String login, Pageable
        pageable);
    Invoice findOneByIdAndOrderCustomerUserLogin(Long id, String login);
}
