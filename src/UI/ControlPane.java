package UI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public final class ControlPane extends HBox {
	private Button signInButton;
	private Button signUpButton;

	public ControlPane(){ 
		setAlignment(Pos.CENTER);
		setSpacing(10);
		signInButton = new Button("Sign In");
		signUpButton =  new Button("Sign Up");
		signInButton.setPrefWidth(150);
		signUpButton.setPrefWidth(150);
		getChildren().addAll(signInButton,signUpButton);
		signInButton.setDefaultButton(true);
		// TODO Replace all code in this constructor with your own implementation
	}

	public Button getSignInButton() {
		return signInButton;
	}

	public Button getSignUpButton() {
		return signUpButton;
	}

	
}
