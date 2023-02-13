package ru.mirea.gunov.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;
    TextView textView;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        checkBox = findViewById(R.id.b1);
        textView = findViewById(R.id.t6);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count ++;
                if (count % 2 != 0) {
                    textView.setText("Ваш купон: jvsdgvyf345hgg45chg");
                } else {
                    textView.setText("Без галочки не будет скидки");
                }
            }
        });
    }
}