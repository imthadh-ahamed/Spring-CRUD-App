package com.SpringCRUD.SpringCRUDApp.CustomerController;

//Annotation import libraries
import org.springframework.web.bind.annotation.*;

//Annotations

@RestController //used to create RESTful web services(GET, UPDATE, DELETE...)
@CrossOrigin //Getting request from the webpage
@RequestMapping("api/v1/customer") //used to map web requests to specific handler methods or controller classes
public class CustomerController {
    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO) {

    }

}
