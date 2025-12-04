package com.csc213.kazioffice_marriageregisteroffice.Witness.ModelClass;

import java.time.LocalDate;

public class WitnessInvestigationCooperation {
    private String caseId;
    private String witnessName;
    private String witnessNid;
    private LocalDate cooperationDate;
    private String cooperationStatement;
    private String remarks;

    public WitnessInvestigationCooperation(String caseId, String remarks, String cooperationStatement, LocalDate cooperationDate, String witnessNid, String witnessName) {
        this.caseId = caseId;
        this.remarks = remarks;
        this.cooperationStatement = cooperationStatement;
        this.cooperationDate = cooperationDate;
        this.witnessNid = witnessNid;
        this.witnessName = witnessName;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getWitnessName() {
        return witnessName;
    }

    public void setWitnessName(String witnessName) {
        this.witnessName = witnessName;
    }

    public String getWitnessNid() {
        return witnessNid;
    }

    public void setWitnessNid(String witnessNid) {
        this.witnessNid = witnessNid;
    }

    public LocalDate getCooperationDate() {
        return cooperationDate;
    }

    public void setCooperationDate(LocalDate cooperationDate) {
        this.cooperationDate = cooperationDate;
    }

    public String getCooperationStatement() {
        return cooperationStatement;
    }

    public void setCooperationStatement(String cooperationStatement) {
        this.cooperationStatement = cooperationStatement;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "WitnessInvestigationCooperation{" +
                "caseId='" + caseId + '\'' +
                ", witnessName='" + witnessName + '\'' +
                ", witnessNid='" + witnessNid + '\'' +
                ", cooperationDate=" + cooperationDate +
                ", cooperationStatement='" + cooperationStatement + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
