package com.thecodevillage.myapp.customer.repositories;

import com.thecodevillage.myapp.customer.models.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {

    //@Query("select c from Customer")
    List<Customer> findAllCustomers();

    Optional<Customer> findByIdNumber(@Param("idNumber") String idNumber);

}
