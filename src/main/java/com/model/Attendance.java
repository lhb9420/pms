package com.model;

import java.util.Date;

public class Attendance {
    private Integer attendanceId;

    private Integer employeeId;

    private String name;

    private String day;

    private String record1;

    private String record2;

    private String record3;

    private String record4;

    private Date createDate;

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public String getRecord1() {
        return record1;
    }

    public void setRecord1(String record1) {
        this.record1 = record1 == null ? null : record1.trim();
    }

    public String getRecord2() {
        return record2;
    }

    public void setRecord2(String record2) {
        this.record2 = record2 == null ? null : record2.trim();
    }

    public String getRecord3() {
        return record3;
    }

    public void setRecord3(String record3) {
        this.record3 = record3 == null ? null : record3.trim();
    }

    public String getRecord4() {
        return record4;
    }

    public void setRecord4(String record4) {
        this.record4 = record4 == null ? null : record4.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}