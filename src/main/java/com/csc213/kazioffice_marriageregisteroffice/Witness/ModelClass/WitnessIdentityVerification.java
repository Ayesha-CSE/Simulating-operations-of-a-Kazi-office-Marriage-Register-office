package com.csc213.kazioffice_marriageregisteroffice.Witness.ModelClass;

import javafx.beans.property.*;
import java.time.LocalDate;

public class WitnessIdentityVerification {
    private final StringProperty caseId = new SimpleStringProperty();
    private final StringProperty brideName = new SimpleStringProperty();
    private final StringProperty groomName = new SimpleStringProperty();
    private final ObjectProperty<LocalDate> marriageDate = new SimpleObjectProperty<>();
    private final StringProperty status = new SimpleStringProperty();

    // additional fields for verification details (not shown in table)
    private final StringProperty brideNid = new SimpleStringProperty();
    private final StringProperty groomNid = new SimpleStringProperty();
    private final StringProperty verificationResult = new SimpleStringProperty();
    private final StringProperty notes = new SimpleStringProperty();

    public WitnessIdentityVerification(String caseId, String brideName, String groomName,
                                       LocalDate marriageDate, String status) {
        this.caseId.set(caseId);
        this.brideName.set(brideName);
        this.groomName.set(groomName);
        this.marriageDate.set(marriageDate);
        this.status.set(status);
    }

    // getters & setters and properties

    public String getCaseId() { return caseId.get(); }
    public void setCaseId(String v) { caseId.set(v); }
    public StringProperty caseIdProperty() { return caseId; }

    public String getBrideName() { return brideName.get(); }
    public void setBrideName(String v) { brideName.set(v); }
    public StringProperty brideNameProperty() { return brideName; }

    public String getGroomName() { return groomName.get(); }
    public void setGroomName(String v) { groomName.set(v); }
    public StringProperty groomNameProperty() { return groomName; }

    public LocalDate getMarriageDate() { return marriageDate.get(); }
    public void setMarriageDate(LocalDate d) { marriageDate.set(d); }
    public ObjectProperty<LocalDate> marriageDateProperty() { return marriageDate; }

    public String getStatus() { return status.get(); }
    public void setStatus(String v) { status.set(v); }
    public StringProperty statusProperty() { return status; }

    public String getBrideNid() { return brideNid.get(); }
    public void setBrideNid(String v) { brideNid.set(v); }
    public StringProperty brideNidProperty() { return brideNid; }

    public String getGroomNid() { return groomNid.get(); }
    public void setGroomNid(String v) { groomNid.set(v); }
    public StringProperty groomNidProperty() { return groomNid; }

    public String getVerificationResult() { return verificationResult.get(); }
    public void setVerificationResult(String v) { verificationResult.set(v); }
    public StringProperty verificationResultProperty() { return verificationResult; }

    public String getNotes() { return notes.get(); }
    public void setNotes(String v) { notes.set(v); }
    public StringProperty notesProperty() { return notes; }
}
