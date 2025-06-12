/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.przychodnia;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Dorota
 */
@Entity
@Table(name = "WIDOK")
@NamedQueries({
    @NamedQuery(name = "Widok.findAll", query = "SELECT w FROM Widok w"),
    @NamedQuery(name = "Widok.findByDepartmentId", query = "SELECT w FROM Widok w WHERE w.departmentId = :departmentId"),
    @NamedQuery(name = "Widok.findByDepartmentName", query = "SELECT w FROM Widok w WHERE w.departmentName = :departmentName"),
    @NamedQuery(name = "Widok.findByLastName", query = "SELECT w FROM Widok w WHERE w.lastName = :lastName"),
    @NamedQuery(name = "Widok.findBySalary", query = "SELECT w FROM Widok w WHERE w.salary = :salary"),
    @NamedQuery(name = "Widok.findByJobId", query = "SELECT w FROM Widok w WHERE w.jobId = :jobId")})
public class Widok implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DEPARTMENT_ID")
    private short departmentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DEPARTMENT_NAME")
    private String departmentName;
    @Size(max = 25)
    @Column(name = "LAST_NAME")
    private String lastName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SALARY")
    private BigDecimal salary;
    @Size(max = 10)
    @Column(name = "JOB_ID")
    private String jobId;

    public Widok() {
    }

    public short getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(short departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    
}
