package com.rwn.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText name, surname, mobileno, email, birthdata, address, city, country, Qualification, socicl;
    Button submit, reset;
    CheckBox coding, circket, haking;
    RadioButton male, female, other;
    RadioGroup gender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        mobileno = findViewById(R.id.mobile);
        email = findViewById(R.id.email);
        birthdata = findViewById(R.id.birthdata);
        address = findViewById(R.id.adderss);
        city = findViewById(R.id.city);
        country = findViewById(R.id.country);
        Qualification = findViewById(R.id.Qualification);
        socicl = findViewById(R.id.socicl);
        submit = findViewById(R.id.submit);
        reset = findViewById(R.id.reset);
        coding = findViewById(R.id.coding);
        circket = findViewById(R.id.circket);
        haking = findViewById(R.id.hacking);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString();
                String s = surname.getText().toString();
                String m = mobileno.getText().toString();
                String e = email.getText().toString();
                String b = birthdata.getText().toString();
                String a = address.getText().toString();
                String c = city.getText().toString();
                String C = country.getText().toString();
                String q = Qualification.getText().toString();
                String s1 = socicl.getText().toString();
                String o = coding.getText().toString();
                String t = circket.getText().toString();
                String h = haking.getText().toString();


                String hobby = "";

                hobby += "";

                if (circket.isChecked()) {

                    hobby += "Cricket";
                }
                if (coding.isChecked()) {
                    hobby += "coding";
                }
                if (haking.isChecked()) {
                    hobby += "haking";
                }

//                String gender = "";
//
//                gender += "";
//
//                if (male.isChecked()) {
//
//                    gender += "male";
//                }
//                if (female.isChecked()) {
//                    gender += "female";
//                }
//                if (other.isChecked()) {
//                    gender += "other";
//                }

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", n);
                intent.putExtra("surname", s);
                intent.putExtra("mobileno", m);
                intent.putExtra("email", e);
                intent.putExtra("birthdata", b);
                intent.putExtra("address", a);
                intent.putExtra("city", c);
                intent.putExtra("country", C);
                intent.putExtra("Qualification", q);
                intent.putExtra("socicl", s1);
                intent.putExtra("hobby", hobby);
                intent.putExtra("circket", t);
                intent.putExtra("coding", o);
                intent.putExtra("haking", h);
                startActivity(intent);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name.setText("");
                surname.setText("");
                mobileno.setText("");
                email.setText("");
                address.setText("");
                city.setText("");
                country.setText("");
                Qualification.setText("");
                socicl.setText("");
                birthdata.setText("");
            }
        });
    }
}