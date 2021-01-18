package com.example.lab1_text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_1 =findViewById(R.id.tv_1); //Связываем переменные с компонентами
        tv_2 =findViewById(R.id.tv_2);
        button =findViewById(R.id.button);
        //Значение в TextView
        tv_1.setText(st1);
        tv_2.setText(st2);
        View.OnClickListener clickbtn = new View.OnClickListener() {
            @Override
            //Обработка события нажатия на кнопку
            public void onClick(View v) {
                st = Pr.PhraserGen();
                st1 = "Всё, что нам нужно - это "+ st +".";
                st2 = letter(st)+" - это всё, что нам нужно.";
                tv_1.setText(st1);
                tv_2.setText(st2);
            }
        };
        button.setOnClickListener(clickbtn);
    }
    private TextView tv_1; //Объявляем переменные
    private TextView tv_2;
    private Button button;
    private Phraser Pr = new Phraser(); //Подключение класса
    String st = Pr.PhraserGen();
    String st1 = "Всё, что нам нужно - это "+ st +".";
    String st2 = letter(st)+" - это всё, что нам нужно.";

    //для того чтобы была заглавная буква
    private  String letter(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}