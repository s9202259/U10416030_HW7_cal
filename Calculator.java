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
	public void start(Stage primaryStage){		
		Menu V= new Menu("檢視(V)");
		MenuBar menu = new MenuBar();
		MenuItem calculator = new MenuItem("計算機");
		
		menu.getMenus().addAll(V);
		V.getItems().addAll(calculator);
		
		TextField textField = new TextField();
		textField.setAlignment(Pos.CENTER_RIGHT);
		textField.setEditable(false);
				
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
			if (hasIndex == false) {
				sum = Double.valueOf(calculate);
				hasIndex = true;
			}
			else {
				if (all.charAt(all.length() - 1) == index) {
					all = all.substring(0, display.length() - 1);
				}
				else {
				}	
			}			
			all += "+";
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
					all = display.substring(0,display.length() - 1);
				}
				else {
				}
			}				
			all += "-";
			calculate += "-";
			index = '-';
			textField.setText(all);
		});

		Button bC = new Button("*");
		bC.setOnAction(e -> {
			if (hasIndex == false) {
				sum = Double.valueOf(calculate);
				hasindex = true;
			}
			else {
				if(all.charAt(all.length() - 1) == index)
					all = all.substring(0, all.length() - 1);
				else{
				}
			}			
			all += "x";
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
					all = all.substring(0,display.length() - 1);
				else {
				}
			}			
			all += "/";
			calculate += "/";
			index = '/';
			textField.setText(all);
		});

		Button bDel = new Button("del");
		bDel.setOnAction(e -> {
			all = all.substring(0, display.length() - 1);
			calculate = calculate.substring(0, compute.length() - 1);
			textField.setText(all);
		});

		Button bCE = new Button("CE");
		bCE.setOnAction(e -> {
			if (hasIndex == true) {
				all = all.substring(0, display.length() - display.lastIndexOf(index));
				calculate = calculate.substring(0, compute.length() - compute.lastIndexOf(index));
			}	
			else {
				all = "";
				calculate = "";
			}
			textField.setText(all);
		});

		Button bc = new Button("C");
		bCc.setOnAction(e -> {
			all = "";
			calculate = "";
			sum = 0;
			hold = "";
			index = '0';
			hasIndex = false;				
			textField.setText(all);
		});
		
		Button bPM = new Button("±");
		bPM.setOnAction(e -> {		
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
			setRemember();
			calculate();			
			all = String.valueOf(sum);
			calculate = all;
			index = '0';
			hasIndex = false;				
			textField.setText(all);
		});
	}
}
