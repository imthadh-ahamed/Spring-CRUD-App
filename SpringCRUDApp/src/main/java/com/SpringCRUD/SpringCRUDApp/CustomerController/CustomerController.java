package com.SpringCRUD.SpringCRUDApp.CustomerController;

//Annotation import libraries
import com.SpringCRUD.SpringCRUDApp.DTO.CustomerDTO;
import com.SpringCRUD.SpringCRUDApp.DTO.CustomerSaveDTO;
import com.SpringCRUD.SpringCRUDApp.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Annotations

@RestController //used to create RESTful web services(GET, UPDATE, DELETE...)
@CrossOrigin //Getting request from the webpage
@RequestMapping("api/v1/customer") //used to map web requests to specific handler methods or controller classes
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO customersaveDTO) {
        String ID = customerService.addCustomer(customersaveDTO);
        return ID;

    }

}
