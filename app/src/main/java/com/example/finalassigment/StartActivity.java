package com.example.finalassigment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    // selectedTopicName will be assigned by Quiz no. ('Quiz1', 'Quiz2', 'Quiz3', 'Quiz4')
    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_activity);


        final Button startBtn = findViewById(R.id.startQuizBtn);
        final LinearLayout quiz1Layout = findViewById(R.id.quiz1Layout);
        final LinearLayout quiz2Layout = findViewById(R.id.quiz2Layout);
        final LinearLayout quiz3Layout = findViewById(R.id.quiz3Layout);
        final LinearLayout quiz4Layout = findViewById(R.id.quiz4Layout);

        quiz1Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // assign java to selectedTopicName
                selectedTopicName = "Quiz I";

                // select java layout
                quiz1Layout.setBackgroundResource(R.drawable.round_back_white_stroke10);

                // de-select other layouts
                quiz2Layout.setBackgroundResource(R.drawable.round_back_white10);
                quiz3Layout.setBackgroundResource(R.drawable.round_back_white10);
                quiz4Layout.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        quiz2Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // assign php to selectedTopicName
                selectedTopicName = "Quiz II";

                // select php layout
                quiz2Layout.setBackgroundResource(R.drawable.round_back_white_stroke10);

                // de-select other layouts
                quiz1Layout.setBackgroundResource(R.drawable.round_back_white10);
                quiz3Layout.setBackgroundResource(R.drawable.round_back_white10);
                quiz4Layout.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        quiz3Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // assign html to selectedTopicName
                selectedTopicName = "Quiz III";

                // select HTML layout
                quiz3Layout.setBackgroundResource(R.drawable.round_back_white_stroke10);

                // de-select other layouts
                quiz1Layout.setBackgroundResource(R.drawable.round_back_white10);
                quiz2Layout.setBackgroundResource(R.drawable.round_back_white10);
                quiz4Layout.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        quiz4Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // assign android to selectedTopicName
                selectedTopicName = "Quiz IV";

                // select Android layout
                quiz4Layout.setBackgroundResource(R.drawable.round_back_white_stroke10);

                // de-select other layouts
                quiz1Layout.setBackgroundResource(R.drawable.round_back_white10);
                quiz2Layout.setBackgroundResource(R.drawable.round_back_white10);
                quiz3Layout.setBackgroundResource(R.drawable.round_back_white10);
            }
        });


        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /* if user not selected any topic yet then show a Toast message
                 * selectedTopicName will be empty or default value ("") if user not selected any topic yet*/
                if (selectedTopicName.isEmpty()) {
                    Toast.makeText(StartActivity.this, "Please select a Quiz first", Toast.LENGTH_SHORT).show();
                } else {

                    // Create an Object of Intent to open quiz questions screen
                    final Intent intent = new Intent(StartActivity.this, MainActivity.class);

                    //put user entered name and selected topic name to intent for use in next activity
                    intent.putExtra("selectedTopic", selectedTopicName);

                    // call startActivity to open next activity along with data(userName, selectedTopicName)
                    startActivity(intent);

                    finish(); // finish (destroy) this activity
                }
            }
        });
    }
}