package UI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FirstUI extends Application {


	// Global ImageView array variable.
	Stage primaryStage;
	ImageView[] imgView = new ImageView[4]; 
	int imgIndex = 0;
	EventHandler<MouseEvent> circleOnMousePressedEventHandler;
	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {
		StackPane spane = new StackPane();
		spane.setAlignment(Pos.CENTER);
		Text text = new Text("Welcome to Starbucks's Store");
		final Font f = Font.loadFont(new FileInputStream(new File("resources/font/the_King__26_Queen_font.ttf")), 40);
		text.setFont(f);
		VBox pane = new VBox();

		imgView[1] = new ImageView(new Image("file:resources/photo/FirstPage/1.jpg"));
		imgView[0] = new ImageView(new Image("file:resources/photo/FirstPage/2.jpg"));
		imgView[2] = new ImageView(new Image("file:resources/photo/FirstPage/3.jpg"));
		imgView[3] = new ImageView(new Image("file:resources/photo/FirstPage/4.jpg"));
		for(int i = 0 ; i<4;i++) {
			imgView[i].setFitWidth(1050);
			imgView[i].setFitHeight(700);
		}
		pane.getChildren().add(imgView[imgIndex]);
		imgView[0].setCursor(Cursor.CLOSED_HAND);
		imgView[0].setOnMouseClicked(circleOnMousePressedEventHandler);
		pane.setAlignment(Pos.CENTER);


		EventHandler<ActionEvent> eventHandler = e -> {
			if (imgIndex < 3) {
				// Adding Children
				pane.getChildren().remove(imgView[imgIndex]);
				imgIndex++;
				pane.getChildren().add(imgView[imgIndex]);
				imgView[imgIndex].setCursor(Cursor.CLOSED_HAND);
				imgView[imgIndex].setOnMouseClicked(circleOnMousePressedEventHandler);
				FadeTransition ft = new FadeTransition(Duration.millis(2000), imgView[imgIndex]);
				ft.setFromValue(0.5);
				ft.setToValue(1);
				ft.play();
			}
			else if (imgIndex == 3) {
				imgIndex = 0;
				pane.getChildren().remove(imgView[3]);
				pane.getChildren().add(imgView[imgIndex]);
				imgView[imgIndex].setCursor(Cursor.CLOSED_HAND);
				imgView[imgIndex].setOnMouseClicked(circleOnMousePressedEventHandler);
				FadeTransition ft = new FadeTransition(Duration.millis(2000), imgView[imgIndex]);
				ft.setFromValue(0.5);
				ft.setToValue(1);
			}
		};

		// Timeline Animation
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(3000), eventHandler));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		spane.getChildren().addAll(pane,text);
		Scene scene = new Scene(spane);
		primaryStage.setScene(scene); 
		primaryStage.setFullScreen(true);
		primaryStage.setTitle("Starbucks Cooperation"); 
		primaryStage.show(); 
		circleOnMousePressedEventHandler = new EventHandler<MouseEvent>() {
			public void handle(MouseEvent t) {
				logInMenu login = new logInMenu();
				login.setStage();
				primaryStage.close();
			}
		};
	}
	public Stage getStage() {
		return primaryStage;
	}
}

