package com.zmints.demo.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Customer {
    @Id
    @GeneratedValue
    Long id = null

    String firstName = ""
    String lastName = ""
}
