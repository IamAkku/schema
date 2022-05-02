package com.dbschema.dbschema.model;


import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Table(name="csvrecords")
public class CSVrecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="record_id")
    private Long id;

    @Column(name="claim_number")
    private Integer claim_number;

    @Column(name="upload_id")
    private Integer upload_id;

    @Column(name="Production_L1")
    private String Production_L1;

    @Column(name="Production_L2")
    private String Production_L2;

    @Column(name="Narrations")
    private String Narrations;

    @Column(name="Transaction")
    private Timestamp Transaction;

    @Column(name="Customer_L1")
    private String Customer_L1;

    @Column(name="Customer_L2")
    private String Customer_L2;

    @Column(name="NCI_reason")
    private String NCI_reason;

    @Column(name="Status")
    private String Status;

    public CSVrecord () {
    }
    public CSVrecord
            (Integer claim_number, Integer upload_id, String Production_L1,
             String Production_L2, String Narrations, Timestamp Transaction,
             String Customer_L1, String Customer_L2, String NCI_reason, String Status) {
        this.claim_number = claim_number;
        this.upload_id = upload_id;
        this.Production_L1 = Production_L1;
        this.Production_L2 = Production_L2;
        this.Narrations = Narrations;
        this.Transaction = Transaction;
        this.Customer_L1 = Customer_L1;
        this.Customer_L2 = Customer_L2;
        this.NCI_reason = NCI_reason;
        this.Status = Status;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public Integer getClaim_number() {
        return claim_number;
    }
    public void setClaim_number(Integer claim_number) {
        this.claim_number = claim_number;
    }


    public Integer getUpload_id() {
        return upload_id;
    }
    public void setUpload_id(Integer upload_id) {
        this.upload_id = upload_id;
    }


    public String getProduction_L1() {
        return Production_L1;
    }
    public void setProduction_L1(String Production_L1) {
        this.Production_L1 = Production_L1;
    }


    public String getProduction_L2() {
        return Production_L2;
    }
    public void setProduction_L2(String Production_L2) {
        this.Production_L2 = Production_L2;
    }


    public Timestamp getTransaction() {
        return Transaction;
    }
    public void setTransaction(Timestamp Transaction) {
        this.Transaction = Transaction;
    }


    public String getCustomer_L1() {
        return Customer_L1;
    }
    public void setCustomer_L1(String Customer_L1) {
        this.Customer_L1 = Customer_L1;
    }


    public String getCustomer_L2() {
        return Customer_L2;
    }
    public void setCustomer_L2(String Customer_L2) {
        this.Customer_L2 = Customer_L2;
    }


    public String getNCI_reason() {
        return NCI_reason;
    }
    public void setNCI_reason(String NCI_reason) {
        this.NCI_reason = NCI_reason;
    }


    public String getStatus() {
        return Status;
    }
    public void setStatus(String Status) {
        this.Status = Status;
    }

}
