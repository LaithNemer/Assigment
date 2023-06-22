package com.example.ass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Scincee extends AppCompatActivity {
    private RadioButton radio1;
    private RadioButton radio2;
    private RadioButton radio3;
    private RadioButton radio4;
    private RadioButton radio5;
    private RadioButton radio6;
    private RadioButton radio7;
    private RadioButton radio8;
    private RadioButton radio9;
    private RadioButton radio10;
    private TextView texthidden;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scincee);
        radio1=findViewById(R.id.radioButton1);
        radio2=findViewById(R.id.radioButton2);
        radio3=findViewById(R.id.radioButtom3);
        radio4=findViewById(R.id.radioButtom4);
        radio5=findViewById(R.id.radioButtom5);
        radio6=findViewById(R.id.radioButtom6);
        radio7=findViewById(R.id.radioButtom7);
        radio8=findViewById(R.id.radioButtom8);
        radio9=findViewById(R.id.radioButtom9);
        radio10=findViewById(R.id.radioButtom10);
        texthidden=findViewById(R.id.textIsHidden);



    }

    public void btnResult(View view) {

        int counter=0;

        if(radio1.isChecked()){
            counter++;
        }
        if(radio3.isChecked()){
            counter++;

        }

        if(radio6.isChecked()){
            counter++;

        }
        if(radio8.isChecked()){
            counter++;
        }

        if(radio10.isChecked()){
            counter++;

        }

        texthidden.setVisibility(View.VISIBLE);
        if(counter==5){
            texthidden.setText("Excellent ... all is correct");
        }
        else if(counter==4){
            texthidden.setText("very good : "+ counter);
        }
        else if(counter==3){
            texthidden.setText("good : " + counter);
        }
        else {
            texthidden.setText("bad ... try again");
        }
    }

    public void btnReset(View view) {

        radio10.setChecked(false);
        radio1.setChecked(false);
        radio2.setChecked(false);
        radio3.setChecked(false);
        radio4.setChecked(false);
        radio5.setChecked(false);
        radio6.setChecked(false);
        radio7.setChecked(false);
        radio8.setChecked(false);
        radio9.setChecked(false);

    }
}