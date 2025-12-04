package com.csc213.kazioffice_marriageregisteroffice.Witness.ModelClass;

import java.time.LocalDate;

public class WitnessCourtTestimony {
    private String caseId;
    private String witnessName;
    private String witnessNid;
    private LocalDate testimonyDate;
    private String testimonyStatement;


    public WitnessCourtTestimony(String caseId, String witnessName, String witnessNid, LocalDate testimonyDate, String testimonyStatement, String testimonyStatement1) {
        this.caseId = caseId;
        this.witnessName = witnessName;
        this.witnessNid = witnessNid;
        this.testimonyDate = testimonyDate;
        this.testimonyStatement = testimonyStatement;

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

    public LocalDate getTestimonyDate() {
        return testimonyDate;
    }

    public void setTestimonyDate(LocalDate testimonyDate) {
        this.testimonyDate = testimonyDate;
    }

    public String getTestimonyStatement() {
        return testimonyStatement;
    }

    public void setTestimonyStatement(String testimonyStatement) {
        this.testimonyStatement = testimonyStatement;
    }

    @Override
    public String toString() {
        return "WitnessCourtTestimony{" +
                "caseId='" + caseId + '\'' +
                ", witnessName='" + witnessName + '\'' +
                ", witnessNid='" + witnessNid + '\'' +
                ", testimonyDate=" + testimonyDate +
                ", testimonyStatement='" + testimonyStatement + '\'' +
                ", testimonyStatement='" + testimonyStatement + '\'' +
                '}';
    }
}
