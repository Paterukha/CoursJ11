package files.HW.HW8;

import files.HW.HW8.geometry.Geometry2;
import javafx.application.Application;
import javafx.stage.Stage;



public class TaskGeometry2 extends Application{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGHT);
        primaryStage.setTitle("Потоки");

        Geometry2 geometry2 = new Geometry2(primaryStage);
    }

}
