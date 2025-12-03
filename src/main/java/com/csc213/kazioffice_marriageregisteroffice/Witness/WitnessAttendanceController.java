package com.csc213.kazioffice_marriageregisteroffice.Witness;

import com.csc213.kazioffice_marriageregisteroffice.Witness.ModelClass.CeremonySchedule;
import com.csc213.kazioffice_marriageregisteroffice.Witness.ModelClass.WitnessAttendance;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class WitnessAttendanceController implements Initializable {

    @FXML private TextField tfWitnessName;
    @FXML private TextField tfWitnessNID;
    @FXML private TextField tfWitnessContact;

    @FXML private TableView<CeremonySchedule> tvCeremonies;
    @FXML private TableColumn<CeremonySchedule, String> colCaseId;
    @FXML private TableColumn<CeremonySchedule, String> colApplicant;
    @FXML private TableColumn<CeremonySchedule, LocalDate> colDate;
    @FXML private TableColumn<CeremonySchedule, String> colVenue;
    @FXML private TableColumn<CeremonySchedule, String> colStatus;

    @FXML private TextField tfCaseId;
    @FXML private TextField tfApplicants;
    @FXML private TextField tfVenue;
    @FXML private DatePicker dpScheduledDate;

    @FXML private RadioButton rbWillAttend;
    @FXML private RadioButton rbWillNotAttend;
    @FXML private ComboBox<String> cbRelationship;
    @FXML private TextArea taNotes;

    @FXML private DatePicker dpFilterDate;
    @FXML private ComboBox<String> cbFilterStatus;
    @FXML private Label lblStatus;

    private ToggleGroup attendanceToggle;
    private final ObservableList<CeremonySchedule> allCeremonies = FXCollections.observableArrayList();
    private final ObservableList<WitnessAttendance> recordedAttendances = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // table columns
        colCaseId.setCellValueFactory(new PropertyValueFactory<>("caseId"));
        colApplicant.setCellValueFactory(new PropertyValueFactory<>("applicantNames"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("scheduledDate"));
        colVenue.setCellValueFactory(new PropertyValueFactory<>("venue"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        // sample ceremonies
        allCeremonies.addAll(
                new CeremonySchedule("CASE-1001","Md & Fatima", LocalDate.now().plusDays(1), "Community Hall A", "Scheduled"),
                new CeremonySchedule("CASE-1002","Rahim & Aisha", LocalDate.now().plusDays(3), "Mosque Main", "Scheduled"),
                new CeremonySchedule("CASE-1003","Siam & Nodi", LocalDate.now().minusDays(2), "Office Room 2", "Completed")
        );
        tvCeremonies.setItems(allCeremonies);

        // fill combo boxes here (avoids complex FXML)
        cbRelationship.setItems(FXCollections.observableArrayList("Friend","Relative","Neighbor","Colleague","Other"));
        cbFilterStatus.setItems(FXCollections.observableArrayList("All","Scheduled","Completed","Cancelled"));
        cbFilterStatus.getSelectionModel().selectFirst();

        // radio toggle
        attendanceToggle = new ToggleGroup();
        rbWillAttend.setToggleGroup(attendanceToggle);
        rbWillNotAttend.setToggleGroup(attendanceToggle);

        // selection listener for table
        tvCeremonies.getSelectionModel().selectedItemProperty().addListener((obs, oldSel, newSel) -> {
            if (newSel != null) populateSelectedCeremony(newSel);
        });

        lblStatus.setText("Loaded " + allCeremonies.size() + " ceremonies.");
    }

    private void populateSelectedCeremony(CeremonySchedule c) {
        tfCaseId.setText(c.getCaseId());
        tfApplicants.setText(c.getApplicantNames());
        tfVenue.setText(c.getVenue());
        dpScheduledDate.setValue(c.getScheduledDate());
        attendanceToggle.selectToggle(null);
        cbRelationship.getSelectionModel().clearSelection();
        taNotes.clear();
    }

    @FXML
    private void onConfirmAttendance() {
        CeremonySchedule selected = tvCeremonies.getSelectionModel().getSelectedItem();
        if (!validateWitnessBaseInfo()) return;
        if (selected == null) {
            showAlert(Alert.AlertType.WARNING, "No ceremony selected", "Please select a ceremony from the list.");
            return;
        }
        Toggle selectedToggle = attendanceToggle.getSelectedToggle();
        if (selectedToggle == null) {
            showAlert(Alert.AlertType.WARNING, "Attendance not selected", "Please choose Will Attend / Will Not Attend.");
            return;
        }
        String willAttend = (selectedToggle == rbWillAttend) ? "Will Attend" : "Will Not Attend";
        String relation = cbRelationship.getValue();
        if (relation == null || relation.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Relationship required", "Please select your relationship to the couple.");
            return;
        }

        WitnessAttendance wa = new WitnessAttendance(
                tfWitnessName.getText().trim(),
                tfWitnessNID.getText().trim(),
                tfWitnessContact.getText().trim(),
                selected.getCaseId(),
                willAttend,
                relation,
                taNotes.getText().trim()
        );
        recordedAttendances.add(wa);

        lblStatus.setText("Attendance recorded for " + selected.getCaseId() + " (" + willAttend + ")");
        showAlert(Alert.AlertType.INFORMATION, "Attendance Confirmed",
                "Thank you. Your attendance for case " + selected.getCaseId() + " is recorded as: " + willAttend);
    }

    @FXML
    private void onCheckIn() {
        CeremonySchedule selected = tvCeremonies.getSelectionModel().getSelectedItem();
        if (!validateWitnessBaseInfo()) return;
        if (selected == null) {
            showAlert(Alert.AlertType.WARNING, "No ceremony selected", "Please select a ceremony to check in.");
            return;
        }
        selected.setStatus("Witness Checked In");
        tvCeremonies.refresh();
        lblStatus.setText("Checked in at " + java.time.LocalTime.now().toString());
        showAlert(Alert.AlertType.INFORMATION, "Checked In", "You have been checked in for " + selected.getCaseId());
    }

    @FXML
    private void onApplyFilters() {
        LocalDate filterDate = dpFilterDate.getValue();
        String status = cbFilterStatus.getValue();
        ObservableList<CeremonySchedule> result = FXCollections.observableArrayList(
                allCeremonies.stream()
                        .filter(c -> (filterDate == null || filterDate.equals(c.getScheduledDate())))
                        .filter(c -> (status == null || status.equals("All") || status.equals(c.getStatus())))
                        .collect(Collectors.toList())
        );
        tvCeremonies.setItems(result);
        lblStatus.setText("Showing " + result.size() + " of " + allCeremonies.size());
    }

    private boolean validateWitnessBaseInfo() {
        if (tfWitnessName.getText() == null || tfWitnessName.getText().trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Name Required", "Please enter your full name.");
            return false;
        }
        if (tfWitnessNID.getText() == null || tfWitnessNID.getText().trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "NID Required", "Please enter your NID number.");
            return false;
        }
        if (tfWitnessNID.getText().trim().length() < 6) {
            showAlert(Alert.AlertType.WARNING, "Invalid NID", "Please enter a valid NID (at least 6 digits).");
            return false;
        }
        return true;
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert a = new Alert(type);
        a.setTitle(title);
        a.setHeaderText(null);
        a.setContentText(message);
        a.showAndWait();
    }

    // For tests or later use
    public ObservableList<WitnessAttendance> getRecordedAttendances() {
        return recordedAttendances;
    }
}
