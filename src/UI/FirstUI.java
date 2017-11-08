package UI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FirstUI extends Application {
 

   // Global ImageView array variable.
    ImageView[] imgView = new ImageView[4];
    int imgIndex = 0;

    public void start(Stage stage) throws FileNotFoundException {
    		StackPane spane = new StackPane();
    		spane.setAlignment(Pos.CENTER);
    		Text text = new Text("Welcome to Starbucks's Store");
    		final Font f = Font.loadFont(new FileInputStream(new File("resources/font/the_King__26_Queen_font.ttf")), 40);
    		text.setFont(f);
//    		text.setFont(font.loadFont(new FileInputStream(new File("file:resources/font/the_King__26_Queen_font.ttf")), 12);
//    		text.setFont(new Font("file:resources/font/the_King__26_Queen_font.ttf",40));
        Pane pane = new Pane();

            imgView[0] = new ImageView(new Image("file:resources/photo/FirstPage/1.jpg"));
            imgView[1] = new ImageView(new Image("file:resources/photo/FirstPage/2.jpg"));
            imgView[2] = new ImageView(new Image("file:resources/photo/FirstPage/3.jpg"));
            imgView[3] = new ImageView(new Image("file:resources/photo/FirstPage/4.jpg"));
            for(int i = 0 ; i<4;i++) {
            imgView[i].setFitWidth(1050);
            imgView[i].setFitHeight(700);
            }
            pane.getChildren().add(imgView[0]);


        EventHandler<ActionEvent> eventHandler = e -> {
            if (imgIndex < 3) {
                // Adding Children
                pane.getChildren().remove(imgView[imgIndex]);
                imgIndex++;
                pane.getChildren().add(imgView[imgIndex]);
                FadeTransition ft = new FadeTransition(Duration.millis(10000), imgView[imgIndex]);
                ft.setFromValue(0.5);
                ft.setToValue(1);
 
                ft.play();
            }
            else if (imgIndex == 3) {
                imgIndex = 0;
                pane.getChildren().remove(imgView[3]);
                pane.getChildren().add(imgView[imgIndex]);
                FadeTransition ft = new FadeTransition(Duration.millis(10000), imgView[imgIndex]);
                ft.setFromValue(0.5);
                ft.setToValue(1);
            }
        };

        // Timeline Animation
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(10000), eventHandler));

        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
        spane.getChildren().addAll(pane,text);
        Scene scene = new Scene(spane);
        stage.setScene(scene);
        stage.setTitle("Starbuck Cooperation");
        stage.show();
    }

    public static void main(String[] args) {
    		launch(args);
    }
}

				