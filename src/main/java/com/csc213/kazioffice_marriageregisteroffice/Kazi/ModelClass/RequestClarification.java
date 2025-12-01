package com.csc213.kazioffice_marriageregisteroffice.Kazi.ModelClass;

public class RequestClarification {
    private String applicantName;
    private Integer caseID;
    private String clarificationMessage;
    private String instruction;

    public RequestClarification(String applicantName, Integer caseID, String clarificationMessage, String instruction) {
        this.applicantName = applicantName;
        this.caseID = caseID;
        this.clarificationMessage = clarificationMessage;
        this.instruction = instruction;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public Integer getCaseID() {
        return caseID;
    }

    public void setCaseID(Integer caseID) {
        this.caseID = caseID;
    }

    public String getClarificationMessage() {
        return clarificationMessage;
    }

    public void setClarificationMessage(String clarificationMessage) {
        this.clarificationMessage = clarificationMessage;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public String toString() {
        return "RequestClarification{" +
                "applicantName='" + applicantName + '\'' +
                ", caseID=" + caseID +
                ", clarificationMessage='" + clarificationMessage + '\'' +
                ", instruction='" + instruction + '\'' +
                '}';
    }
}
