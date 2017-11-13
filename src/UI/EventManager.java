package UI;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public final class EventManager {

	public EventManager() {

	}

	public void setUpSignInButtonEvent(Button signInButton, InputField userInput, PasswordField passInput) {
		// This uses an event handler instantiated from a nested class.
		signInButton.setOnAction(new signInButtonEventHandler(userInput, passInput));
	}

	public void setUpSignUpButtonEvent(Button signUpButton) {
		// This uses an event handler instantiated from an anonymous class. 
		signUpButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				FirstUI first = new FirstUI();
				signUP signup = new signUP();
				Stage stage = new Stage();
			    stage.setTitle("Sign Up");
			    VBox myPane = signup.getRootPane();
			    Scene scene = new Scene(myPane,400,600);
			    stage.setScene(scene);
			    stage.show();
				
			}
		});
	}

	private final class signInButtonEventHandler implements EventHandler<ActionEvent> {
		private InputField userInput;
		private PasswordField passInput;
		private String username;
		private String password;
		private Scanner read;
		public signInButtonEventHandler(InputField userInput, PasswordField passInput) {
			this.userInput = userInput;
			this.passInput = passInput;
		}
		 

		@Override
		public void handle(ActionEvent argo) {
			username = userInput.getInputData();
			password = passInput.getText();
			boolean grantAccess = false;
			
			File f = new File("resources/txt/users.txt");
			try {
			     read = new Scanner(f); 
			     while(read.hasNextLine()){
			    	 if(read.nextLine().equals(username+" "+password)){ // if the same user name // check password
				             grantAccess=true; // if also same, change boolean to true
				             break; // and break the for-loop
				          }
				       }
			     if(grantAccess){
			        // let the user continue 
		    	 		Alert alert1 = new Alert(AlertType.CONFIRMATION, "Granted Access", ButtonType.OK);
		    	 		alert1.show();

			        // and do other stuff, for example: move to next window ..etc
			     }
			     else{
			    	 		Alert alert = new Alert(AlertType.ERROR, "Please verify that you've entered everything correctly.", ButtonType.OK);
						alert.show(); 
			         // return Alert message to notify the deny
			     }

			} catch (FileNotFoundException e) {

			        e.printStackTrace();
			}
		}
	}
}
