package com.thecodevillage.myapp.account.repositories;

import com.thecodevillage.myapp.customer.models.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AccountRepository extends PagingAndSortingRepository<Account,Long> {

    //named query
    //Optional<Account> findByCustomerId(@Param("customerId") Long customerId,@Param("accountId") Long accountId);



    @Query("select a from Account a where a.accountNumber = :accountNumber")
    Optional<Account> findByAccountNumber(@Param("accountNumber") Long customerId);

}
