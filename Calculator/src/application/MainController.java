package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label; 
import javafx.scene.control.Button; 

public class MainController {
	
	@FXML
	private Label output;
	private double x = 0;
	private String operator = "";
	private boolean start = true;
	private Model model = new Model();
	
	@FXML
	public void processInputNum(ActionEvent event) {
		if (start) {
			output.setText("");
			start = false;
		}
		String value = ((Button)event.getSource()).getText();
		output.setText(output.getText() + value);
	}
	
	@FXML
	public void processOperator(ActionEvent event) {
		String value = ((Button)event.getSource()).getText();
		if (!value.equals("=")) {
			if (!operator.isEmpty())
				return;
			
			operator = value;
			x = Double.parseDouble(output.getText());
			output.setText("");
			
		} else {
			
			if (operator.isEmpty())
				return;
			double y = Double.parseDouble(output.getText());
			double result = model.evaluate(x, y, operator);
			output.setText(String.valueOf(result));
			operator = "";
			start = true;
		}
	}

}
