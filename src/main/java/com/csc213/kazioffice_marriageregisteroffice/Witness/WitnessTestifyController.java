package com.csc213.kazioffice_marriageregisteroffice.Witness;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class WitnessTestifyController {

    @FXML
    private ComboBox<String> caseIdComboBox;

    @FXML
    private Label caseIdLabel;

    @FXML
    private TableColumn<WitnessTestifyController, String> caseIdTableViewColumn;

    @FXML
    private Label remarksLabel;

    @FXML
    private TextArea remarksTextArea;

    @FXML
    private Label testimoniDateLabel;

    @FXML
    private DatePicker testimonyDateDAtePicker;

    @FXML
    private Label testimonyStatementLabel;

    @FXML
    private TableColumn<WitnessTestifyController, String> testimonyTableViewColumn;

    @FXML
    private TextArea testimonyTextArea;

    @FXML
    private Label witnessNameLabel;

    @FXML
    private TableColumn<WitnessTestifyController, String> witnessNameTableViewColumn;

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
    void saveTestimonyOnActionButton(ActionEvent event) {

    }

}
