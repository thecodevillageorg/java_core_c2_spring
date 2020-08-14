package com.thecodevillage.myapp.service;

import com.thecodevillage.myapp.customer.models.Customer;
import com.thecodevillage.myapp.pojo.CustomerUploadReq;
import com.thecodevillage.myapp.customer.repositories.CurrencyRepository;
import com.thecodevillage.myapp.customer.repositories.CustomerRepository;
import com.thecodevillage.myapp.customer.repositories.MyBankAppRepository;
import com.thecodevillage.myapp.pojo.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public GenericResponse getCustomers() {
        List<Customer> customers=customerRepository.findAllCustomers();
        if (customers.size() > 0){
            return new GenericResponse(200,"Success",customers);
        }
        return new GenericResponse(200,"No Data Found");
    }

    @Override
    public GenericResponse getCustomersManual() {
        List<Customer> customers=myBankAppRepository.findAllCustomers();
        if (customers.size() > 0){
            return new GenericResponse(200,"Success",customers);
        }
        return new GenericResponse(200,"No Data Found");
    }

    @Override
    public Customer getCustomerByIdNumber(String idNumber) {
        return null;
    }

    @Override
    public GenericResponse saveCustomer(Customer customer) {
        Customer customer1=customerRepository.save(customer);
        if (customer1.getId() > 0){
            return new GenericResponse(200,"Success",customer1.getId());
        }

        return new GenericResponse(201,"Not Saved");
    }

    @Override
    public GenericResponse getCustomerById(Long id) {

        Optional<Customer> customer=customerRepository.findById(id);
        if (customer.isPresent())
            return new GenericResponse(200,"Success",customer);
        return new GenericResponse(201,"Failed No Details found or error");
    }

    @Override
    public GenericResponse updateCustomer(Customer customer) {
        Customer customer1=customerRepository.save(customer);
        if (customer1.getId() > 0){
            return new GenericResponse(200,"Success",customer1.getId());
        }
        return new GenericResponse(201,"Not Updated");
    }

    @Override
    public GenericResponse updateCustomerBulk(CustomerUploadReq customerUploadReq) {

        try {
            for (Customer customer: customerUploadReq.getCustomers()){
                saveCustomer(customer);
            }
            return new GenericResponse(200,"Success");
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return new GenericResponse(201,"Failed to create");
    }
}
