package com.dbschema.dbschema.model;


import javax.persistence.*;

@Entity
@Table(name="permissions")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private EPermission title;
    public Permission() {
    }
    public Permission(EPermission title) {
        this.title = title;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public EPermission getTitle() {
        return title;
    }
    public void setTitle(EPermission title) {
        this.title = title;
    }
}
