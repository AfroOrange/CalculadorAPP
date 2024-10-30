package dad;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraApp extends Application {
    private final RootController rootController = new RootController();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene hangmanScene = new Scene(rootController.getRoot());

        Stage hangmanStage = new Stage();

        hangmanStage.setTitle("Calculadora App");
        hangmanStage.setScene(hangmanScene);
        hangmanStage.show();
    }
}
