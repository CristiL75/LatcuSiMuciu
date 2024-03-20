module com.example.latcusimuciu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.latcusimuciu to javafx.fxml;
    exports com.example.latcusimuciu;
}