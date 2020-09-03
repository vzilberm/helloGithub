package com.zmints.demo.service

import com.zmints.demo.domain.Customer
import com.zmints.demo.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CustomerService {

    @Autowired CustomerRepository customerRepository

    Customer getByid(Long id)   {
    }

    Iterable<Customer> getAll()   {
    }

    Customer save(Customer customer) {
    }

    void deleteById(Long id)   {
    }

    void deleteAll()    {
    }
}
