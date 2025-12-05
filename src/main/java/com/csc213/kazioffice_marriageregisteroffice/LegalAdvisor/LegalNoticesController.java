package com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor;

import com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor.ModelClass.LegalNoticeOrderDraft;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class LegalNoticesController {

    @FXML
    private ComboBox<String> caseIdComboBox;

    @FXML
    private Label caseIdLabel;

    @FXML
    private TableColumn<LegalNoticeOrderDraft, String> caseIdTableViewColumn;

    @FXML
    private DatePicker issueDateDatePicker;

    @FXML
    private Label issueDateLabel;

    @FXML
    private TableColumn<LegalNoticeOrderDraft, LocalDate> issueDateTableViewColumn;

    @FXML
    private TableColumn<LegalNoticeOrderDraft, String> niticeTitleTableViewColumn;

    @FXML
    private Label noticeContentLabel;

    @FXML
    private TextArea noticeContentTextArea;

    @FXML
    private Label noticeTitleLabel;

    @FXML
    private TextField noticeTitleTextField;

    @FXML
    private ComboBox<String> noticeTypeComboBox;

    @FXML
    private Label noticeTypeLabel;

    @FXML
    private Label remarksLabel;

    @FXML
    private TextArea remarksTextArea;

    @FXML
    private TableColumn<LegalNoticeOrderDraft, String> typeTableViewColumn;

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
    void saveDraftOnActionButton(ActionEvent event) {

    }

}
