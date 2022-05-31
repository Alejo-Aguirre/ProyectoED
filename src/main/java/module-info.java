module com.example.juegoed {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.juegoed to javafx.fxml;
    exports com.example.juegoed;
}