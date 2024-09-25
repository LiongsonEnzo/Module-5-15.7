import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ChangeCircleColor extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Circle
        Circle circle = new Circle(100); // Radius of the circle is 100
        circle.setFill(Color.WHITE); // Set the initial color to white
        circle.setStroke(Color.BLACK); // Set stroke color to black

        // Set event handler for mouse press
        circle.setOnMousePressed((MouseEvent event) -> {
            circle.setFill(Color.BLACK); // Change the color to black when pressed
        });

        // Set event handler for mouse release
        circle.setOnMouseReleased((MouseEvent event) -> {
            circle.setFill(Color.WHITE); // Change the color to white when released
        });

        // Create a layout and add the circle
        StackPane root = new StackPane();
        root.getChildren().add(circle);

        // Create a scene and place it in the stage
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setTitle("Change Circle Color Using Mouse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
