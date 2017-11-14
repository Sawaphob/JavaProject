package UI;

import java.awt.Button;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputMethodTextRun;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class signUP{
	private static VBox root;
	private static StackPane base;
	public signUP() {
		base = new StackPane();
		base.setAlignment(Pos.CENTER);
		base.setPadding(new Insets(20));
		Image imageb = new Image("file:resources/photo/logInPage/3.jpg");
		base.setBackground(new Background(new BackgroundImage(imageb,null,null,null,new BackgroundSize(1000, 800, false, false,false,true))));
		root = new VBox(15);
		root.setAlignment(Pos.BASELINE_CENTER);
		root.setPadding(new Insets(20));
		Image image = new Image("file:resources/photo/logInPage/1.png");
		ImageView pic = new ImageView();
		pic.setFitWidth(408);
		pic.setFitHeight(100);
		pic.setImage(image); 
		root.getChildren().add(pic);
		Canvas canvas = new Canvas(1000,1000);
		canvas.setOpacity(1);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.ROSYBROWN);
		gc.fillRect(100, 100, 1200, 800);
		Text text1 = new Text("Create a new account");
		text1.setFill(Color.WHITESMOKE);
		text1.setFont(Font.font("Verdana",FontWeight.BOLD, 40));
		text1.setTextAlignment(TextAlignment.CENTER);
		Text text2 = new Text("It's free and always will be.");
		text2.setFill(Color.WHITESMOKE);
		text2.setFont(Font.font("Verdana",FontPosture.ITALIC, 20));
		text2.setTextAlignment(TextAlignment.CENTER);
		root.getChildren().addAll(text1,text2);
		TextField name = createTextField("Name", 250);
		TextField surname = createTextField("Surname", 250);
		TextField email = createTextField("Email", 250);
		TextField conemail = createTextField("Confirm Email", 250);
		DatePicker birthday = new DatePicker();
		birthday.setMaxWidth(250);
		birthday.setPromptText("Enter Birthday");
		root.getChildren().addAll(name,surname,email,conemail,birthday);
		base.getChildren().addAll(canvas,root);
		Button createAccont = new Button("Create Account");
		
	}
	public static StackPane getRootPane() {
		return base;
	}
	public TextField createTextField(String text,int width) {
		TextField a = new TextField();
		a.setMaxWidth(width);
		a.setPromptText(text);
		return a;
		
	}
}
