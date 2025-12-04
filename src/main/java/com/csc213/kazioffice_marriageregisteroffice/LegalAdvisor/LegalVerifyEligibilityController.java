package com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor;

import com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor.ModelClass.LegalEligibilityVerification;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LegalVerifyEligibilityController {

    @FXML
    private Label brideNidLabel;

    @FXML
    private TableColumn<LegalEligibilityVerification, String> brideNidTableViewColumn;

    @FXML
    private TextField brideNidTextField;

    @FXML
    private ComboBox<String> caseIdComboBox;

    @FXML
    private Label caseIdLabel;

    @FXML
    private TableColumn<LegalEligibilityVerification, String> caseIdTableViewColumn;

    @FXML
    private Label checkDateLabel;

    @FXML
    private DatePicker checkDatePicker;

    @FXML
    private ComboBox<?> eligibilityComboBox;

    @FXML
    private Label eligibilityLabel;

    @FXML
    private TableColumn<LegalEligibilityVerification,String > eligibilityTableViewColumn;

    @FXML
    private TableColumn<LegalEligibilityVerification, String> groomNidTableViewColumn;

    @FXML
    private Label remarksLabel;

    @FXML
    private TextArea remarksTextArea;

    @FXML
    void backOnActionButton(ActionEvent event) {

    }

    @FXML
    void clearOnActionButton(ActionEvent event) {

    }

    @FXML
    void loadCaseOnActionButton(ActionEvent event) {

    }

    @FXML
    void savedecisionOnActionButton(ActionEvent event) {

    }

}
