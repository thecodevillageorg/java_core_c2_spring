package com.thecodevillage.myapp.pojo;

import com.thecodevillage.myapp.models.Customer;

import java.io.Serializable;
import java.util.List;

public class CustomerUploadReq implements Serializable {

    private List<Customer> customers;

    private int totalCustomer;


    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }


    /**
     {
     "totalCustomer": 20,
     "customers": [
     {
     "idNumber": "35353535535443",
     "fullName": "KimMMM"
     },
     {
     "idNumber": "039938393344",
     "fullName": "Grace JJJJJ"
     },
     {
     "idNumber": "9089FTDGHD440",
     "fullName": "Peter BBBB"
     },
     {
     "idNumber": "GHJGHJ878784478",
     "fullName": "Aron BBBBB"
     }
     ]
     }
     */
}
