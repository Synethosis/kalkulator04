module com.example.kalk {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kalk to javafx.fxml;
    exports com.example.kalk;
}