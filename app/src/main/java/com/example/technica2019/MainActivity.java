package com.example.technica2019;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Handler;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

//will remove once placement is determined -CP

//        listView = (ListView)findViewById(R.id.listview);
//
//
//        ArrayList<String> questions = new ArrayList <>();
//        questions.add("Question 1");
//        questions.add("Question 2");
//        questions.add("Question 3");
//        questions.add("Question 4");
//        questions.add("Question 5");
//        questions.add("Question 6");
//        questions.add("Question 7");
//        questions.add("Question 8");
//        questions.add("Question 9");
//        questions.add("Question 10");
//
//        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,questions);
//
//
//
//        listView.setAdapter(arrayAdapter);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_assignments);
        //Toolbar toolbar = findViewById(R.id.toolbar);

        //Placement for the transition and switch to new page

//This method doesn't work yet
//        TimerTask task = new TimerTask() {
//
//            @Override
//            public void run() {
//                Intent intent = new Intent(SplashScreen.this, MainMenu.class);
//                startActivity(intent);
//                finishScreen();
//            }
//        };
//        Timer t = new Timer();
//        t.schedule(task, 5000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

//                final Intent mainIntent = new Intent(LauchActivity.this, HomeActivity.class);
//                LaunchActivity.this.startActivity(mainIntent);
//                LaunchActivity.this.finish();
            }
        }, 5000);

        //Helps with putting a timer for this activity to work

       openQuestionsPage();



    }

    public void openQuestionsPage(){

        Intent intent = new Intent(this,content_assignments.class);
        startActivity(intent);
    }
//    private void finishScreen){
//        this.finish();
//    }
}
