package com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor;

import com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor.ModelClass.LegalCertificateApproval;
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

public class LegalApproveCertificatesController {

    @FXML
    private TextField applicantNameTextField;

    @FXML
    private Label applicantNamesLabel;

    @FXML
    private TableColumn<LegalCertificateApproval, String> applicantsTableViewColumn;

    @FXML
    private DatePicker approvalDateDatepicker;

    @FXML
    private Label approvalDateLabel;

    @FXML
    private ComboBox<String> approvalStatusComboBox;

    @FXML
    private Label approvalStatusLabel;

    @FXML
    private ComboBox<String> certificateIdComboBox;

    @FXML
    private Label certificateIdLabel;

    @FXML
    private TableColumn<LegalCertificateApproval, String> certificateIdTableViewColumn;

    @FXML
    private TableColumn<LegalCertificateApproval, LocalDate> dateTableViewColumn;

    @FXML
    private Label legalAdvisorNameLabel;

    @FXML
    private TextField legalAdvisorNameTextField;

    @FXML
    private Label remarksLabel;

    @FXML
    private TextArea remarksTextArea;

    @FXML
    private Button saveApprovalOnActionButton;

    @FXML
    private TableColumn<LegalCertificateApproval, String> statusTableViewColumn;

    @FXML
    void backOnActionButton(ActionEvent event) {

    }

    @FXML
    void clearOnActionButton(ActionEvent event) {

    }

    @FXML
    void loadCertificateOnActionButton(ActionEvent event) {

    }

}
