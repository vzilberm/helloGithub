package com.zmints.demo.controller

import com.zmints.demo.domain.Customer
import com.zmints.demo.service.CustomerService
import groovy.util.logging.Slf4j
import org.codehaus.groovy.util.StringUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
@RequestMapping("/customer")
class CustomerController {

    @Autowired CustomerService customerService

    @PostMapping()
    Customer addCustomer(@RequestBody Customer customer) {
         customerService.save(customer)
    }

    @GetMapping("/{id}")
    Customer retrieveCustomer(@PathVariable String id ){
        if (id.isNumber()){
            return customerService.getByid(id.toLong())
        }
        log.info("The id provided can not be converted to Long required by service!")
        null
    }

    @GetMapping()
    Iterable<Customer> getAll() {
        customerService.getAll()
    }

    @DeleteMapping("/{id}")
    String deleteCustomerById(@PathVariable String id) {
        if(id.isNumber()){
            customerService.deleteById(id.toLong())
            return "Customer with ${id} was deleted from repository."
        }
        log.info("The id provided can not be converted to Long required by service!")
        ""
    }

    @DeleteMapping
    String deleteAll()    {
        customerService.deleteAll()
        "All customers deleted from database."
    }
}
