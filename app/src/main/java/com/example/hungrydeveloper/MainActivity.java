package com.example.hungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView starterscard;
    CardView mainsCard;
    CardView dessertsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        starterscard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_main);
        dessertsCard = findViewById(R.id.card_view_desserts);


        starterscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startersActivityIntent = new Intent(MainActivity.this ,StartersActivity.class);

                startActivity(startersActivityIntent);

            }
        });

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //explicit intent
                Intent mainsActivityIntent = new Intent(MainActivity.this,MainCourcesActivity.class);
                startActivity(mainsActivityIntent);
            }
        });

        dessertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent desserActivityIntent = new Intent(MainActivity.this ,DessertsActivity.class);
                startActivity(desserActivityIntent);
            }
        });

        //explicit intent to send email

//        TextView emailTextView = findViewById(R.id.text_email);
//
//        emailTextView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent launchEmailIntent = new Intent(Intent.ACTION_SENDTO);
//
//                launchEmailIntent.setData(Uri.parse("mailto:sampleemail@gmail.com"));
//                startActivity(launchEmailIntent);
//
//            }
//        });
    }
}