package me.douglas.app_javabasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void changeText(View view){
        TextView text = findViewById(R.id.selectN);

        int n = new Random().nextInt(101);

        text.setText("O Número é: " + n);
    }



}