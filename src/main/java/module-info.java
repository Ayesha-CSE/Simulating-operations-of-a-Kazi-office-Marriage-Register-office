module com.csc213.newproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.csc213.newproject to javafx.fxml;
    exports com.csc213.newproject;
}