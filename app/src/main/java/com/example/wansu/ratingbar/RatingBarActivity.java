package com.example.wansu.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingBarActivity extends AppCompatActivity
{
    RatingBar rate;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick()
    {
        rate = (RatingBar) findViewById(R.id.ratingbar1);
        button = (Button) findViewById(R.id.button1);

        //Performing action on Button Click
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Getting the rating and displaying it on the toast
                String rating = String.valueOf(rate.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
            }
        });
    }
}
