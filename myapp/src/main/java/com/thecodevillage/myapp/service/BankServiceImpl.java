package com.thecodevillage.myapp.service;

import com.thecodevillage.myapp.models.Customer;
import com.thecodevillage.myapp.pojo.CustomerUploadReq;
import com.thecodevillage.myapp.repositories.CurrencyRepository;
import com.thecodevillage.myapp.repositories.CustomerRepository;
import com.thecodevillage.myapp.repositories.MyBankAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    private CustomerRepository customerRepository;
    private CurrencyRepository currencyRepository;
    private MyBankAppRepository myBankAppRepository;


    @Autowired
    public BankServiceImpl(CustomerRepository customerRepository,CurrencyRepository currencyRepository,MyBankAppRepository myBankAppRepository) {
        this.customerRepository = customerRepository;
        this.currencyRepository = currencyRepository;
        this.myBankAppRepository = myBankAppRepository;

    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAllCustomers();
    }

    @Override
    public List<Customer> getCustomersManual() {
        return myBankAppRepository.findAllCustomers();
    }

    @Override
    public Customer getCustomerByIdNumber(String idNumber) {
        return null;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return saveCustomer(customer);
    }

    @Override
    public CustomerUploadReq updateCustomerBulk(CustomerUploadReq customerUploadReq) {
        for (Customer customer: customerUploadReq.getCustomers()){
            saveCustomer(customer);
        }
        return customerUploadReq;
    }
}
