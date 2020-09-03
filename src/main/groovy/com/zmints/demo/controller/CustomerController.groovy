package com.zmints.demo.controller

import com.zmints.demo.domain.Customer
import com.zmints.demo.repository.CustomerRepository
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

    @Autowired CustomerRepository customerRepository

    @PostMapping()
    Customer addCustomer(@RequestBody Customer customer) {
        return null
    }

    @GetMapping("/{id}")
    Customer retrieveCustomer(@PathVariable String id ){
        return null
    }

    @GetMapping()
    Iterable<Customer> getAll() {
        return null
    }

    @DeleteMapping("/id")
    String deleteCustomerById(@PathVariable String id) {
        return null
    }

    @DeleteMapping
    String deleteAll()    {
        return null
    }
}
