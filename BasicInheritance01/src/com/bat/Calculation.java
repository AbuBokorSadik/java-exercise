package com.bat;

public class Calculation {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double addition(){
        return this.firstNumber + this.secondNumber;
    }

    public double addition(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        return this.firstNumber + this.secondNumber;
    }

    public double subtraction(){
        return this.firstNumber - this.secondNumber;
    }

    public double subtraction(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        return this.firstNumber - this.secondNumber;
    }
}
