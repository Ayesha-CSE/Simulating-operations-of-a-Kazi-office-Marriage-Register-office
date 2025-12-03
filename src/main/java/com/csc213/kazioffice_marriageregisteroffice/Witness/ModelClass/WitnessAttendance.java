package com.csc213.kazioffice_marriageregisteroffice.Witness.ModelClass;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class WitnessAttendance {
    private final StringProperty witnessName = new SimpleStringProperty();
    private final StringProperty witnessNid = new SimpleStringProperty();
    private final StringProperty contact = new SimpleStringProperty();
    private final StringProperty caseId = new SimpleStringProperty();
    private final StringProperty attendance = new SimpleStringProperty();
    private final StringProperty relationship = new SimpleStringProperty();
    private final StringProperty notes = new SimpleStringProperty();

    public WitnessAttendance(String witnessName, String witnessNid, String contact,
                             String caseId, String attendance, String relationship, String notes) {
        this.witnessName.set(witnessName);
        this.witnessNid.set(witnessNid);
        this.contact.set(contact);
        this.caseId.set(caseId);
        this.attendance.set(attendance);
        this.relationship.set(relationship);
        this.notes.set(notes);
    }

    public String getWitnessName() { return witnessName.get(); }
    public String getWitnessNid() { return witnessNid.get(); }
    public String getContact() { return contact.get(); }
    public String getCaseId() { return caseId.get(); }
    public String getAttendance() { return attendance.get(); }
    public String getRelationship() { return relationship.get(); }
    public String getNotes() { return notes.get(); }
}
