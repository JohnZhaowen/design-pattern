package com.john.pattern.prototype;

import java.io.Serializable;
import java.time.LocalDate;

public class WorkExpience implements Serializable {

    private static final long serialVersionUID = -7513409637410830573L;

    private LocalDate startTime;

    private LocalDate endTime;

    private String company;

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
