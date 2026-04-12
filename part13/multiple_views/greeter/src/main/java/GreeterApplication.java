import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {
    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
    @Override
    public void start(Stage window) throws Exception {
        Label instructionText = new Label("Enter your name and start.");
        TextField nameField = new TextField("");
        Button startButton = new Button("Start");

        GridPane enterNameLayout = new GridPane();

        enterNameLayout.add(instructionText, 0,0);
        enterNameLayout.add(nameField, 0,1);
        enterNameLayout.add(startButton, 0,2);

        enterNameLayout.setPrefSize(300, 180);
        enterNameLayout.setAlignment(Pos.CENTER);
        enterNameLayout.setVgap(10);
        enterNameLayout.setHgap(10);
        enterNameLayout.setPadding(new Insets(20, 20, 20, 20));

        Scene enterNameView = new Scene(enterNameLayout);

        Label welcomeText = new Label("Welcome " + null + "!");

        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);

        Scene welcomeView = new Scene(welcomeLayout);

        startButton.setOnAction((event) -> {
            welcomeText.setText("Welcome " + nameField.getText() + "!");
            window.setScene(welcomeView);
        });

        window.setScene(enterNameView);
        window.show();
    }
}