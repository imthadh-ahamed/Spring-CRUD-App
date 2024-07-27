package com.SpringCRUD.SpringCRUDApp.Services;

import com.SpringCRUD.SpringCRUDApp.DTO.CustomerSaveDTO;
import com.SpringCRUD.SpringCRUDApp.Entity.Customer;

public class CustomerServiceImplementation implements CustomerService {
    @Override
    public String addCustomer(CustomerSaveDTO customersaveDTO) {
        Customer customer = new Customer(
                customersaveDTO.getCustomerName(),
                customersaveDTO.getCustomerAddress(),
                customersaveDTO.getMobileNo()
        );

        return null;
    }
}
