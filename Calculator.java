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
		
		Button bP = new Button("+");
		Button bM = new Button("-");
		Button bC = new Button("*");
		Button bD = new Button("/");
		Button bDel = new Button("del");
		Button bCE = new Button("CE");
		Button bCc = new Button("C");
		Button bPM = new Button("±");
		Button bE = new Button("=");

		Button bDot = new Button(".");	
		bDot.setOnAction(e -> {
			all += ".";
			calculate += ".";
			textField.setText(all);
		});	
	}
}
