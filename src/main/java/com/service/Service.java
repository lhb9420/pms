package com.service;

import com.model.*;

import java.util.List;

public interface Service {
    List<Dept> findAllDept(String content);

    void addDept(Dept dept);

    Dept get_Info(Integer id);

    void update_Info(Dept dept);

    void delete_Info(Integer id);

    List<Dept> findAllDept();

    /**
     * 职位信息的service
     *
     * @return
     */

    List<Job> findAllJob();

    List<Job> findAllJob(String content);

    Job get_JobInfo(Integer id);

    void update_JobInfo(Job job);

    void insert_JobInfo(Job job);

    void delete_JobInfo(Integer id);

    /**
     * 员工信息的service
     */
    List<Employee> get_EmployeeList();

    List<Employee> get_EmployeeLikeList(String content);

    Employee get_EmployeeInfo(Integer id);

    void update_EmployeeInfo(Employee data);

    void insert_EmployeeInfo(Employee data);

    void delete_EmployeeInfo(Integer id);

    Employee login2(String loginname, String password);

    List<Notice> get_NoticeList();

    List<Notice> get_NoticeLikeList(String content);

    Notice get_NoticeInfo(Integer id);

    void update_NoticeInfo(Notice notice);

    void insert_NoticeInfo(Notice notice);

    void delete_NoticeInfo(Integer id);

    User login(String loginname, String password);

    List<User> get_UserList();

    List<User> get_UserLikeList(String content);

    User get_UserInfo(Integer id);

    void update_UserInfo(User notice);

    void insert_UserInfo(User notice);

    void delete_UserInfo(Integer id);

    List<Salary> get_SalaryList();

    List<Salary> get_SalaryLikeList(String content);

    List<Leave> get_LeaveList();

    List<Leave> get_LeaveLikeList(String content);

    List<Overtime> get_OvertimeList();

    List<Overtime> get_OvertimeLikeList(String content);

    List<Attendance> get_AttendanceList();

    List<Attendance> get_AttenanceLikeList(String content);

    void enable_Leave(Integer leave_id);

    void insert_leave(Leave leave);

    List<Attendance> get_AttendanceId(String day);

    void update_AttendanceInfo(Attendance attendance);

    Employee get_EmployeeIdByName(String name);

    void insert_AttendanceInfo(Attendance attendance);
}
