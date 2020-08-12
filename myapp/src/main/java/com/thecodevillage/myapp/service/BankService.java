package com.thecodevillage.myapp.service;

import com.thecodevillage.myapp.customer.models.Customer;
import com.thecodevillage.myapp.pojo.CustomerUploadReq;

import java.util.List;

public interface BankService {
    List<Customer> getCustomers();

    List<Customer> getCustomersManual();

    Customer getCustomerByIdNumber(String idNumber);

    Customer saveCustomer(Customer customer);


    Customer updateCustomer(Customer customer);

    CustomerUploadReq updateCustomerBulk(CustomerUploadReq customerUploadReq);



}
