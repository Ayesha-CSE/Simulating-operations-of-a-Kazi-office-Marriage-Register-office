package com.csc213.kazioffice_marriageregisteroffice.Witness;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class WitnessInvestigationController {

    @FXML
    private ComboBox<String> caseIdComboBox;

    @FXML
    private Label caseIdLabel;

    @FXML
    private TableColumn<WitnessInvestigationController, String> caseIdTableViewColumn;

    @FXML
    private TextArea coooperationTextArea;

    @FXML
    private Label cooperationDateLabel;

    @FXML
    private DatePicker cooperationDatePicker;

    @FXML
    private TableColumn<WitnessInvestigationController, LocalDate> cooperationDateTableViewColumn;

    @FXML
    private Label cooperationStatementLabel;

    @FXML
    private Label remarksLabel;

    @FXML
    private TextArea remarksTextArea;

    @FXML
    private Label witnessNameLabel;

    @FXML
    private TableColumn<WitnessInvestigationController, String> witnessNameTableViewColumn;

    @FXML
    private TextField witnessNameTextField;

    @FXML
    private Label witnessNidLabel;

    @FXML
    private TextField witnessNidTextField;

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
    void saveCooperationOnActionButton(ActionEvent event) {

    }

}
