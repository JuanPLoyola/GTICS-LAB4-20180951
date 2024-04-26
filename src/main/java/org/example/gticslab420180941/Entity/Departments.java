package org.example.gticslab420180941.Entity;

import jakarta.persistence.*;
import org.springframework.data.relational.core.sql.In;

@Entity
@Table(name = "departments")
public class Departments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id", nullable = false)
    private Integer department_id;

    @Column(name = "department_name", nullable = false)
    private String department_name;

    @Column(name = "manager_id", nullable = false)
    private Integer manager_id;

    @Column(name = "location_id", nullable = false)
    private Integer location_id;


    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }
}