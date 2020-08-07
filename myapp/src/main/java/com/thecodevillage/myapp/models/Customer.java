package com.thecodevillage.myapp.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customer")
@NamedQueries({
     @NamedQuery(name = "Customer.findAllCustomers",query = "select c from Customer c")
})
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String idNumber;

    private String fullName;

    public Customer() {
    }

    public Customer(Long id, String idNumber, String fullName) {
        this.id = id;
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
