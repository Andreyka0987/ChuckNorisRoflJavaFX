package org.example.demos1234;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private ImageView view;

    IModel model = new Model();


    @FXML
    protected void onHelloButtonClick() {
        String joke = model.getRandomChuckJoke();
        String pic = model.getRandomChuckPic();
        Image image = new Image(pic);
            view.setImage(image);
            welcomeText.setText(joke);
    }
}

