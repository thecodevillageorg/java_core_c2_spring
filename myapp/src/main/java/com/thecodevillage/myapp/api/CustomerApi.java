package com.thecodevillage.myapp.api;


import com.thecodevillage.myapp.models.Customer;
import com.thecodevillage.myapp.pojo.CustomerUploadReq;
import com.thecodevillage.myapp.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerApi {
    private BankService bankService;

    @Autowired
    public CustomerApi(BankService bankService) {
        this.bankService = bankService;
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public ResponseEntity getAllCustomers(){
        System.out.println("Customer API Called# ");
        Customer customer=new Customer(1L,"6646464","John");
        Customer customer1=new Customer(2L,"778827","Grace");
        Customer customer2=new Customer(3L,"90890","Peter");
        Customer customer3=new Customer(3L,"GHJGHJ","Aron");
        List<Customer> customers=new ArrayList<>();
        customers.add(customer);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        System.out.println("Total Customers # "+customers.size());
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }


    @RequestMapping(value = "/all/db",method = RequestMethod.GET)
    public ResponseEntity getAllCustomersFromDb(){
        System.out.println("Customer API FROM DB Called# ");
        List<Customer> customers=bankService.getCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @RequestMapping(value = "/all/db/manual",method = RequestMethod.GET)
    public ResponseEntity getAllCustomersFromDbManual(){
        System.out.println("Customer API FROM DB Manual Called# ");
        List<Customer> customers=bankService.getCustomersManual();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }


    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseEntity createCustomer(@RequestBody Customer customer){
        System.out.println("Customer Save Customer in DB Called# ");

        System.out.println("Name: "+customer.getFullName());
        return new ResponseEntity<>(bankService.saveCustomer(customer), HttpStatus.OK);
    }


    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ResponseEntity updateCustomer(@RequestBody Customer customer){
        System.out.println("Update Customer in DB Called# ");
        return new ResponseEntity<>(bankService.updateCustomer(customer), HttpStatus.OK);
    }

    @RequestMapping(value = "/update/bulk",method = RequestMethod.POST)
    public ResponseEntity updateCustomerBulk(@RequestBody CustomerUploadReq customerUploadReq){
        System.out.println("Update Customer in DB Called# ");
        return new ResponseEntity<>(bankService.updateCustomerBulk(customerUploadReq), HttpStatus.OK);
    }

}



