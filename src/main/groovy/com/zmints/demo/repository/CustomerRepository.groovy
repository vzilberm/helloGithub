package com.zmints.demo.repository

import com.zmints.demo.domain.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository extends CrudRepository<Customer, Long> {

}
