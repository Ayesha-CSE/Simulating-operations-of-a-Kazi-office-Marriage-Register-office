package com.csc213.kazioffice_marriageregisteroffice.Witness;

import com.csc213.kazioffice_marriageregisteroffice.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class WitnessDashboardController {

    @FXML
    private BorderPane dashboardBorderPane;

    @FXML
    public void initialize() {

    }


    @FXML
    private void onAttendCeremony(ActionEvent event) {
        loadCenter("/com/csc213/kazioffice_marriageregisteroffice/Witness/witness_attend.fxml");
    }

    @FXML
    private void onVerifyIdentities(ActionEvent event) {
        loadCenter("/com/csc213/kazioffice_marriageregisteroffice/Witness/witness_verify_id.fxml");
    }

    @FXML
    private void onConfirmConsent(ActionEvent event) {
        loadCenter("/com/csc213/kazioffice_marriageregisteroffice/Witness/witness_consent.fxml");
    }

    @FXML
    private void onSignDocuments(ActionEvent event) {
        loadCenter("/com/csc213/kazioffice_marriageregisteroffice/Witness/witness_sign_documents.fxml");
    }

    @FXML
    private void onSubmitDocuments(ActionEvent event) {
        loadCenter("/com/csc213/kazioffice_marriageregisteroffice/Witness/witness_submit_documents.fxml");
    }

    @FXML
    private void onCourtTestimony(ActionEvent event) {
        loadCenter("/com/csc213/kazioffice_marriageregisteroffice/Witness/witness_testify.fxml");
    }

    @FXML
    private void onInvestigationCooperation(ActionEvent event) {
        loadCenter("/com/csc213/kazioffice_marriageregisteroffice/Witness/witness_investigation.fxml");
    }

    @FXML
    private void onDocumentAccuracyCheck(ActionEvent event) {
        loadCenter("/com/csc213/kazioffice_marriageregisteroffice/Witness/witness_doc_accuracy.fxml");
    }


    private void loadCenter(String fxmlPath) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlPath));
            Parent view = fxmlLoader.load();
            dashboardBorderPane.setCenter(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
