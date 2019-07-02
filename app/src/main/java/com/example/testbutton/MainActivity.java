package com.example.testbutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタンを設定
        Button button= findViewById(R.id.button);

        //TextViewの設定
        textView = findViewById(R.id.text_view);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //flagがtrueのとき
                if(flag){
                    //textView.setText(R.string.hello);
                    textView.setText("Hello");
                    flag = false;
                }

                //flagがfalseのとき
                else{
                    //textView.setText(R.string.world);
                    textView.setText("World");
                    flag = true;
                }
            }

        });
    }
}
