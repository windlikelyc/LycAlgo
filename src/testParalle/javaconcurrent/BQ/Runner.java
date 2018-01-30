package testParalle.javaconcurrent.BQ;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Random;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

public class Runner extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label message = new Label("haha");
        Date date = new Date();

        primaryStage.setScene(new Scene(message));
        primaryStage.setTitle("Hello");
        primaryStage.show();

    }
}
