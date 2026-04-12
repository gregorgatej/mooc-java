package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage window) {
        TextField textField = new TextField("");
        Button buttonComponent = new Button("Update");
        Label textComponent = new Label("");

        buttonComponent.setOnAction((event) -> {
            textComponent.setText(textField.getText());
        });

        VBox componentGroup = new VBox();
        componentGroup.getChildren().addAll(textField, buttonComponent, textComponent);

        Scene view = new Scene(componentGroup);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(App.class);
    }
}