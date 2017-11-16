package com.example.demo.repositories;

import com.example.demo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderRepository extends JpaRepository<Order, Long> {

    //@Query("select o from orden o where o.latitude = :latitude")
    //Order getOrderByLatitude(@Param("latitude") Double latitude);
}
