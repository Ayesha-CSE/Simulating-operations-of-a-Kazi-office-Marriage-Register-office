module com.csc213.kazioffice_marriageregisteroffice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.csc213.kazioffice_marriageregisteroffice to javafx.fxml;
    exports com.csc213.kazioffice_marriageregisteroffice;
}