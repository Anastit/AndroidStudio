package com.example.calculator;

public class Class {
    //объявление преременных
    private double billAmount; // Сумма счёта
    private double percent; // Процент чаевых
    //методы класса
    public double calculateTip(double billAmount, double percent) { return billAmount*percent; }
    public double calculateTotal(double billAmount, double percent) { return billAmount*(1+percent);}
    // Getter and setter:
    public double getBillAmount() { return billAmount; }
    public void setBillAmount(double billAmount) { this.billAmount = billAmount; }

    public double getPercent() { return percent; }
    public void setPercent(double percent) { this.percent = percent; }

}
