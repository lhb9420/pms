package com.model;

import java.util.Date;

public class Overtime {
    private Integer overtimeId;

    private Integer employeeId;

    private String name;

    private Date record1;

    private Date record2;

    private Date createDate;

    public Integer getOvertimeId() {
        return overtimeId;
    }

    public void setOvertimeId(Integer overtimeId) {
        this.overtimeId = overtimeId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getRecord1() {
        return record1;
    }

    public void setRecord1(Date record1) {
        this.record1 = record1;
    }

    public Date getRecord2() {
        return record2;
    }

    public void setRecord2(Date record2) {
        this.record2 = record2;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}