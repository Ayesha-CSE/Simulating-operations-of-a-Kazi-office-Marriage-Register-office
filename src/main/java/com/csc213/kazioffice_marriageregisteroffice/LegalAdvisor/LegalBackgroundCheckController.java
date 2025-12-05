package com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor;

import com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor.ModelClass.LegalBackgroundCheck;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class LegalBackgroundCheckController {

    @FXML
    private Label applicantNameLabel;

    @FXML
    private TextField applicantNameTextField;

    @FXML
    private Label applicantNidLabel;

    @FXML
    private TextField applicantNidTextField;

    @FXML
    private TableColumn<LegalBackgroundCheck, String> applicantTableViewColumn;

    @FXML
    private ComboBox<String> caseIdComboBox;

    @FXML
    private Label caseIdLabel;

    @FXML
    private TableColumn<LegalBackgroundCheck, String> caseIdTableViewColumn;

    @FXML
    private DatePicker checkDateDatePicker;

    @FXML
    private Label checkDateLabel;

    @FXML
    private TableColumn<LegalBackgroundCheck, LocalDate> checkDateTableViewColumn;

    @FXML
    private ComboBox<String> checkResultComboBox;

    @FXML
    private Label checkResultLabel;

    @FXML
    private Label remarksLabel;

    @FXML
    private TextArea remarksTextArea;

    @FXML
    private TableColumn<LegalBackgroundCheck, String> resultTableViewColumn;

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
    void saveCheckOnActionButton(ActionEvent event) {

    }

}
