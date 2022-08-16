package com.rwn.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //    TextView name_a, surname_a, mobile_a, email_a, birthdata_a, address_a, city_a, country_a, Qualification_a, socicl_a;
    TextView name_t, surname_t, hobby_a, mobile_t, email_t, birthdata_t, address_t, city_t, country_t, Qualification_t, socicl_t;
    Button bake_t, call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name_t = findViewById(R.id.name_a);
        surname_t = findViewById(R.id.surname_a);
        mobile_t = findViewById(R.id.mobile_n);
        email_t = findViewById(R.id.email_a);
        birthdata_t = findViewById(R.id.birthdata_a);
        address_t = findViewById(R.id.address_a);
        city_t = findViewById(R.id.city_a);
        country_t = findViewById(R.id.country_a);
        Qualification_t = findViewById(R.id.Qualification_a);
        socicl_t = findViewById(R.id.social_a);
        bake_t = findViewById(R.id.bake_t);
        hobby_a = findViewById(R.id.hobby_a);

        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String mobile = getIntent().getStringExtra("mobileno");
        String hobby = getIntent().getStringExtra("hobby");
        String email = getIntent().getStringExtra("email");
        String birthdata = getIntent().getStringExtra("birthdata");
        String address = getIntent().getStringExtra("address");
        String city = getIntent().getStringExtra("city");
        String country = getIntent().getStringExtra("country");
        String Qualification = getIntent().getStringExtra("Qualification");
        String socicl = getIntent().getStringExtra("socicl");



        bake_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

//        private void Bidinge ()

        name_t.setText("" + name);
        surname_t.setText("" + surname);
        hobby_a.setText("" + hobby);
        mobile_t.setText("" + mobile);
        email_t.setText("" + email);
        birthdata_t.setText("" + birthdata);
        address_t.setText("" + address);
        city_t.setText("" + city);
        country_t.setText("" + country);
        Qualification_t.setText("" + Qualification);
        socicl_t.setText("" + socicl);


    }
}