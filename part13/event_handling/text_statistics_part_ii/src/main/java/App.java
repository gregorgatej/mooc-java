package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;

public class App extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        TextArea textArea = new TextArea("");
        layout.setCenter(textArea);

        Label lettersCount = new Label("Letters: 0");
        Label wordsCount = new Label("Words: 0");
        Label longestWord = new Label("The longest word is:");

        HBox textComponents = new HBox();
        textComponents.setSpacing(20);
        textComponents.getChildren().add(lettersCount);
        textComponents.getChildren().add(wordsCount);
        textComponents.getChildren().add(longestWord);

        layout.setBottom(textComponents);

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            lettersCount.setText("Letters: " + characters);
            wordsCount.setText("Words: " + words);
            longestWord.setText("The longest word is: " + longest);
        });

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(App.class);
    }
}