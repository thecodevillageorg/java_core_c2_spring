package com.thecodevillage.myapp.customer.models;


import javax.persistence.*;

@Entity
@Table(name = "account")
//@NamedQueries({
//        @NamedQuery(name = "Account.findByCustomerId",query = "select a from Account a where a.customer_id= :customerId and a.id= :accountId")
//})
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(insertable = false,updatable = false)
    private Long id;

    private String accountNumber;

    private Long accountType;

    //foreign keys
    //@ManyToOne(optional = false,fetch = FetchType.LAZY)
    //@JoinColumn(name = "customer_id",referencedColumnName = "id")
    private Customer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getAccountType() {
        return accountType;
    }

    public void setAccountType(Long accountType) {
        this.accountType = accountType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
