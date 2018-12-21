package com.example.demo.entity;

import java.util.Date;

public class Navigation {
    private Integer id;
    private String name;
    private Integer status;
    private Date createTime;
    private Integer orderNumber;
    private String interfaceIds;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getInterfaceIds() {
        return interfaceIds;
    }

    public void setInterfaceIds(String interfaceIds) {
        this.interfaceIds = interfaceIds;
    }
}
