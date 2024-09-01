package com.STC.Requests;

import com.STC.Employee.Employee;
import com.STC.Manager.Manager;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Optional;
@Entity
public class Requests {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_requests_sequence")
    @SequenceGenerator(name = "my_requests_sequence", sequenceName = "my_requests_sequence", allocationSize = 1)
    private int id;
    @ManyToOne
    @JsonIgnoreProperties({"username","password","department","mail"})
    private Employee employee;
    private String start_date;
    private String end_date;
    private String req_date;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getReq_date() {
        return req_date;
    }

    public void setReq_date(String req_date) {
        this.req_date = req_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Requests() {
    }
    public Requests(Employee employee, String start_date, String end_date, String req_date, String status) {
        this.employee = employee;
        this.start_date = start_date;
        this.end_date = end_date;
        this.req_date = req_date;
        this.status = status;
    }
}
