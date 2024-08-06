// src/main/java/com/growlogic/eeko/subscription_service/service/CouponService.java
package com.growlogic.eeko.subscription_service.service;

import com.growlogic.eeko.subscription_service.entity.Coupon;
import com.growlogic.eeko.subscription_service.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class CouponService {
    @Autowired
    private CouponRepository couponRepository;

    public Coupon createCoupon(Coupon coupon) {
        coupon.setCreatedAt(LocalDateTime.now());
        coupon.setUpdatedAt(LocalDateTime.now());
        return couponRepository.save(coupon);
    }

    public Optional<Coupon> getCouponById(Long id) {
        return couponRepository.findById(id);
    }

    public Coupon updateCoupon(Long id, Coupon couponDetails) {
        Coupon coupon = couponRepository.findById(id).orElseThrow(() -> new RuntimeException("Coupon not found"));
        coupon.setCode(couponDetails.getCode());
        coupon.setExpiryDate(couponDetails.getExpiryDate());
        coupon.setDiscountType(couponDetails.getDiscountType());
        coupon.setDiscountAmount(couponDetails.getDiscountAmount());
        coupon.setDescription(couponDetails.getDescription());
        coupon.setStatus(couponDetails.getStatus());
        coupon.setUpdatedAt(LocalDateTime.now());
        coupon.setUpdatedBy(couponDetails.getUpdatedBy());
        return couponRepository.save(coupon);
    }

    public void deleteCoupon(Long id) {
        couponRepository.deleteById(id);
    }

    public List<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }
}