package com.example.DashboardDemo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerSerivce 
{
    private final CustomerRepository customerRepository;
    
    public CustomerSerivce(CustomerRepository customerRepository)
    {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers()
    {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Integer id)
    {
        return customerRepository.findById(id);
    }

    public Customer savCustomer(Customer customer)
    {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Integer id)
    {
        customerRepository.deleteById(id);
    }
}
