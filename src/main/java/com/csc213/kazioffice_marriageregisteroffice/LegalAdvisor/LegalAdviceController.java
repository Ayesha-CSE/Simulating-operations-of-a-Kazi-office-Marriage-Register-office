package com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor;

import com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor.ModelClass.LegalAdviceRecord;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class LegalAdviceController {

    @FXML
    private DatePicker AdviceDatePicker;

    @FXML
    private Label adviceDateLabel;

    @FXML
    private TableColumn<LegalAdviceRecord, LocalDate> adviceDateTableViewColumn;

    @FXML
    private Label adviceDetailsLabel;

    @FXML
    private TextArea adviceDetailsTextArea;

    @FXML
    private Label advisorNameLabel;

    @FXML
    private TableColumn<LegalAdviceRecord, String> advisorNameTableViewColumn;

    @FXML
    private TextField advisorNameTextField;

    @FXML
    private ComboBox<String> caseIdComboBox;

    @FXML
    private Label caseIdLabel;

    @FXML
    private TableColumn<LegalAdviceRecord, String> caseIdTableViewColumn;

    @FXML
    private Label remarksLabel;

    @FXML
    private TextArea remarksTextArea;

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
    void saveAdviceOnActionButton(ActionEvent event) {

    }

}
