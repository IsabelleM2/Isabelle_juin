/*
 * Author :Isabelle
 * Date   : June, 2,2021
 * Descripition: 
 */

import java.util.List;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Calcule extends Application {

	Group group=new Group();
	Pane pane=new Pane();
	Scene scene=new Scene(pane,400,400);
	

	
	@Override
	public void start(Stage primaryStage) {
		
		
		
		TextField txt1=new TextField("0");
		txt1.setText("Nombre 1");
		pane.getChildren().add(txt1);
		txt1.setLayoutX(20);
		txt1.prefWidthProperty().bind(pane.widthProperty().divide(2));
		txt1.prefHeightProperty().bind(pane.heightProperty().divide(2));

		
		TextField txt2=new TextField("0");
		txt2.setText("Nombre 2");
		pane.getChildren().add(txt2);
		txt2.setLayoutX(20);
		txt2.setLayoutY(100);
		txt2.prefWidthProperty().bind(pane.widthProperty().divide(2));
		txt2.prefHeightProperty().bind(pane.heightProperty().divide(2));

		Label lbl1=new Label("0");
		lbl1.setText("");
		pane.getChildren().add(lbl1);
		lbl1.prefWidthProperty().bind(pane.widthProperty().divide(2));
		lbl1.prefHeightProperty().bind(pane.heightProperty().divide(2));
		lbl1.setLayoutX(20);
		lbl1.setLayoutY(150);
		
		Label lbl2=new Label("0");
		lbl2.setText("");
		pane.getChildren().add(lbl2);
		lbl2.prefWidthProperty().bind(pane.widthProperty().divide(2));
		lbl2.prefHeightProperty().bind(pane.heightProperty().divide(2));
		lbl2.setLayoutX(40);
		lbl2.setLayoutY(150);
		
		
		Label lblR=new Label("0");
		lblR.setText("");
		pane.getChildren().add(lblR);
		lbl2.prefWidthProperty().bind(pane.widthProperty().divide(2));
		lbl2.prefHeightProperty().bind(pane.heightProperty().divide(2));
		lbl2.setLayoutX(80);
		lbl2.setLayoutY(150);
		
		

		Label lbl3=new Label("+");
	//	lbl3.setText("");
		pane.getChildren().add(lbl3);
		lbl3.prefWidthProperty().bind(pane.widthProperty().divide(2));
		lbl3.prefHeightProperty().bind(pane.heightProperty().divide(2));
		lbl3.setLayoutX(40);
		lbl3.setLayoutY(150);

		Label lbl4=new Label("=");
		//lbl4.setText("=");
		pane.getChildren().add(lbl4);
		lbl4.prefWidthProperty().bind(pane.widthProperty().divide(2));
		lbl4.prefHeightProperty().bind(pane.heightProperty().divide(2));
		lbl4.setLayoutX(40);
		lbl4.setLayoutY(150);
		
		
		
		
		lbl1.textProperty().bind(txt1.textProperty());
		lbl2.textProperty().bind(txt2.textProperty());

		
		lbl2.textProperty().addListener((observable,oldValue,newValue) -> {
		
		if(!newValue.matches("^[0-9](\\/[0-9]+)?$)"))
		{
			txt2.setText(newValue.replaceAll("^[0-9](\\/[0-9]+)?$)", ""));
		}
		lblR.setText(Integer.toString((checkLabel(lbl1)))+checkLabel(lbl2));
		});
	


	lbl1.textProperty().addListener((observable, oldValue, newValue) -> {
	
	if(!newValue.matches("^[0-9](\\/[0-9]+)?$)"))
	{
		txt1.setText(newValue.replaceAll("^[0-9](\\/[0-9]+)?$)", ""));
	}
	lblR.setText(Integer.toString((checkLabel(lbl1)))+ checkLabel(lbl2));
});

group.getChildren().addAll(txt1,txt2,lbl1,lbl2,lblR,lbl3,lbl4);

primaryStage.setTitle("Addition");

primaryStage.setScene(scene);
primaryStage.show();

	}
int checkLabel(Label a) {
	int val;
	if(a.getText().equals(""))
		val=0;
	else
		val=Integer.parseInt(a.getText());
	return val;
		
}




	public static void main(String[] args) {
		launch(args);
	}
}
