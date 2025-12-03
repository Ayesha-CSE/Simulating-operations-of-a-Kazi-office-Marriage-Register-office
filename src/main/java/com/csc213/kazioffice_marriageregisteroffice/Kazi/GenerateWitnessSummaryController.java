package com.csc213.kazioffice_marriageregisteroffice.Kazi;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GenerateWitnessSummaryController
{
    @javafx.fxml.FXML
    private TextField caseId;
    @javafx.fxml.FXML
    private TextArea witnessNotes;
    @javafx.fxml.FXML
    private TextField marrigeCondition;
    @javafx.fxml.FXML
    private TextArea caseDetails;
    @javafx.fxml.FXML
    private TextField applicantName;
    @javafx.fxml.FXML
    private DatePicker date;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateSummaryBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
    }

    @Deprecated
    public void saveBtn(ActionEvent actionEvent) {
    }
}