package com.anik.radiobutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //object declaration
    RadioButton btnMale,btnFemale,btnOthers;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMale=findViewById(R.id.btn_male);
        btnFemale=findViewById(R.id.btn_female);
        btnOthers=findViewById(R.id.btn_others);

        btnSubmit=findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String selectedItem="";
                if (btnMale.isChecked())
                {
                    selectedItem="Male";
                }

               else if (btnFemale.isChecked())
                {
                    selectedItem="Female";
                }

              else  if (btnOthers.isChecked())
                {
                    selectedItem="Others";
                }

                Toast.makeText(MainActivity.this, "Selected: "+selectedItem, Toast.LENGTH_SHORT).show();
            }
        });



    }
}
