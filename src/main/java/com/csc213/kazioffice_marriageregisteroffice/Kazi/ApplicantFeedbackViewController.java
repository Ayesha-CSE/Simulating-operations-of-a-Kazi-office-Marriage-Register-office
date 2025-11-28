package com.csc213.kazioffice_marriageregisteroffice.Kazi;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ApplicantFeedbackViewController
{
    @javafx.fxml.FXML
    private DatePicker filterDate;
    @javafx.fxml.FXML
    private TableColumn ratingColumn;
    @javafx.fxml.FXML
    private TableColumn feedbackColumn;
    @javafx.fxml.FXML
    private TableColumn applicantColumn;
    @javafx.fxml.FXML
    private TextField caseID;
    @javafx.fxml.FXML
    private ComboBox ratingField;
    @javafx.fxml.FXML
    private TableColumn caseIDColumn;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TextField applicantName;
    @javafx.fxml.FXML
    private TableColumn dateColumn;
    @javafx.fxml.FXML
    private TextArea feedbackArea;
    @javafx.fxml.FXML
    private TextField caseID1;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void markAsReviewedButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void replyButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void saveButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void applyFilter(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void resetButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchFilter(ActionEvent actionEvent) {
    }
}