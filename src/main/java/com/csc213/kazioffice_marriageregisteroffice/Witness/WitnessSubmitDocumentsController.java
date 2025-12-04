package com.csc213.kazioffice_marriageregisteroffice.Witness;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class WitnessSubmitDocumentsController {

    @FXML
    private Label commentsLabel;

    @FXML
    private TextArea commentsTextArea;

    @FXML
    private TableColumn<WitnessSubmitDocumentsController, LocalDate> dateTableViewColumn;

    @FXML
    private TableColumn<WitnessSubmitDocumentsController, String> docNoTableViewColumn;

    @FXML
    private Label documentNumberLabel;

    @FXML
    private ComboBox<String> documentTypeComboBox;

    @FXML
    private Label documentTypeLabel;

    @FXML
    private TableColumn<WitnessSubmitDocumentsController, String> documentTypeTableViewColumn;

    @FXML
    private Button loadCaseOnActionButton;

    @FXML
    private TableColumn<WitnessSubmitDocumentsController, String> reviewerTableViewColumn;

    @FXML
    private Label selectCaseLabel;

    @FXML
    private ComboBox<String> selectCaseComboBox;

    @FXML
    private ComboBox<String> statusComboBox;

    @FXML
    private Label statusLabel;

    @FXML
    private TableColumn<WitnessSubmitDocumentsController, String> statusTableViewColumn;

    @FXML
    private DatePicker submissionDateDatePicker;

    @FXML
    private Label submissionDateLabel;

    @FXML
    private Label witnessNameLabel;

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
    void submitOnActionButton(ActionEvent event) {

    }

}
