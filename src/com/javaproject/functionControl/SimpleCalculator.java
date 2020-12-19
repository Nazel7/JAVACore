package com.javaproject.functionControl;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        double additionNumber;
        additionNumber = this.firstNumber + this.secondNumber;
        return additionNumber;
    }

    public double getSubtractionResult() {
        double subtractionResult;
        subtractionResult = this.firstNumber - this.secondNumber;
        return subtractionResult;
    }

    public double getMultiplicationResult() {
        double multiplicationResult;
        multiplicationResult = this.firstNumber * this.secondNumber;
        return multiplicationResult;
    }

    public double getDivisionResult() {
        double divisionResult;
        if (this.secondNumber > 0 || this.secondNumber < 0) {
            divisionResult = this.firstNumber / this.secondNumber;
            return divisionResult;
        } else {
            return 0;
        }
    }
}
