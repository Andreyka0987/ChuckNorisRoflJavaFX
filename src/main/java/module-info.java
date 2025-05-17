module org.example.demos1234 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;


    opens org.example.demos1234 to javafx.fxml;
    exports org.example.demos1234;
}