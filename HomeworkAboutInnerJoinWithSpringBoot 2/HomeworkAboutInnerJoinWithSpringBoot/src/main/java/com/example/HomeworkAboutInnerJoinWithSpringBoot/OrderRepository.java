package com.example.HomeworkAboutInnerJoinWithSpringBoot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {



    @Query("SELECT DISTINCT c FROM OrderEntity o JOIN CustomerEntity c ON o.customerId = c.id")
    List<CustomerEntity> findCustomersWithOrders();


    @Query("SELECT o FROM OrderEntity o " +
            "JOIN CustomerEntity c ON o.customerId = c.id " +
            "JOIN ProductEntity p ON o.productId = p.id " +
            "WHERE c.name = :customerName " +
            "AND c.surname = :customerSurname " +
            "AND p.name = :productName " +
            "AND p.price = :productPrice")
    List<OrderEntity> findOrdersByCustomerAndProduct(@Param("customerName") String customerName,
                                                     @Param("customerSurname") String customerSurname,
                                                     @Param("productName") String productName,
                                                     @Param("productPrice") int productPrice);
}


