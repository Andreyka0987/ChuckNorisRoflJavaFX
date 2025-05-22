module org.example.demos1234 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;
    requires telegrambots;
    requires telegrambots.meta;


    opens org.example.demos1234 to javafx.fxml;
    exports org.example.demos1234;
    exports org.example.demos1234.telegram;
    opens org.example.demos1234.telegram to javafx.fxml;
    exports org.example.demos1234.garbage;
    opens org.example.demos1234.garbage to javafx.fxml;
}