package com.thecodevillage.myapp.service;

import com.thecodevillage.myapp.models.Customer;
import com.thecodevillage.myapp.repositories.CurrencyRepository;
import com.thecodevillage.myapp.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    private CustomerRepository customerRepository;
    private CurrencyRepository currencyRepository;


    @Autowired
    public BankServiceImpl(CustomerRepository customerRepository,CurrencyRepository currencyRepository) {
        this.customerRepository = customerRepository;
        this.currencyRepository = currencyRepository;
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAllCustomers();
    }

    @Override
    public Customer getCustomerByIdNumber(String idNumber) {
        return null;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
