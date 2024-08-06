// src/main/java/com/growlogic/eeko/subscription_service/repository/CouponRepository.java
package com.growlogic.eeko.subscription_service.repository;

import com.growlogic.eeko.subscription_service.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}