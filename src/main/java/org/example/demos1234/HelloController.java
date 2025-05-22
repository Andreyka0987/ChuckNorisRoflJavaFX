package org.example.demos1234;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import org.example.demos1234.garbage.IModel;
import org.example.demos1234.garbage.Model;
import org.example.demos1234.telegram.TelegramBot;
import org.example.demos1234.telegram.TelegramModel;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField chatIdLabel;

    @FXML
    private TextField messageLabel;

    @FXML
    private ImageView view;

    IModel model = new Model();
    TelegramModel telegramModel = new TelegramBot();

    @FXML
    protected void onHelloButtonClick() {
        telegramModel.sendMessage(Long.parseLong(chatIdLabel.getText()), messageLabel.getText());
    }
}

