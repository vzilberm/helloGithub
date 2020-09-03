package com.zmints.demo.controller

import com.zmints.demo.domain.Customer
import com.zmints.demo.service.CustomerService
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import static org.mockito.Mockito.mock
import static org.mockito.Mockito.verify
import static org.mockito.Mockito.when

class CustomerControllerTest {

    Customer customer
    CustomerController customerController
    CustomerService customerService

    @BeforeEach
    void setup()    {

        customerService = mock(CustomerService)

        customer = new Customer(
                firstName: "Viktoriya",
                lastName: "Zilbermints"
        )

        customerController = new CustomerController(
                customerService: customerService
        )

        when(customerService.getByid(1)).thenReturn(customer)
        when(customerService.save(customer)).thenReturn(customer)

    }

    @Test
    void getCustomerById()  {
        Customer result = customerController.retrieveCustomer("1")

        verify (customerService).getByid(1)
        assert result == customer
    }

    @Test
    void saveCustomer() {
        Customer result = customerController.addCustomer(customer)

        verify(customerService).save(customer)
        assert result == customer
    }

    @Test
    void deleteCustomerById()   {
        customerController.deleteCustomerById("1")

        verify(customerService).deleteById(1)
    }

    @Test
    void deleteAll()   {
        customerController.deleteAll()

        verify(customerService).deleteAll()
    }



}
