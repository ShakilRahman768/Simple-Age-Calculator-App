package com.example.agecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int Y,M,D;
    private EditText TD,TM,TY,BD,BM,BY;
    private Button B1;
    private TextView T1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TD = (EditText) findViewById(R.id.Tday);
        TM = (EditText) findViewById(R.id.Tmonth);
        TY = (EditText) findViewById(R.id.Tyear);
        BD = (EditText) findViewById(R.id.Bday);
        BM = (EditText) findViewById(R.id.Bmonth);
        BY = (EditText) findViewById(R.id.Byear);
        B1 = (Button) findViewById(R.id.Cal);
        T1 = (TextView) findViewById(R.id.Result);

        B1.setOnClickListener(this);
        T1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        try{

            String n1= TD.getText().toString();
            String n2= TM.getText().toString();
            String n3= TY.getText().toString();
            String m1= BD.getText().toString();
            String m2= BM.getText().toString();
            String m3= BY.getText().toString();

            int nn1 = Integer.parseInt(n1);
            int nn2 = Integer.parseInt(n2);
            int nn3 = Integer.parseInt(n3);
            int mm1 = Integer.parseInt(m1);
            int mm2 = Integer.parseInt(m2);
            int mm3 = Integer.parseInt(m3);

            if(nn1>=mm1){
                D = nn1-mm1;
            }
            else{
                nn1 = nn1+30;
                D = nn1-mm1;
                mm2 = mm2 + 1;
            }

            if(nn2>=mm2){
                M = nn2-mm2;
            }
            else{
                nn2 = nn2+12;
                M = nn2-mm2;
                mm3 = mm3+1;
            }
            Y = nn3-mm3;

            if(v.getId()==R.id.Cal){
                T1.setText("Year = "+Y+"\n"+"Month = "+M+"\n"+"Day = "+D+"\n");
            }

        }catch (Exception e){
            Toast.makeText(MainActivity.this,"Please enter all value",Toast.LENGTH_SHORT).show();

        }


    }
}