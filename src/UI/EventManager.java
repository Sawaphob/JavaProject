package UI;
 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;

public final class EventManager {

	public EventManager() {

	}

	public void setUpSignInButtonEvent(Button signInButton, InputField userInput, PasswordField passInput) {
		// This uses an event handler instantiated from a nested class.
		signInButton.setOnAction(new signInButtonEventHandler(userInput, passInput));
	}

	public void setUpSignUpButtonEvent(Button cancelButton) {
		// This uses an event handler instantiated from an anonymous class. 
		cancelButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				FirstUI.main(null);
			}
		});
	}

	private final class signInButtonEventHandler implements EventHandler<ActionEvent> {
		private InputField userInput;
		private PasswordField passInput;

		public signInButtonEventHandler(InputField xInput, PasswordField passInput) {
			this.userInput = userInput;
			this.passInput = passInput;
		}

		@Override
		public void handle(ActionEvent argo) {
			try {
				double x = Double.parseDouble(xInput.getInputData());
				double y = Double.parseDouble(yInput.getInputData());
				dataDisplayPane.addData(x,y);
				xInput.clearInputData();
				yInput.clearInputData();
				// TODO Implement this block
			} catch (NumberFormatException e) { 
				Alert alert = new Alert(AlertType.ERROR, "INPUT IS NOT A NUMBER", ButtonType.OK);
				alert.show(); 
				e.printStackTrace();
			}
		}
	}
}
