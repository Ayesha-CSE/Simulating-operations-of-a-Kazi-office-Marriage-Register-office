package com.csc213.kazioffice_marriageregisteroffice.Witness.ModelClass;

import javafx.beans.property.*;

import java.time.LocalDate;

public class CeremonySchedule {
    private final StringProperty caseId = new SimpleStringProperty();
    private final StringProperty applicantNames = new SimpleStringProperty();
    private final ObjectProperty<LocalDate> scheduledDate = new SimpleObjectProperty<>();
    private final StringProperty venue = new SimpleStringProperty();
    private final StringProperty status = new SimpleStringProperty();

    public CeremonySchedule(String caseId, String applicantNames, LocalDate scheduledDate, String venue, String status) {
        this.caseId.set(caseId);
        this.applicantNames.set(applicantNames);
        this.scheduledDate.set(scheduledDate);
        this.venue.set(venue);
        this.status.set(status);
    }

    public String getCaseId() { return caseId.get(); }
    public void setCaseId(String v) { caseId.set(v); }
    public StringProperty caseIdProperty() { return caseId; }

    public String getApplicantNames() { return applicantNames.get(); }
    public void setApplicantNames(String v) { applicantNames.set(v); }
    public StringProperty applicantNamesProperty() { return applicantNames; }

    public LocalDate getScheduledDate() { return scheduledDate.get(); }
    public void setScheduledDate(LocalDate d) { scheduledDate.set(d); }
    public ObjectProperty<LocalDate> scheduledDateProperty() { return scheduledDate; }

    public String getVenue() { return venue.get(); }
    public void setVenue(String v) { venue.set(v); }
    public StringProperty venueProperty() { return venue; }

    public String getStatus() { return status.get(); }
    public void setStatus(String s) { status.set(s); }
    public StringProperty statusProperty() { return status; }
}
