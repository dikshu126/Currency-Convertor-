package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText ed1;
    Button b1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.txtamount);
        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spto);
        b1 = findViewById(R.id.btn1);

        String[] from = {"USD","Indian Rupess","Shrilanka Rupess","Russian Ruble"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
        sp1.setAdapter(ad);

        String[] to = {"Indian Rupess", "Shrilanka Rupess","Russian Ruble","USD"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, to);
        sp2.setAdapter(ad1);

        b1 = findViewById(R.id.btn1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double tot;
                Double amount = Double.parseDouble(ed1.getText().toString());

                if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Indian Rupess") {
                    tot = amount * 83.28;
                    Toast.makeText(getApplicationContext(),tot.toString(), Toast.LENGTH_LONG).show();

                } else
                if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Shrilanka Rupess") {
                    tot = amount * 322.18;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                } else
                if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Russian Ruble") {
                    tot = amount * 101.65;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                } else
                if (sp1.getSelectedItem().toString() == "Indian Rupess" && sp2.getSelectedItem().toString() == "USD") {
                    tot = amount * 0.012;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
                else
                if (sp1.getSelectedItem().toString() == "Indian Rupess" && sp2.getSelectedItem().toString() == "Shrilanka Rupess") {
                    tot = amount * 3.87;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                } else
                if (sp1.getSelectedItem().toString() == "Indian Rupess" && sp2.getSelectedItem().toString() == "Russian Ruble") {
                    tot = amount * 1.22;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                } else
                if (sp1.getSelectedItem().toString() == "Shrilanka Rupess" && sp2.getSelectedItem().toString() == "USD") {
                    tot = amount * 0.0031;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
                else
                if (sp1.getSelectedItem().toString() == "Shrilanka Rupess" && sp2.getSelectedItem().toString() == "Indian Rupess") {
                    tot = amount * 0.26;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                } else
                if (sp1.getSelectedItem().toString() == "Shrilanka Rupess" && sp2.getSelectedItem().toString() == "Russian Ruble") {
                    tot = amount * 0.32;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                } else
                if (sp1.getSelectedItem().toString() == "Russian Ruble" && sp2.getSelectedItem().toString() == "USD") {
                    tot = amount * 0.0099;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
                else
                if (sp1.getSelectedItem().toString() == "Russian Ruble" && sp2.getSelectedItem().toString() == "Indian Rupess") {
                    tot = amount * 0.82;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                } else
                if (sp1.getSelectedItem().toString() == "Russian Ruble" && sp2.getSelectedItem().toString() == "Shrilanka Rupess") {
                    tot = amount * 3.19;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }


            }
        });
    }

}
