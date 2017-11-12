package UI;

import java.awt.Button;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class signUP{
	private static VBox root;
	public signUP() {
		root = new VBox(15);
		root.setAlignment(Pos.BASELINE_CENTER);
		root.setPadding(new Insets(20));
		Image imageb = new Image("file:resources/photo/logInPage/3.jpg");
		root.setBackground(new Background(new BackgroundImage(imageb,null,null,null,new BackgroundSize(1000, 800, false, false,false,true))));
		Image image = new Image("file:resources/photo/logInPage/1.png");
		ImageView pic = new ImageView();
		pic.setFitWidth(408);
		pic.setFitHeight(100);
		pic.setImage(image); 
		root.getChildren().add(pic);
		Text text1 = new Text("Create a new account");
		text1.setFill(Color.WHITESMOKE);
		text1.setFont(Font.font("Verdana",FontWeight.BOLD, 40));
		Text text2 = new Text("Create a new account");
		text2.setFill(Color.WHITESMOKE);
		text2.setFont(Font.font("Verdana",FontPosture.ITALIC, 20));
		root.getChildren().addAll(text1,text2);
		InputField name = new InputField("Name");
		InputField surname = new InputField("Surname");
		InputField email = new InputField("Email");
		InputField conemail = new InputField("Email again");
		HBox hbirth = new HBox(5);
		hbirth.setAlignment(Pos.CENTER);
		DatePicker birthday = new DatePicker();
		birthday.setPromptText("Enter Birthday");
		Label birthl = new Label("Birthday :");
		Label space = new Label("     ");
		birthday.setPrefWidth(250);
		hbirth.getChildren().addAll(birthl,birthday,space);
		root.getChildren().addAll(name,surname,email,conemail,hbirth);
		Button createAccont = new Button("Create Account");
		
	}
	public static VBox getRootPane() {
		return root;
	}
}
