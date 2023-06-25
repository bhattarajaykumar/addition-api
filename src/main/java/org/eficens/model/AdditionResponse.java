package org.eficens.model;

public class AdditionResponse {

    private int num1;

    private int num2;

    private int answer;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public AdditionResponse(int num1, int num2, int answer) {
        this.num1 = num1;
        this.num2 = num2;
        this.answer = answer;
    }

    public AdditionResponse() {

    }
}
