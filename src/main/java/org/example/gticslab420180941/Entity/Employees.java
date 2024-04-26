package org.example.gticslab420180941.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="employees")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Integer employee_id;

    @Column(name = "firts_name", nullable = false, length = 40)
    private String firts_name;

    @Column(name = "last_name", nullable = false , length = 40)
    private  String last_name;

    @Column(name = "email", nullable = false , length = 40)
    private  String email;

    @Column(name = "password", nullable = false , length = 100)
    private  String password;

    @Column(name = "phone_number", nullable = false)
    private  Integer phone_number;

    @Column(name = "hire_date", nullable = false)
    private Date hire_date;

    @Column(name = "job_id", nullable = false)
    private String job_id;
    @Column(name = "salary", nullable = false)
    private float salary;
    @Column(name = "commission_pct", nullable = false)
    private float commission_pct;
    @Column(name = "manager_id", nullable = false)
    private Integer manager_id;
    @Column(name = "department_id", nullable = false)
    private Integer department_id;
    @Column(name = "enabled", nullable = false)
    private Integer enabled;


    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirts_name() {
        return firts_name;
    }

    public void setFirts_name(String firts_name) {
        this.firts_name = firts_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Integer phone_number) {
        this.phone_number = phone_number;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getCommission_pct() {
        return commission_pct;
    }

    public void setCommission_pct(float commission_pct) {
        this.commission_pct = commission_pct;
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
