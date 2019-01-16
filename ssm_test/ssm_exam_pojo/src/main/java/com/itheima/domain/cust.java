package com.itheima.domain;

import java.io.Serializable;

public class cust implements Serializable{
    private Integer cid;
    private String cust_name;
    private String cust_type;
    private String cust_phone;
    private String cust_address;
    private Integer cust_link_user;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_type() {
        return cust_type;
    }

    public void setCust_type(String cust_type) {
        this.cust_type = cust_type;
    }

    public String getCust_phone() {
        return cust_phone;
    }

    public void setCust_phone(String cust_phone) {
        this.cust_phone = cust_phone;
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }

    public Integer getCust_link_user() {
        return cust_link_user;
    }

    public void setCust_link_user(Integer cust_link_user) {
        this.cust_link_user = cust_link_user;
    }

    @Override
    public String toString() {
        return "cust{" +
                "cid=" + cid +
                ", cust_name='" + cust_name + '\'' +
                ", cust_type='" + cust_type + '\'' +
                ", cust_phone='" + cust_phone + '\'' +
                ", cust_address='" + cust_address + '\'' +
                ", cust_link_user=" + cust_link_user +
                '}';
    }
}
