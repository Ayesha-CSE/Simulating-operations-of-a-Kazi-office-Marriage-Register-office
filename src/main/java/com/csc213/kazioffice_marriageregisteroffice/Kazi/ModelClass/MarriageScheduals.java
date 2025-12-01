package com.csc213.kazioffice_marriageregisteroffice.Kazi.ModelClass;

import java.time.LocalDate;

public class MarriageScheduals {
    private LocalDate selectDate;
    private Integer selectTime;
    private String selectVenue;
    private Integer caseID;

    public MarriageScheduals(LocalDate selectDate, Integer selectTime, String selectVenue, Integer caseID) {
        this.selectDate = selectDate;
        this.selectTime = selectTime;
        this.selectVenue = selectVenue;
        this.caseID = caseID;
    }

    public Integer getSelectTime() {
        return selectTime;
    }

    public void setSelectTime(Integer selectTime) {
        this.selectTime = selectTime;
    }

    public LocalDate getSelectDate() {
        return selectDate;
    }

    public void setSelectDate(LocalDate selectDate) {
        this.selectDate = selectDate;
    }

    public String getSelectVenue() {
        return selectVenue;
    }

    public void setSelectVenue(String selectVenue) {
        this.selectVenue = selectVenue;
    }

    public Integer getCaseID() {
        return caseID;
    }

    public void setCaseID(Integer caseID) {
        this.caseID = caseID;
    }

    @Override
    public String toString() {
        return "MarriageScheduals{" +
                "selectDate=" + selectDate +
                ", selectTime=" + selectTime +
                ", selectVenue='" + selectVenue + '\'' +
                ", caseID=" + caseID +
                '}';
    }
}
