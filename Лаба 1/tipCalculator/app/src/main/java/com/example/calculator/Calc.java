package com.example.calculator;

import java.text.NumberFormat;

public class Calc {
    // Форматирование денежных сумм и процентов
    private static final NumberFormat currencyFormat= NumberFormat.getCurrencyInstance();
    private static final NumberFormat percentFormat = NumberFormat.getPercentInstance();

    private double billAmount; // Сумма счёта
    private double percent; // Процент чаевых
    private double tip; // Сумма чаевых
    private double total; // Итоговая сумма

    public double calculateTip(double billAmount, double percent) {
        return billAmount*percent;
    }

    public double calculateTotal(double billAmount, double percent) {
        return billAmount*(1+percent);
    }


    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
