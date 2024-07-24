package com.SpringCRUD.SpringCRUDApp.DTO;

public class CustomerDTO {
    private int customerID;
    private String customerName;
    private String customerAddress;
    private int mobileNo;

    public CustomerDTO(int customerID, String customerName, String customerAddress, int mobileNo) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.mobileNo = mobileNo;
    }

    public CustomerDTO() {
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
        return "CustomerDTO{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }
}
