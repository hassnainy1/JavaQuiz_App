package com.example.practiceapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {
            "Java was developed by James Gosling. ",         // Q1
            "Java supports multiple inheritance through classes. ", // Q2
            "Java is a platform-independent language. ",     // Q3
            "JVM stands for Java Virtual Machine. )",         // Q4
            "int is a valid data type in Java.",            // Q5
            "JRE includes the JDK. ",                        // Q6
            "Java does not support Object-Oriented Programming. ", // Q7
            "A constructor is used to initialize objects. ", // Q8
            "Method overloading means same method name with different parameters. ", // Q9
            "Inheritance allows one class to acquire properties of another. " // Q10
    };
    private boolean[] answers = {
            true,   // Q1
            false,  // Q2
            true,   // Q3
            true,   // Q4
            true,   // Q5
            false,  // Q6
            false,  // Q7
            true,   // Q8
            true,   // Q9
            true    // Q10
    };
    TextView textView2 ;
    private  int score = 0 ;

    private  int index = 0 ;
    Button yes;
    Button no ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        textView2 =  findViewById(R.id.textView2);
        textView2.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(index<=questions.length - 1){

                if (answers[index]==true) {
                    score++;

                }
                index++;
                if(index<=questions.length - 1) {
                    textView2.setText(questions[index]);

                }else {
                    Toast.makeText(MainActivity.this, "your Score  is "  +  score, Toast.LENGTH_SHORT).show();

                }

            }else
            {
                Toast.makeText(MainActivity.this, "RESTART YOUR APP", Toast.LENGTH_SHORT).show();
            }
    }
        }
        );
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length - 1){

                if (answers[index]==false) {
                    score++;

                }index++;
                    if(index<=questions.length - 1) {
                    textView2.setText(questions[index]);

                    }else {
                        Toast.makeText(MainActivity.this, "your Score  is "  +  score, Toast.LENGTH_SHORT).show();

                    }

                }else
                {
                    Toast.makeText(MainActivity.this, "RESTART YOUR APP", Toast.LENGTH_SHORT).show();
                }
            }
        });
        }
    }
