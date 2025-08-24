import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.application.Platform;
import javafx.geometry.Pos;
import java.util.Random;

public class DessertGame extends Application {

    private Random random = new Random();
    private Button[] buttons = new Button[8];
    private int score = 0;
    Label scoreLabel = new Label("Score: " + score);

    @Override
    public void start(final Stage stage) {
        // Step 3 & 4
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 640, 480);
        stage.setTitle("Dessert in the Desert JavaFX Game");

        // Step 5
        borderPane.setTop(scoreLabel);
        BorderPane.setAlignment(scoreLabel, Pos.TOP_LEFT);

        Button exitButton = new Button("Exit");
        exitButton.requestFocus();
        exitButton.setOnAction(event -> {
            Platform.exit();
        });
        borderPane.setBottom(exitButton);
        BorderPane.setAlignment(exitButton, Pos.BOTTOM_RIGHT);
        
        // Step 6
        Pane pane = new Pane();
        borderPane.setCenter(pane);
        BorderPane.setAlignment(pane, Pos.CENTER);

        // TODO: Step 7-10
        Button Button1 = new Button("Dessert"); // unique label
        buttons[0] = Button1;
        Button Button2 = new Button("Desert");
        buttons[1] = Button2;
        Button Button3 = new Button("Desert");
        buttons[2] = Button3;
        Button Button4 = new Button("Desert");
        buttons[3] = Button4;
        Button Button5 = new Button("Desert");
        buttons[4] = Button5;
        Button Button6 = new Button("Desert");
        buttons[5] = Button6;
        Button Button7 = new Button("Desert");
        buttons[6] = Button7;
        Button Button8 = new Button("Desert");
        buttons[7] = Button8;

        for (int i = 0; i < buttons.length; i++) {
            pane.getChildren().add(buttons[i]);
        }

        randomizeButtonPositions(random, buttons);

        buttons[0].setOnAction(event -> {
            exitButton.requestFocus();
            score++;
            scoreLabel.setText("Score: " + score);
            randomizeButtonPositions(random, buttons);
        });

        for (int i = 1; i < buttons.length; i++) {
            buttons[i].setOnAction(event -> {
                exitButton.requestFocus();
                score--;
                scoreLabel.setText("Score: " + score);
                randomizeButtonPositions(random, buttons);
            });
        }

        stage.setScene(scene);
        stage.show();
    }

    private void randomizeButtonPositions(Random random, Button[] buttons) {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setLayoutX(random.nextInt(601));
            buttons[i].setLayoutY(random.nextInt(401));
        }
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
