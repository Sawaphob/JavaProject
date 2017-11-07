package UI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstUI extends Application {

	@Override
	public void start(Stage primaryStage) {
		VBox root = new VBox(10);
		root.setAlignment(Pos.BASELINE_CENTER);
		root.setPadding(new Insets(20));
		Image image = new Image("https://raw.githubusercontent.com/Sawaphob/JavaProject/master/Font-Starbucks-Logo.png");
		ImageView pic = new ImageView();
		pic.setFitWidth(408);
		pic.setFitHeight(100);
		pic.setImage(image);
		root.getChildren().add(pic);
		Text text = new Text("Welcome to Starbuck's Store.");
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
		Image image1 = new Image("http://www.starbucks.com.sg/images/default-source/homepage-banners/1200fcd8cc452d2168f58d66ff0000024ad1.jpg?Status=Master&sfvrsn=2");
		ImageView pic1 = new ImageView();
		pic1.setImage(image1);
		VirtualKeyboard vk = new VirtualKeyboard();
		vk.root.setAlignment(Pos.BOTTOM_CENTER);
		root.getChildren().addAll(control,pic1,vk.root);
		EventManager event = new EventManager();
		event.setUpSignInButtonEvent(control.getSignInButton(), inputfielduser, pass);
		Scene scene = new Scene(root,Color.BEIGE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Starbuck Cooperation"); 
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
