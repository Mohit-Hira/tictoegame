package com.example.tictoegame

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat




class MainActivity : AppCompatActivity() {
    var flag=0;
var count=0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        var button1: Button = findViewById(R.id.button1)
count++;
        button1.setOnClickListener {
            if (flag == 0) {

                button1.setText("x")
                flag = 1;

            } else {
                button1.setText("0")
                flag = 0;
            }

        }

        var button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            if (flag == 0) {

                button2.setText("x")
                flag = 1;
            } else {
                button2.setText("0")
                flag = 0;
            }

        }
        var button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            if (flag == 0) {

                button3.setText("x")
                flag = 1;
            } else {
                button3.setText("0")
                flag = 0;
            }
        }
        var button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener {
            if (flag == 0) {

                button4.setText("x")
                flag = 1;
            } else {
                button4.setText("0")
                flag = 0;
            }
        }
        var button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener {
            if (flag == 0) {

                button5.setText("x")
                flag = 1;
            } else {
                button5.setText("0")
                flag = 0;
            }
        }
        var button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener {
            if (flag == 0) {

                button6.setText("x")
                flag = 1;
            } else {
                button6.setText("0")
                flag = 0;
            }
        }
        var button7: Button = findViewById(R.id.button7)
        button7.setOnClickListener {
            if (flag == 0) {

                button7.setText("x")
                flag = 1;
            } else {
                button7.setText("0")
                flag = 0;
            }
        }
            var button8: Button = findViewById(R.id.button8)
            button8.setOnClickListener {
                if (flag == 0) {

                    button8.setText("x")
                    flag = 1;
                } else {
                    button8.setText("0")
                    flag = 0;
                }
            }
            var button9: Button = findViewById(R.id.button9)
            button9.setOnClickListener {
                if (flag == 0) {

                    button9.setText("x")
                    flag = 1;
                } else {
                    button9.setText("0")
                    flag = 0;
                }
            }
        button1.getText().toString();
        button2.getText().toString();
        button3.getText().toString();
if(button1.equals(button2)&&button2.equals(button3)&&!button1.equals("")){
    Toast.makeText(this, "Winner" +button1, Toast.LENGTH_SHORT).show()
}
        }
    }
