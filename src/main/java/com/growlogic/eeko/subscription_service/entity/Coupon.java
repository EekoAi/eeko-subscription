// src/main/java/com/growlogic/eeko/subscription_service/model/Coupon.java
package com.growlogic.eeko.subscription_service.entity;


import com.growlogic.eeko.subscription_service.enums.DiscountType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private LocalDateTime expiryDate;
    
    @Enumerated(EnumType.STRING)
    private DiscountType discountType = DiscountType.PERCENT; // Default value is PERCENT
    
    private Double discountAmount;
    private String description;
    private String status;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();
    private Long createdBy;
    private Long updatedBy;
}