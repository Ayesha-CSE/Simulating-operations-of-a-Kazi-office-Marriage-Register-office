package com.csc213.kazioffice_marriageregisteroffice.Witness;

import com.csc213.kazioffice_marriageregisteroffice.Witness.ModelClass.WitnessConsent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class WitnessConsentController {

    @FXML
    private Label additionalCommentsLabel;

    @FXML
    private TextArea additionalCommentsTextArea;

    @FXML
    private Label brideConsentStatusLabel;

    @FXML
    private Label brideNameLabel;

    @FXML
    private TextField brideNameTextFIeld;

    @FXML
    private TableColumn<WitnessConsent, String> brideTableColumn;

    @FXML
    private TableColumn<WitnessConsent, String> caseIdTableColumn;

    @FXML
    private ComboBox<String> caseListComboBox;

    @FXML
    private DatePicker consentObservedDateDatePicker;

    @FXML
    private TableColumn<WitnessConsent, LocalDate> dateTableColumn;

    @FXML
    private Label groomConsentStatusLabel;

    @FXML
    private Label groomNameLabel;

    @FXML
    private TextField groomNameTextField;

    @FXML
    private TableColumn<WitnessConsent, String> groomTableColumn;

    @FXML
    private ComboBox<String> overallConsentResultComboBox;

    @FXML
    private Label overallConsentResultLabel;

    @FXML
    private Label selectCaseLabel;

    @FXML
    private TableColumn<WitnessConsent, String> statusTableColumn;

    @FXML
    private Label witnessConfirmConsentOfBrideAndGroomLabel;

    @FXML
    private Label witnessObservationNotesLabel;

    @FXML
    private TextArea witnessObservationNotesTextArea;

    @FXML
    void backOnActionButton(ActionEvent event) {

    }

    @FXML
    void brideConsentedOnActionRadioButton(ActionEvent event) {

    }

    @FXML
    void brideNotConsentedOnActionRadioButton(ActionEvent event) {

    }

    @FXML
    void clearFormOnActionButton(ActionEvent event) {

    }

    @FXML
    void groomConsentedOnActionRadioButton(ActionEvent event) {

    }

    @FXML
    void groomNotConsentendOnActionRadioButton(ActionEvent event) {

    }

    @FXML
    void loadCaseOnActionButton(ActionEvent event) {

    }

    @FXML
    void saveConsentRecordOnActionButton(ActionEvent event) {

    }

}