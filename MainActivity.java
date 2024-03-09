package com.example.my_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            

        final Button b1=(Button)findViewById(R.id.btngray);
        final Button b2=(Button)findViewById(R.id.btnred);
        final Button b3=(Button)findViewById(R.id.btnyellow);
        final Button b4=(Button)findViewById(R.id.btnblack);
        final Button b5=(Button)findViewById(R.id.btngreen);
        final Button b6=(Button)findViewById(R.id.btnblue);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setMyScreenColor(Color.GRAY);


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.RED);


            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.YELLOW);


            }
        });



        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.BLACK);


            }

        });



        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.GREEN);


            }

        });



        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.BLUE);


            }

        });

    }
    public void setMyScreenColor(int color){
        View view=this.getWindow().getDecorView();
        view.setBackgroundColor(color);


    }
}












