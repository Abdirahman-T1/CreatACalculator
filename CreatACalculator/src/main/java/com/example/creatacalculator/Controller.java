package com.example.creatacalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextField numInput;

    private String currentInput = "" ;
    @FXML private String firstNumber = "";
    private String calculationType;
    @FXML public void initialize() {

    }
    @FXML public void sevenPressed() {
        addNumber("7");
        numInput.setText(currentInput);
    }
    @FXML public void eightPressed() {
        addNumber("8");
        numInput.setText(currentInput);
    }
    @FXML public void ninePressed() {
        addNumber("9");
        numInput.setText(currentInput);
    }

    @FXML public void fourPressed() {
        addNumber("4");
        numInput.setText(currentInput);
    }
    @FXML public void fivePressed() {
        addNumber("5");
        numInput.setText(currentInput);
    }
    @FXML public void sixPressed() {
        addNumber("6");
        numInput.setText(currentInput);
    }

    @FXML public void onePressed() {
        addNumber("1");
        numInput.setText(currentInput);
    }
    @FXML public void twoPressed() {
        addNumber("2");
        numInput.setText(currentInput);
    }
    @FXML public void threePressed() {
        addNumber("3");
        numInput.setText(currentInput);
    }

    @FXML public void zeroPressed() {
        if(!currentInput.isEmpty()){
            addNumber("0");
        }
        numInput.setText(currentInput);
    }
    @FXML public void divPressed() {
        calculationSetup("/");
    }
    @FXML public void timesPressed() {
        calculationSetup("*");
    }
    @FXML public void minPressed() {
        calculationSetup("-");
    }
    @FXML public void cPressed() {
        currentInput = "";
        numInput.setText("");
        firstNumber = "";
    }
    @FXML public void plusPressed() {
        calculationSetup("+");
    }
    @FXML public void equalPressed() {
        calculate();
    }
    @FXML public void calculate() {
        float firstNumberInt = Float.parseFloat(firstNumber);
        float SecondNumberInt = Float.parseFloat(currentInput);
        switch(calculationType) {
            case "+": {
                float calculatedNumber = firstNumberInt + SecondNumberInt;
                numInput.setText(String.valueOf(calculatedNumber));
                break;
            }case "-": {
                float calculatedNumber = firstNumberInt - SecondNumberInt;
                numInput.setText(String.valueOf(calculatedNumber));
                break;
            }case "*": {
                float calculatedNumber = firstNumberInt * SecondNumberInt;
                numInput.setText(String.valueOf(calculatedNumber));
                break;
            }case "/": {
                float calculatedNumber = firstNumberInt / SecondNumberInt;
                numInput.setText(String.valueOf(calculatedNumber));
                break;
            }

        }
    }
    public void calculationSetup(String calculationType) {
        this.calculationType = calculationType;
        firstNumber = currentInput;
        currentInput = "";
        numInput.setText(firstNumber +  calculationType );
    }
    public void addNumber(String number) {
        currentInput += number;
    }
}
