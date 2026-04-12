package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage window) {
        Button buttonComponent = new Button("This is a button");
        TextField textComponent = new TextField("You can write something inside ...");

        VBox componentGroup = new VBox();
        componentGroup.getChildren().addAll(textComponent, buttonComponent);

        Scene view = new Scene(componentGroup);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(App.class);
    }
}