package com.funian.model;
import java.io.Serializable;
import org.springframework.stereotype.Component;


@Component
public class BusinessShopEntity implements Serializable{

    private int businessId;
    private String businessName;
    private String businessPhoneNumber;

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return this.businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessPhoneNumber() {
        return this.businessPhoneNumber;
    }

    public void setBusinessPhoneNumber(String businessPhoneNumber) {
        this.businessPhoneNumber = businessPhoneNumber;
    }

    public String toString() {
        return this.businessId + " " + this.businessName + " " + this.businessPhoneNumber;
    }

}
