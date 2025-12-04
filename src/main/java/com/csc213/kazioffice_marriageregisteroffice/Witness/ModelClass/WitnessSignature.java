package com.csc213.kazioffice_marriageregisteroffice.Witness.ModelClass;

import java.time.LocalDate;

public class WitnessSignature {
    private String caseId;
    private String witnessName;
    private String witnessNid;
    private String relationshipToParties;
    private LocalDate signatureDate;
    private String signatureStatus;
    private String comments;

    public WitnessSignature(String caseId, String witnessName, String witnessNid, String relationshipToParties, LocalDate signatureDate, String signatureStatus, String comments) {
        this.caseId = caseId;
        this.witnessName = witnessName;
        this.witnessNid = witnessNid;
        this.relationshipToParties = relationshipToParties;
        this.signatureDate = signatureDate;
        this.signatureStatus = signatureStatus;
        this.comments = comments;
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

    public String getRelationshipToParties() {
        return relationshipToParties;
    }

    public void setRelationshipToParties(String relationshipToParties) {
        this.relationshipToParties = relationshipToParties;
    }

    public LocalDate getSignatureDate() {
        return signatureDate;
    }

    public void setSignatureDate(LocalDate signatureDate) {
        this.signatureDate = signatureDate;
    }

    public String getSignatureStatus() {
        return signatureStatus;
    }

    public void setSignatureStatus(String signatureStatus) {
        this.signatureStatus = signatureStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "WitnessSignature{" +
                "caseId='" + caseId + '\'' +
                ", witnessName='" + witnessName + '\'' +
                ", witnessNid='" + witnessNid + '\'' +
                ", relationshipToParties='" + relationshipToParties + '\'' +
                ", signatureDate=" + signatureDate +
                ", signatureStatus='" + signatureStatus + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
