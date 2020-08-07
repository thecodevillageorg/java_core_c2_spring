package com.thecodevillage.myapp.service;

import com.thecodevillage.myapp.models.Customer;

import java.util.List;

public interface BankService {
    List<Customer> getCustomers();

    Customer getCustomerByIdNumber(String idNumber);

    Customer saveCustomer(Customer customer);
}
