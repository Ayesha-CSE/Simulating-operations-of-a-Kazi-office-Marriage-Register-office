module com.csc213.kazioffice_marriageregisteroffice {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.csc213.kazioffice_marriageregisteroffice.Witness to javafx.fxml;
    opens com.csc213.kazioffice_marriageregisteroffice.Witness.ModelClass to javafx.fxml;
    opens com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor to javafx.fxml;
    opens com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor.ModelClass to javafx.fxml;
    opens com.csc213.kazioffice_marriageregisteroffice.Kazi to javafx.fxml;
//    opens com.csc213.kazioffice_marriageregisteroffice.MarriageRegister to javafx.fxml;
    //opens com.csc213.kazioffice_marriageregisteroffice.Kazi.ModelClass to javafx.fxml;
    opens com.csc213.kazioffice_marriageregisteroffice to javafx.fxml;
    exports com.csc213.kazioffice_marriageregisteroffice;
}