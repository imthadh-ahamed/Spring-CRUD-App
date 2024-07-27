package com.SpringCRUD.SpringCRUDApp.DTO;

public class CustomerSaveDTO {
    private String customerName;
    private String customerAddress;
    private int mobileNo;

    public CustomerSaveDTO(String customerName, String customerAddress, int mobileNo) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.mobileNo = mobileNo;
    }

    public CustomerSaveDTO() {
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
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }

}
