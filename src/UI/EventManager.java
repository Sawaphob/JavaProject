package UI;
 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

public final class EventManager {
	private DataDisplayPane dataDisplayPane;

	public EventManager(DataDisplayPane dataDisplayPane) {
		this.dataDisplayPane = dataDisplayPane;
	}

	public void setUpPlotButtonEvent(Button plotButton, InputField xInput, InputField yInput) {
		// This uses an event handler instantiated from a nested class.
		plotButton.setOnAction(new PlotButtonEventHandler(xInput, yInput));
	}

	public void setUpClearButtonEvent(Button cancelButton) {
		// This uses an event handler instantiated from an anonymous class. 
		cancelButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				dataDisplayPane.clearData(); 
			}
		});
	}

	private final class PlotButtonEventHandler implements EventHandler<ActionEvent> {
		private InputField xInput;
		private InputField yInput;

		public PlotButtonEventHandler(InputField xInput, InputField yInput) {
			this.xInput = xInput;
			this.yInput = yInput;
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
