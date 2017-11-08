package UI;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FirstUI extends Application {
 

   // Global ImageView array variable.
    ImageView[] imgView = new ImageView[4];
    int imgIndex = 0;

    public void start(Stage stage) {

        Pane pane = new Pane();

            imgView[3] = new ImageView(new Image("https://raw.githubusercontent.com/Sawaphob/JavaProject/master/photo/First%20Page/1.jpg"));
            imgView[1] = new ImageView(new Image("https://raw.githubusercontent.com/Sawaphob/JavaProject/master/photo/First%20Page/2.jpg"));
            imgView[2] = new ImageView(new Image("https://raw.githubusercontent.com/Sawaphob/JavaProject/master/photo/First%20Page/3.jpg"));
            imgView[0] = new ImageView(new Image("https://raw.githubusercontent.com/Sawaphob/JavaProject/master/photo/First%20Page/4.jpg"));
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
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("Starbuck Cooperation");
        stage.show();
    }

    public static void main(String[] args) {
    		launch(args);
    }
}

				