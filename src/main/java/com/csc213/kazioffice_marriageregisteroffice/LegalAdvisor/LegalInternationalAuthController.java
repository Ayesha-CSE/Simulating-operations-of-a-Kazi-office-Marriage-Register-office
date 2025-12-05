package com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor;

import com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor.ModelClass.LegalCertificateAuthentication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class LegalInternationalAuthController {

    @FXML
    private TableColumn<LegalCertificateAuthentication, LocalDate> authDateTableViewColumn;

    @FXML
    private DatePicker authenticationDateDatePicker;

    @FXML
    private Label authenticationDateLabel;

    @FXML
    private ComboBox<String> authenticationStatusComboBox;

    @FXML
    private Label authenticationStatusLabel;

    @FXML
    private ComboBox<String> caseIdComboBox;

    @FXML
    private Label caseIdLabel;

    @FXML
    private ComboBox<String> certificateNoComboBox;

    @FXML
    private Label certificateNoLabel;

    @FXML
    private TableColumn<LegalCertificateAuthentication, String> certificateNoTableViewColumn;

    @FXML
    private TextField certificateNoTextField;

    @FXML
    private Label destinationCountryLabel;

    @FXML
    private TextField destinationCountryTextField;

    @FXML
    private Label remarksLabel;

    @FXML
    private TextArea remarksTextArea;

    @FXML
    private TableColumn<LegalCertificateAuthentication, String> statusTableViewColumn;

    @FXML
    void backOnActionButton(ActionEvent event) {

    }

    @FXML
    void clearOnActionButton(ActionEvent event) {

    }

    @FXML
    void loadRecordOnActionButton(ActionEvent event) {

    }

    @FXML
    void saveAuthOnActionButton(ActionEvent event) {

    }

}
