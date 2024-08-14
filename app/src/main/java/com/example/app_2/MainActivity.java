package com.example.app_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView_text1,textView2_text2,textView3_text3,textView4_text4;
    private Button button1_text1,button3_text3;
    private boolean textFlag,text2Flag,text3Flag;
    private Button button2_text2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView_text1 = (TextView) findViewById(R.id.textView_text1);
        textView2_text2 = (TextView) findViewById(R.id.textView2_text2);
        textView3_text3 = (TextView) findViewById(R.id.textView3_text3);
        textView4_text4 = (TextView) findViewById(R.id.textView4_text4);
        button1_text1 = (Button) findViewById(R.id.button1_text1);


        textFlag=true;
        button1_text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textFlag) {
                    textView_text1.setText("歡迎光臨吳柏毅店家");
                    textView2_text2.setText("肉包");
                    textView3_text3.setText("菜包");
                    textView4_text4.setText("素包");
                    textFlag = false;
                }else
                {
                    textView_text1.setText("黑店我們賣很貴");
                    textView2_text2.setText("人肉包");
                    textView3_text3.setText("人肉素包");
                    textView4_text4.setText("人肉火腿");
                    textFlag = true;

                }

            }
        });
            button2_text2 =(Button) findViewById(R.id.button2_text2);
        text2Flag =true;
        button2_text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text2Flag) {
                    textView2_text2.setText("人肉包");
                    textView3_text3.setText("人肉素包");
                    textView4_text4.setText("人肉火腿");
                    text2Flag = false;
                }else {
                    textView2_text2.setText("賣完");
                    textView3_text3.setText("賣完");
                    textView4_text4.setText("賣完");
                    text2Flag =true;
                }

            }
        });



        button3_text3 =(Button) findViewById(R.id.button3_text3);
        text3Flag =true;
        button3_text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text3Flag) {
                    textView2_text2.setText("肉包");
                    textView3_text3.setText("菜包");
                    textView4_text4.setText("素包");
                    text3Flag = false;
                }else {
                    textView2_text2.setText("加1");
                    textView3_text3.setText("加1");
                    textView4_text4.setText("加1");
                    text3Flag =true;
                }

            }
        });

    }
}