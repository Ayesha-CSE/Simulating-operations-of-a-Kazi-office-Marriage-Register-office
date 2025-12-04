package com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor;

import com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor.ModelClass.LegalDocumentationReview;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class LegalReviewDocsController {

    @FXML
    private Label DocumentNameLabel;

    @FXML
    private ComboBox<String> caseIdComboBox;

    @FXML
    private Label caseIdLabel;

    @FXML
    private TableColumn<LegalDocumentationReview, String> caseIdTableViewColumn;

    @FXML
    private TableColumn<LegalDocumentationReview, String> documentTableViewColumn;

    @FXML
    private TextField documentTextField;

    @FXML
    private Label legalAdvisorNameLabel;

    @FXML
    private TextField legalAdvisorTextField;

    @FXML
    private Label remarksLabel;

    @FXML
    private TextArea remarksTextArea;

    @FXML
    private Label reviewDateLabel;

    @FXML
    private DatePicker reviewDatePicker;

    @FXML
    private TableColumn<LegalDocumentationReview, LocalDate> reviewDateTableViewColumn;

    @FXML
    private ComboBox<String> reviewStatusComboBox;

    @FXML
    private Label reviewStatusLabel;

    @FXML
    private TableColumn<LegalDocumentationReview, String> statusTableViewColumn;

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
    void saveReviewOnActionButton(ActionEvent event) {

    }

}
