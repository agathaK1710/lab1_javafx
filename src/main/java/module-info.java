module com.example.lab1_javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.lab1_javafx to javafx.fxml;
    exports com.example.lab1_javafx;
    exports com.example.lab1_javafx.controllers;
    opens com.example.lab1_javafx.controllers to javafx.fxml;
}