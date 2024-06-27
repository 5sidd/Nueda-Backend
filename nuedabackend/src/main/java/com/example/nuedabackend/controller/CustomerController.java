package com.example.nuedabackend.controller;

import com.example.nuedabackend.model.Customer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

@RestController
public class CustomerController {
    private ArrayList<Customer> customers;


    public CustomerController() {
        this.customers = new ArrayList<Customer>();

        Customer customer1 = new Customer(15, "John", "Doe", "Citi", 55000, 123, 321, 650);
        Customer customer2 = new Customer(33, "Mark", "Jones", "Wells Fargo", 67000, 456, 654, 600);
        Customer customer3 = new Customer(77, "Dave", "Smith", "Bank of America", 75000, 789, 987, 700);

        this.customers.add(customer1);
        this.customers.add(customer2);
        this.customers.add(customer3);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/customers")
    public ArrayList<Customer> getAllCustomers() {
        return this.customers;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/customers/{id}")
    public Customer getIndividualCustomer(@PathVariable String id) {
        int customerId = Integer.parseInt(id);

        for (Customer customer : this.customers) {
            if (customer.getId() == customerId) {
                return customer;
            }
        }

        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "entity not found"
        );
    }

}
