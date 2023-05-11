package com.fpoly.testcomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.bai2);

        EditText editTextName = findViewById(R.id.txtName);
        EditText editTextMSSV = findViewById(R.id.txtMSSV);
        EditText editTextAge = findViewById(R.id.txtAge);
        RadioButton male = findViewById(R.id.rdoBoy);
        RadioButton female = findViewById(R.id.rdoGirl);
        CheckBox ball = findViewById(R.id.chkFootball);
        CheckBox game = findViewById(R.id.chkPlaygame);
        TextView txtView = findViewById(R.id.showResutl);





        Button btnSave = findViewById(R.id.saveInformation);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String mssv = editTextMSSV.getText().toString();
                String age = editTextAge.getText().toString();
                String gender;
                String favorite;
                if(male.isChecked()){
                    gender="Nam";
                }else{
                    gender="Nữ";
                }

                if(ball.isChecked() && game.isChecked()){
                    favorite="Bóng đá và chơi game";
                }else{
                    if(ball.isChecked()){
                        favorite="Bóng đá";
                    }else {
                        favorite="Chơi game";
                    }
                }
                txtView.setText("Tên của bạn là:"+name+"\n"
                                +"Mssv là:"+mssv+"\n"
                                +"Tuổi là:"+age+"\n"
                        +"Giới tính là :"+gender+"\n"
                        +"Sở thích là:"+favorite
                );
            }
        });


    }





}