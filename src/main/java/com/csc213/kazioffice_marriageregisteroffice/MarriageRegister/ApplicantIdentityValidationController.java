package com.csc213.kazioffice_marriageregisteroffice.MarriageRegister;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ApplicantIdentityValidationController
{
    @javafx.fxml.FXML
    private TableColumn applicantNameColumn;
    @javafx.fxml.FXML
    private TableColumn caseIdColumn;
    @javafx.fxml.FXML
    private TableColumn contactColumn;
    @javafx.fxml.FXML
    private TextField nidNumber;
    @javafx.fxml.FXML
    private TableColumn nidNumberColumn;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private DatePicker dateOfBirth;
    @javafx.fxml.FXML
    private TextField applicantName;
    @javafx.fxml.FXML
    private RadioButton suspicious;
    @javafx.fxml.FXML
    private RadioButton approved;
    @javafx.fxml.FXML
    private RadioButton needsCorrection;
    @javafx.fxml.FXML
    private TableColumn dateOfBirthColumn;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TextField caseID;
    @javafx.fxml.FXML
    private TextField contact;
    @javafx.fxml.FXML
    private TextArea remarks;
    @javafx.fxml.FXML
    private ToggleGroup status;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveBtn(ActionEvent actionEvent) {
    }
}