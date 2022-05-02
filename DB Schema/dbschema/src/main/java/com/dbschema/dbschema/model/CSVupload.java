package com.dbschema.dbschema.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="csvuploads")
public class CSVupload {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="upload_id")
    private Long id;

    @Column(name="userid")
    private Integer userid;

    @Column(name="date")
    private Date date;

    @Column(name="filename")
    private String filename;

    @Column(name="records")
    private Integer records;

    public CSVupload () {
    }
    public CSVupload (Integer userid, Date date, String filename, Integer records) {
        this.userid = userid;
        this.date = date;
        this.filename = filename;
        this.records = records;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }
    public void setUserid(Integer userid) {
        this.userid = userid;
    }


    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }


    public Integer getRecords() {
        return records;
    }
    public void setRecords(Integer records) {
        this.records = records;
    }

}
