\\U10416030 陳子勤

public class Calculator extends Application {
  @Override
	public void start(Stage primaryStage) {		
		TextField textField = new TextField();
		textField.setAlignment(Pos.CENTER_RIGHT);
		textField.setEditable(false);
		
		Button b0 = new Button("0");
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		Button b7 = new Button("7");
		Button b8 = new Button("8");
		Button b9 = new Button("9");
		Button bP = new Button("+");
		Button bM = new Button("-");
		Button bC = new Button("*");
		Button bD = new Button("/");
		Button bDel = new Button("del");
		Button bCE = new Button("CE");
		Button bC = new Button("C");
		Button bPM = new Button("+/-");
		Button bE = new Button("=");
		Button bDot = new Button(".");	
	}
}
