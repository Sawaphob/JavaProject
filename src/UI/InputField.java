package UI;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public final class InputField extends HBox {
	private TextField inputTextField;

	public InputField(String text) {
		
		// TODO Complete this method
		setAlignment(Pos.BASELINE_CENTER);
		setSpacing(5); 
		Label label = new Label(text + " :");
		label.setTextFill(Color.WHITESMOKE);
		getChildren().add(label);
		inputTextField = new TextField();
		inputTextField.setPromptText("Enter "+text);
		inputTextField.setPrefWidth(250);
		getChildren().add(inputTextField);
	}
 
	public String getInputData() {
		// TODO Implement this method
		return inputTextField.getText();
	}

	public void clearInputData() {
		inputTextField.clear();
		// TODO Implement this method
	}
}
