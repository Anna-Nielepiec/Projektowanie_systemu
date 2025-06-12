/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.przychodnia;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.io.Serializable;

/**
 *
 * @author Dorota
 */
@Entity
@Table(name = "EMP_VU")
@NamedQueries({
    @NamedQuery(name = "EmpVu.findAll", query = "SELECT e FROM EmpVu e"),
    @NamedQuery(name = "EmpVu.findByEmployeeId", query = "SELECT e FROM EmpVu e WHERE e.employeeId = :employeeId"),
    @NamedQuery(name = "EmpVu.findByLastName", query = "SELECT e FROM EmpVu e WHERE e.lastName = :lastName"),
    @NamedQuery(name = "EmpVu.findByDepartmentId", query = "SELECT e FROM EmpVu e WHERE e.departmentId = :departmentId")})
public class EmpVu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EMPLOYEE_ID")
    private Integer employeeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "DEPARTMENT_ID")
    private Short departmentId;

    public EmpVu() {
    }

    public EmpVu(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public EmpVu(Integer employeeId, String lastName) {
        this.employeeId = employeeId;
        this.lastName = lastName;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Short getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Short departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeId != null ? employeeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpVu)) {
            return false;
        }
        EmpVu other = (EmpVu) object;
        if ((this.employeeId == null && other.employeeId != null) || (this.employeeId != null && !this.employeeId.equals(other.employeeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.przychodnia.EmpVu[ employeeId=" + employeeId + " ]";
    }
    
}
