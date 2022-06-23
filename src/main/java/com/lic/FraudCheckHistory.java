package com.lic;

import javax.persistence.*;
import java.time.LocalDateTime;


public class FraudCheckHistory {

    private Integer id;
    private Integer customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;

    public FraudCheckHistory() {
    }

    public FraudCheckHistory(Integer customerId, Boolean isFraudster, LocalDateTime createdAt) {
        this.customerId = customerId;
        this.isFraudster = isFraudster;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Boolean getFraudster() {
        return isFraudster;
    }

    public void setFraudster(Boolean fraudster) {
        isFraudster = fraudster;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "FraudCheckHistory{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", isFraudster=" + isFraudster +
                ", createdAt=" + createdAt +
                '}';
    }
}
