\\U10416030 陳子勤

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Parent;
import java.util.*;

public class Calculator extends Application {

	public ArrayList<Double> number = new ArrayList<Double>();
	public ArrayList<String> numberShow = new ArrayList<String>();
	public String all = "";
	public String hold = "";
	public String calculate = "";
	public double sum;
	public double holdSum;
	public char index = '0';
	public boolean hasIndex = false;
	
	@Override
	public void start(Stage primaryStage) {
		TextField textField = new TextField();
		textField.setAlignment(Pos.CENTER_RIGHT);
		textField.setEditable(false);
		textField.setText("0");
				
		Button b0 = new Button("0");
		b0.setOnAction(e -> {
			all += "0";
			calculate += "0";
			textField.setText(all);
		});

		Button b1 = new Button("1");
		b1.setOnAction(e -> {
			all += "1";
			calculate += "1";
			textField.setText(all);
		});


		Button b2 = new Button("2");
		b2.setOnAction(e -> {
			all += "2";
			calculate += "2";
			textField.setText(all);
		});

		Button b3 = new Button("3");
		b3.setOnAction(e -> {
			all += "3";
			calculate += "3";
			textField.setText(all);
		});

		Button b4 = new Button("4");
		b4.setOnAction(e -> {
			all += "4";
			calculate += "4";
			textField.setText(all);
		});

		Button b5 = new Button("5");
		b5.setOnAction(e -> {
			all += "5";
			calculate += "5";
			textField.setText(all);
		});

		Button b6 = new Button("6");
		b6.setOnAction(e -> {
			all += "6";
			calculate += "6";
			textField.setText(all);
		});

		Button b7 = new Button("7");
		b7.setOnAction(e -> {
			all += "7";
			calculate += "7";
			textField.setText(all);
		});

		Button b8 = new Button("8");
		b8.setOnAction(e -> {
			all += "8";
			calculate += "8";
			textField.setText(all);
		});

		Button b9 = new Button("9");
		b9.setOnAction(e -> {
			all += "9";
			calculate += "9";
			textField.setText(all);
		});

		Button bDot = new Button(".");	
		bDot.setOnAction(e -> {
			all += ".";
			calculate += ".";
			textField.setText(all);
		});

		Button bP = new Button("+");
		bP.setOnAction(e -> {	
			if(hasIndex == false) {
				sum = Double.valueOf(calculate);
				hasIndex = true;
			}
			else {
				if (all.charAt(all.length() - 1) == index) {
					all = all.substring(0, all.length() - 1);
				}
				else {
					hold();
					calculate();
				}	
			}			
			all += " + ";
			calculate += "+";
			index = '+';
			textField.setText(all);
		});

		Button bM = new Button("-");
		bM.setOnAction(e -> {
			if (hasIndex == false) {
				sum = Double.valueOf(calculate);
				hasIndex = true;
			}
			else {
				if (all.charAt(all.length() - 1) == index) {
					all = all.substring(0, all.length() - 1);
				}
				else {
					hold();
					calculate();
				}
			}				
			all += " - ";
			calculate += "-";
			index = '-';
			textField.setText(all);
		});

		Button bC = new Button("*");
		bC.setOnAction(e -> {
			if (hasIndex == false) {
				sum = Double.valueOf(calculate);
				hasIndex = true;
			}
			else {
				if(all.charAt(all.length() - 1) == index)
					all = all.substring(0, all.length() - 1);
				else{
					hold();
					calculate();
				}
			}			
			all += " x ";
			calculate += "x";
			index = 'x';
			textField.setText(all);
		});

		Button bD = new Button("/");
		bD.setOnAction(e -> {	
			if (hasIndex == false) {
				sum = Double.valueOf(calculate);
				hasIndex = true;
			}
			else {
				if (all.charAt(all.length() - 1) == index)
					all = all.substring(0, all.length() - 1);
				else {
					hold();
					calculate();
				}
			}			
			all += " ÷ ";
			calculate += "÷";
			index = '÷';
			textField.setText(all);
		});

		Button bDel = new Button("del");
		bDel.setOnAction(e -> {
			all = all.substring(0, all.length() - 1);
			calculate = calculate.substring(0, calculate.length() - 1);
			textField.setText(all);
		});

		Button bCE = new Button("CE");
		bCE.setOnAction(e -> {
			if (hasIndex == true) {
				all = all.substring(0, all.length() - all.lastIndexOf(index));
				calculate = calculate.substring(0, calculate.length() - calculate.lastIndexOf(index));
			}	
			else {
				all = "";
				calculate = "";
			}
			textField.setText("0");
		});

		Button bc = new Button("C");
		bc.setOnAction(e -> {
			all = "";
			calculate = "";
			sum = 0;
			hold = "";
			index = '0';
			hasIndex = false;				
			textField.setText("0");
		});

		Button bPM = new Button("±");
		bPM.setOnAction(e -> {
			hold();
			if (index == '0') {
				calculate();
				sum *= (-1);
				all = String.valueOf(sum);
				calculate = all;
				textField.setText(all);
			}
			hold = "";		
		});

		Button bE = new Button("=");
		bE.setOnAction(e -> {
			hold();
			calculate();			
			all = String.valueOf(sum);
			calculate = all;
			index = '0';
			hasIndex = false;				
			textField.setText(all);
		});
		
		b0.setPrefSize(62, 30);
		b1.setPrefSize(62, 30);
		b2.setPrefSize(62, 30);
		b3.setPrefSize(62, 30);
		b4.setPrefSize(62, 30);
		b5.setPrefSize(62, 30);
		b6.setPrefSize(62, 30);
		b7.setPrefSize(62, 30);
		b8.setPrefSize(62, 30);
		b9.setPrefSize(62, 30);
		bDot.setPrefSize(62, 30);
		bP.setPrefSize(62, 30);
		bM.setPrefSize(62, 30);
		bC.setPrefSize(62, 30);
		bD.setPrefSize(62, 30);
		bDel.setPrefSize(62, 30);
		bCE.setPrefSize(62, 30);
		bc.setPrefSize(62, 30);
		bPM.setPrefSize(62, 30);
		bE.setPrefSize(62, 30);

		StackPane paneTextField = new StackPane();
		Pane pane = new VBox();
		HBox first = new HBox();
		HBox second = new HBox();
		HBox third = new HBox();
		HBox fourth = new HBox();
		HBox fifth = new HBox();

		first.getChildren().addAll(bDel, bCE, bc, bPM);
		second.getChildren().addAll(b7, b8, b9, bD);
		third.getChildren().addAll(b4, b5, b6, bC);
		fourth.getChildren().addAll(b1, b2, b3, bM);
		fifth.getChildren().addAll(bDot, b0, bP, bE);
		

		paneTextField.getChildren().add(textField);
		pane.getChildren().addAll(paneTextField, first, second,
				third, fourth, fifth);			
		
		Scene scene = new Scene(pane, 250, 250);
		
		primaryStage.setTitle("U10416030 計算機");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void hold() {			
		for(int i = 1 + calculate.lastIndexOf(index); i < calculate.length(); i++){
			hold += calculate.charAt(i);	
		}			
	}
	
	public void calculate() {		
		switch(index) {
			case '+':				
				sum += Double.valueOf(hold);
				break;
			case '-':
				sum -= Double.valueOf(hold);
				break;
			case 'x':
				sum *= Double.valueOf(hold);
				break;
			case '÷':
				sum /= Double.valueOf(hold);
				break;
			case '0':
				sum = Double.valueOf(hold);
				break;
		}
		hold = "";		
	}
	
	public void calculateSum(){
		holdSum = number.get(0);
		for(int i = 0; i < numberShow.size(); i++){
			if (numberShow.get(i) == "+") {
				holdSum += number.get(i + 1);
			}
			else {
				holdSum -= number.get(i + 1);
			}				
		}
	}

	public static void main(String[] args) {
		launch();
	}
}
