package com.csc213.kazioffice_marriageregisteroffice.Witness;

import com.csc213.kazioffice_marriageregisteroffice.model.WitnessIdentityVerification;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class WitnessVerifyIDController implements Initializable {

    // FXML controls (must match fx:id in FXML)
    @FXML private ComboBox<String> cbCaseList;
    @FXML private Button btnLoadCase;

    @FXML private TableView<WitnessIdentityVerification> tvCases;
    @FXML private TableColumn<WitnessIdentityVerification, String> colCaseId;
    @FXML private TableColumn<WitnessIdentityVerification, String> colBride;
    @FXML private TableColumn<WitnessIdentityVerification, String> colGroom;
    @FXML private TableColumn<WitnessIdentityVerification, LocalDate> colDate;
    @FXML private TableColumn<WitnessIdentityVerification, String> colStatus;

    @FXML private TextField tfBrideNID;
    @FXML private TextField tfGroomNID;
    @FXML private ComboBox<String> cbVerificationResult;
    @FXML private TextArea taNotes;

    @FXML private RadioButton rbIdentityMatched;
    @FXML private RadioButton rbIdentityMismatch;
    @FXML private Button btnSubmitVerification;

    private ToggleGroup identityToggle;

    // data
    private final ObservableList<WitnessIdentityVerification> allCases = FXCollections.observableArrayList();
    private final ObservableList<WitnessIdentityVerification> recordedVerifications = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // set up table columns
        colCaseId.setCellValueFactory(new PropertyValueFactory<>("caseId"));
        colBride.setCellValueFactory(new PropertyValueFactory<>("brideName"));
        colGroom.setCellValueFactory(new PropertyValueFactory<>("groomName"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("marriageDate"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        // sample data (replace with real data source later)
        allCases.addAll(
                new WitnessIdentityVerification("CASE-1001", "Fatima Begum", "Md. Hasan", LocalDate.now().plusDays(1), "Scheduled"),
                new WitnessIdentityVerification("CASE-1002", "Aisha Khan", "Rahim Uddin", LocalDate.now().plusDays(5), "Scheduled"),
                new WitnessIdentityVerification("CASE-1003", "Nodi Sultana", "Siam Ahmed", LocalDate.now().minusDays(3), "Completed")
        );

        // show in table
        tvCases.setItems(allCases);

        // populate case combo (simple list of caseIds)
        cbCaseList.setItems(FXCollections.observableArrayList(
                allCases.stream().map(WitnessIdentityVerification::getCaseId).toList()
        ));

        // verification result choices
        cbVerificationResult.setItems(FXCollections.observableArrayList(
                "Valid", "Invalid", "Requires Further Check"
        ));

        // radio buttons grouping
        identityToggle = new ToggleGroup();
        rbIdentityMatched.setToggleGroup(identityToggle);
        rbIdentityMismatch.setToggleGroup(identityToggle);

        // when a table row is selected, populate form fields
        tvCases.getSelectionModel().selectedItemProperty().addListener((obs, oldSel, newSel) -> {
            if (newSel != null) populateFormFromCase(newSel);
        });
    }

    private void populateFormFromCase(WitnessIdentityVerification c) {
        // fill form fields with case info (NID fields may be blank initially)
        tfBrideNID.setText(c.getBrideNid() == null ? "" : c.getBrideNid());
        tfGroomNID.setText(c.getGroomNid() == null ? "" : c.getGroomNid());
        cbVerificationResult.getSelectionModel().clearSelection();
        taNotes.clear();

        // optionally select the row in table
        tvCases.getSelectionModel().select(c);
    }

    @FXML
    private void onLoadCase(ActionEvent event) {
        String caseId = cbCaseList.getValue();
        if (caseId == null || caseId.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Select Case", "Please select a case from the dropdown.");
            return;
        }

        // find the case object
        WitnessIdentityVerification found = allCases.stream()
                .filter(c -> caseId.equals(c.getCaseId()))
                .findFirst()
                .orElse(null);

        if (found == null) {
            showAlert(Alert.AlertType.ERROR, "Not found", "Selected case not found in the table.");
            return;
        }

        // select it in the table and populate
        tvCases.getSelectionModel().select(found);
        tvCases.scrollTo(found);
        populateFormFromCase(found);
    }

    @FXML
    private void onSubmitVerification(ActionEvent event) {
        WitnessIdentityVerification selected = tvCases.getSelectionModel().getSelectedItem();
        if (!validateForm(selected)) return;

        // collect inputs
        String brideNid = tfBrideNID.getText().trim();
        String groomNid = tfGroomNID.getText().trim();
        String verification = cbVerificationResult.getValue();
        String notes = taNotes.getText().trim();
        boolean matched = identityToggle.getSelectedToggle() == rbIdentityMatched;

        // update the selected case object
        selected.setBrideNid(brideNid);
        selected.setGroomNid(groomNid);
        selected.setVerificationResult(verification);
        selected.setNotes(notes);
        selected.setStatus(matched ? "Identity Verified" : "Identity Issue");

        // refresh table so status changes are visible
        tvCases.refresh();

        // record verification (keeps history)
        recordedVerifications.add(selected);

        showAlert(Alert.AlertType.INFORMATION, "Verification Saved",
                "Verification for case " + selected.getCaseId() + " saved with status: " + selected.getStatus());
    }

    private boolean validateForm(WitnessIdentityVerification selected) {
        if (selected == null) {
            showAlert(Alert.AlertType.WARNING, "No case selected", "Please select a case from the table or load one first.");
            return false;
        }
        if (tfBrideNID.getText() == null || tfBrideNID.getText().trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Bride NID required", "Please enter the Bride's NID.");
            return false;
        }
        if (tfGroomNID.getText() == null || tfGroomNID.getText().trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Groom NID required", "Please enter the Groom's NID.");
            return false;
        }
        if (cbVerificationResult.getValue() == null || cbVerificationResult.getValue().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Verification result required", "Please select a verification result.");
            return false;
        }
        if (identityToggle.getSelectedToggle() == null) {
            showAlert(Alert.AlertType.WARNING, "Select identity status", "Please choose Identity Matched or Identity Mismatch.");
            return false;
        }
        // basic NID length check (adjust to real rules as needed)
        if (tfBrideNID.getText().trim().length() < 6 || tfGroomNID.getText().trim().length() < 6) {
            showAlert(Alert.AlertType.WARNING, "Invalid NID", "NID should be at least 6 characters/digits.");
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

    // getters for tests or other controllers
    public ObservableList<WitnessIdentityVerification> getAllCases() { return allCases; }
    public ObservableList<WitnessIdentityVerification> getRecordedVerifications() { return recordedVerifications; }
}
