package com.thecodevillage.myapp.service;

import com.thecodevillage.myapp.customer.models.Customer;
import com.thecodevillage.myapp.pojo.CustomerUploadReq;
import com.thecodevillage.myapp.pojo.GenericResponse;

import java.util.List;

public interface BankService {
    GenericResponse getCustomers();

    GenericResponse getCustomersManual();

    Customer getCustomerByIdNumber(String idNumber);

    GenericResponse saveCustomer(Customer customer);

    GenericResponse getCustomerById(Long id);

    GenericResponse updateCustomer(Customer customer);

    GenericResponse updateCustomerBulk(CustomerUploadReq customerUploadReq);



}
