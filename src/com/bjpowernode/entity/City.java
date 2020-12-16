package com.bjpowernode.entity;

import java.io.Serializable;

/**
 * city
 * @author 
 */
public class City implements Serializable {
    private Integer cid;

    private String cname;

    private String pid;

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}