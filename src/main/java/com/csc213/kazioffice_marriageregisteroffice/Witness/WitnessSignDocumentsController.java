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

public class WitnessSignDocumentsController {

    @FXML
    private TableColumn<WitnessSignDocumentsController, String> brideTableViewColumn;

    @FXML
    private TableColumn<WitnessSignDocumentsController, String> caseIdTableViewColumn;

    @FXML
    private Label commentsLabel;

    @FXML
    private TextArea commentsTextArea;

    @FXML
    private TableColumn<WitnessSignDocumentsController, LocalDate> dateTableViewColumn;

    @FXML
    private Label declinedLabel;

    @FXML
    private TextField enterNameTextField;

    @FXML
    private TableColumn<WitnessSignDocumentsController, String> groomTableViewColumn;

    @FXML
    private ComboBox<String> listOfCaseIdsComboBox;

    @FXML
    private Label marriageRegistrationDocumentsLabel;

    @FXML
    private Label pendingLabel;

    @FXML
    private ComboBox<String> relationshipCombobox;

    @FXML
    private Label relationshipToCoupleLabel;

    @FXML
    private Label selectCaseLabel;

    @FXML
    private DatePicker signatureDateDatePicker;

    @FXML
    private Label signatureDateLabel;

    @FXML
    private Label signatureStatusLabel;

    @FXML
    private Label signedLabel;

    @FXML
    private TableColumn<WitnessSignDocumentsController, String> statusTableViewColumn;

    @FXML
    private Label witnessNameLabel;

    @FXML
    private Label witnessNidLabel;

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
    void saveSignatureOnActionButton(ActionEvent event) {

    }

    @FXML
    void signatureStatusOnActionRadioButton(ActionEvent event) {

    }

}
