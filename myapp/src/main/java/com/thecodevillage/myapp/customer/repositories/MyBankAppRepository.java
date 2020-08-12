package com.thecodevillage.myapp.customer.repositories;


import com.thecodevillage.myapp.customer.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MyBankAppRepository {

    private JdbcTemplate jdbcTemplate;


    @Autowired
    public MyBankAppRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    public List<Customer> findAllCustomers(){
        String sql = "select * from customer";
        return jdbcTemplate.query(sql,(rs, rowNum) ->
            new Customer(
                    rs.getLong("id"),
                    rs.getString("id_number"),
                    rs.getString("full_name"))
        );
    }
}
