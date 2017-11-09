package UI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class logInMenu {
	private final VBox root;
	public logInMenu() {
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
		Text text = new Text("Welcome to Starbuck's Store.");
		text.setFill(Color.WHITESMOKE);
		text.setFont(Font.font("Verdana",FontPosture.ITALIC, 20));
		root.getChildren().add(text);
		HBox hpass = new HBox(5);
		hpass.setAlignment(Pos.CENTER);
		InputField inputfielduser = new InputField("Email ");
		inputfielduser.setAlignment(Pos.CENTER);
		root.getChildren().add(inputfielduser);
		PasswordField pass = new PasswordField();
		pass.setPromptText("Enter Password");
		Label passl = new Label("Password :");
		Label space = new Label("     ");
		pass.setPrefWidth(250);
		hpass.getChildren().addAll(passl,pass,space);
		root.getChildren().add(hpass);
		ControlPane control = new ControlPane();
		Image image1 = new Image("file:resources/photo/logInPage/2.jpg");
		ImageView pic1 = new ImageView();
		pic1.setFitHeight(150);
		pic1.setFitWidth(642);
		pic1.setImage(image1);
		VirtualKeyboard vk = new VirtualKeyboard();
		vk.root.setAlignment(Pos.BOTTOM_CENTER);
		root.getChildren().addAll(control,pic1,vk.root);
		EventManager event = new EventManager();
		event.setUpSignInButtonEvent(control.getSignInButton(), inputfielduser, pass);
	}
	public VBox getRootPane() {
		return root;
	}
}
