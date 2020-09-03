package com.zmints.demo.service

import com.zmints.demo.domain.Customer
import com.zmints.demo.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CustomerService {

    @Autowired CustomerRepository customerRepository

    Customer getByid(Long id)   {
        customerRepository.findById(id).get()
    }

    Iterable<Customer> getAll()   {
        customerRepository.findAll()
    }

    Customer save(Customer customer) {
        customerRepository.save(customer)
    }

    void deleteById(Long id)   {
        customerRepository.deleteById(id)
    }

    void deleteAll()    {
        customerRepository.deleteAll()
    }
}
