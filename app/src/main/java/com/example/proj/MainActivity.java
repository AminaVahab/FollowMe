package com.example.proj;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    public void onBackPressed() {

        MainActivity.this.finish();
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LOGIN.class);
                startActivity(intent);
            }
        });
    }
   // public void goTosecond_activity(View view){
   //     Intent intent = new Intent(this,SIGNUP.class);
   //     startActivity(intent);
    //}
}