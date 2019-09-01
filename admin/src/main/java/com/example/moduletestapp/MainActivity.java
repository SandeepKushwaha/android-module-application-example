package com.example.moduletestapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doctors.SayHello;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "result: "+ SayHello.sayHello(), Toast.LENGTH_LONG).show();

        final EditText editText = findViewById(R.id.doctor_profile_name);
        Button button = findViewById(R.id.button_show_doctor_name);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You Just Entered: " + editText.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });
    }


}
