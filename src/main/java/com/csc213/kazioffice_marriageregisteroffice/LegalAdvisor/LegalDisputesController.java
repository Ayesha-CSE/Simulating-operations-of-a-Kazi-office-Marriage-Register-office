package com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor;

import com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor.ModelClass.LegalDisputeCase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LegalDisputesController {

    @FXML
    private ComboBox<String> caseIdComboBox;

    @FXML
    private Label caseIdLabel;

    @FXML
    private TableColumn<LegalDisputeCase, String> caseIdTableViewColumn;

    @FXML
    private Label disputeDateLabel;

    @FXML
    private DatePicker disputeDatePicker;

    @FXML
    private Label disputeDecriptionLabel;

    @FXML
    private Label disputeIdLabel;

    @FXML
    private TableColumn<LegalDisputeCase, String> disputeIdTableViewColumn;

    @FXML
    private TextField disputeIdTextField;

    @FXML
    private TextArea disputeTextArea;

    @FXML
    private Label raisedByLabel;

    @FXML
    private TableColumn<LegalDisputeCase, String> raisedByTableViewColumn;

    @FXML
    private TextField raisedByTextField;

    @FXML
    private ComboBox<String> resolutionComboBox;

    @FXML
    private Label resolutionStatusLabel;

    @FXML
    private TableColumn<LegalDisputeCase, String> statusTableViewColumn;

    @FXML
    void backOnActionButton(ActionEvent event) {

    }

    @FXML
    void clearOnActionButton(ActionEvent event) {

    }

    @FXML
    void loadOnActionButton(ActionEvent event) {

    }

    @FXML
    void saveDisputeOnActionButton(ActionEvent event) {

    }

}
