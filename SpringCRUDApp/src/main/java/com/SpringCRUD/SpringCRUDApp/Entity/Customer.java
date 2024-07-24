package com.SpringCRUD.SpringCRUDApp.Entity;

import jakarta.persistence.*;

@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "customer_id", length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerID;

    @Column(name = "customer_name", length = 30)
    private String customerName;

    @Column(name = "customer_address", length = 50)
    private String customerAddress;
    @Column(name = "customer_mobile", length = 12)
    private int mobileNo;

    public Customer(int customerID, String customerName, String customerAddress, int mobileNo) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.mobileNo = mobileNo;
    }

    public Customer() {
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }
}
