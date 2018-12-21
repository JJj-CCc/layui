package com.example.demo.entity;

import java.util.Date;

public class Role {
    private Integer id;
    private String name;
    private String des;
    private Integer status;
    private Date createTime;
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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
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

    public String getInterfaceIds() {
        return interfaceIds;
    }

    public void setInterfaceIds(String interfaceIds) {
        this.interfaceIds = interfaceIds;
    }
}
