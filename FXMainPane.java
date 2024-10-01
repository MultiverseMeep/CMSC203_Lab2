package application;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	
	TextField textField;
	
	//student Task #4:
	//  declare an instance of DataManager
	
	DataManager mng = new DataManager();
	Insets inset = new Insets(20);
	
	
	
	
	
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		
		Button button1 = new Button("Hello");
		Button button2 = new Button("Howdy");
		Button button3 = new Button("Chinese");
		Button button4 = new Button("Clear");
		Button button5 = new Button("Exit");
		
		Label label = new Label("Feedback");
		
		textField = new TextField("Textfield");
		
	//  instantiate the HBoxes
		HBox hBox = new HBox(8);
		HBox hBox2 = new HBox(8);
		
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		
		
		hBox2.getChildren().addAll(label, textField);
		
		//  add the buttons to the other HBox
		
		hBox.getChildren().addAll(button1, button2, button3, button4, button5);
		
		//  add the HBoxes to this FXMainPanel (a VBox)
		
		getChildren().addAll(hBox, hBox2);
		
		
		button1.setOnAction(new ButtonHandler());
		button2.setOnAction(new ButtonHandler());
		button3.setOnAction(new ButtonHandler());
		button4.setOnAction(new ButtonHandler());
		button5.setOnAction(new ButtonHandler());
	
		
		
		hBox.setMargin(button1, inset);
		hBox.setMargin(button2, inset);
		hBox.setMargin(button3, inset);
		hBox.setMargin(button4, inset);
		hBox.setMargin(button5, inset);
		hBox.setAlignment(Pos.CENTER);
		
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	
	
	
	class ButtonHandler implements EventHandler<ActionEvent>
	{

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			
			String buttonText = event.getTarget().toString().substring(34).replaceAll("\'", "");
			
			System.out.println(buttonText);
			
			if(buttonText.equals("Hello"))
			{
				textField.setText(mng.getHello());
			}
			else if (buttonText.equals("Howdy"))
			{
				textField.setText(mng.getHowdy());
			}
			else if (buttonText.equals("Chinese"))
			{
				textField.setText(mng.getChinese());
			}
			else if (buttonText.equals("Clear"))
			{
				textField.setText("");
			}
			else if (buttonText.equals("Exit"))
			{
				Platform.exit();
				System.exit(0);
			}
			
		}
		
	}
	
	
}
	
