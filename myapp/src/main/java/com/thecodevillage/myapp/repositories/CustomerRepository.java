package com.thecodevillage.myapp.repositories;

import com.thecodevillage.myapp.models.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {

    //@Query("select c from Customer")
    List<Customer> findAllCustomers();

    Optional<Customer> findByIdNumber(@Param("idNumber") String idNumber);

}
