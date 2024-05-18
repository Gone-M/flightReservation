module com.example.groupassign2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.groupassign2 to javafx.fxml;
    exports com.example.groupassign2;
}