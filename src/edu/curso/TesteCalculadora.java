package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TesteCalculadora extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p1 = new Pane();
		Scene sc1 = new Scene(p1, 220, 210);
		
		primaryStage.setScene(sc1);
		primaryStage.setTitle("Calculadora");
		primaryStage.show();
		
		TextField txtCalc = new TextField();
		txtCalc.relocate(20, 10);
		p1.getChildren().add(txtCalc);
		
		Button btnCE = new Button("CE");
		btnCE.relocate(180, 10);
		p1.getChildren().add(btnCE);
		
		Button btn1 = new Button("1");
		btn1.relocate(20, 50);
		p1.getChildren().add(btn1);
		
		Button btn2 = new Button("2");
		btn2.relocate(60, 50);
		p1.getChildren().add(btn2);
		
		Button btn3 = new Button("3");
		btn3.relocate(100, 50);
		p1.getChildren().add(btn3);
		
		Button btnMais = new Button("+");
		btnMais.relocate(140, 50);
		p1.getChildren().add(btnMais);
		
		Button btn4 = new Button("4");
		btn4.relocate(20, 90);
		p1.getChildren().add(btn4);
		
		Button btn5 = new Button("5");
		btn5.relocate(60, 90);
		p1.getChildren().add(btn5);
		
		Button btn6 = new Button("6");
		btn6.relocate(100, 90);
		p1.getChildren().add(btn6);
		
		Button btnMenos = new Button("-");
		btnMenos.relocate(140, 90);
		p1.getChildren().add(btnMenos);
		
		Button btn7 = new Button("7");
		btn7.relocate(20, 130);
		p1.getChildren().add(btn7);
		
		Button btn8 = new Button("8");
		btn8.relocate(60, 130);
		p1.getChildren().add(btn8);
		
		Button btn9 = new Button("9");
		btn9.relocate(100, 130);
		p1.getChildren().add(btn9);
		
		Button btnMultiplicaçao = new Button("*");
		btnMultiplicaçao.relocate(140, 130);
		p1.getChildren().add(btnMultiplicaçao);
		
		Button btnIgualdade = new Button("=");
		btnIgualdade.relocate(20, 170);
		p1.getChildren().add(btnIgualdade);
		
		Button btn0 = new Button("0");
		btn0.relocate(60, 170);
		p1.getChildren().add(btn0);
		
		Button btnVirgula = new Button(",");
		btnVirgula.relocate(100, 170);
		p1.getChildren().add(btnVirgula);
		
		Button btnDivisao = new Button("/");
		btnDivisao.relocate(140, 170);
		p1.getChildren().add(btnDivisao);
	}
	
	public static void main(String[] args) {
		Application.launch(TesteCalculadora.class, args);
	}

}
