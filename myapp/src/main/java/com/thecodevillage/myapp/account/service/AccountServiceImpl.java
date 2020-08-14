package com.thecodevillage.myapp.account.service;

import com.thecodevillage.myapp.account.repositories.AccountRepository;
import com.thecodevillage.myapp.customer.models.Account;
import com.thecodevillage.myapp.customer.models.Customer;
import com.thecodevillage.myapp.customer.repositories.CurrencyRepository;
import com.thecodevillage.myapp.customer.repositories.CustomerRepository;
import com.thecodevillage.myapp.customer.repositories.MyBankAppRepository;
import com.thecodevillage.myapp.pojo.CustomerUploadReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    private CustomerRepository customerRepository;
    private CurrencyRepository currencyRepository;
    private MyBankAppRepository myBankAppRepository;
    private AccountRepository accountRepository;


    @Autowired
    public AccountServiceImpl(CustomerRepository customerRepository,
                              CurrencyRepository currencyRepository, MyBankAppRepository myBankAppRepository,
                              AccountRepository accountRepository) {
        this.customerRepository = customerRepository;
        this.currencyRepository = currencyRepository;
        this.myBankAppRepository = myBankAppRepository;
        this.accountRepository = accountRepository;

    }

    @Override
    public List<Account> getAccounts() {
        return null;
    }

    @Override
    public List<Account> getCustomerAccountsByCustomerId(String customerId) {
        return null;
    }

    @Override
    public Account saveAccount(Account account) {

        return accountRepository.save(account);
//        Optional<Customer> optionalCustomer=customerRepository.findById(account.getCustomer().getId());
//        if (optionalCustomer.isPresent())
//            return accountRepository.save(account);
//        return null;
    }
}
