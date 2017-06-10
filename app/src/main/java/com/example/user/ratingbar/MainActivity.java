package com.example.user.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
     RatingBar rbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);
        rbar = (RatingBar)findViewById(R.id.ratingBar);


    }

    public void OnButtonClick(View v){

        float ratinvalue = rbar.getRating();
        Toast.makeText(MainActivity.this,"Rating is " +ratinvalue,Toast.LENGTH_SHORT).show();
    }
}
