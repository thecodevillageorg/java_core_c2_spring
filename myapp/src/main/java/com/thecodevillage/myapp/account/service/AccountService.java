package com.thecodevillage.myapp.account.service;

import com.thecodevillage.myapp.customer.models.Account;
import com.thecodevillage.myapp.customer.models.Customer;
import com.thecodevillage.myapp.pojo.CustomerUploadReq;

import java.util.List;

public interface AccountService {
    List<Account> getAccounts();

    List<Account> getCustomerAccountsByCustomerId(String customerId);

    Account saveAccount(Account account);



}
