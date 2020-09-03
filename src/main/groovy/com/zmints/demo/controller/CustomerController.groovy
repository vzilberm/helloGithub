package com.zmints.demo.controller

import com.zmints.demo.domain.Customer
import com.zmints.demo.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customer")
class CustomerController {

    @Autowired CustomerService customerService

    @PostMapping()
    Customer addCustomer(@RequestBody Customer customer) {
    }

    @GetMapping("/{id}")
    Customer retrieveCustomer(@PathVariable String id ){
    }

    @GetMapping()
    Iterable<Customer> getAll() {
    }

    @DeleteMapping("/{id}")
    String deleteCustomerById(@PathVariable String id) {
    }

    @DeleteMapping
    String deleteAll()    {
    }
}
