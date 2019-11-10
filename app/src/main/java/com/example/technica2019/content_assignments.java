package com.example.technica2019;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class content_assignments extends AppCompatActivity {




    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_assignments);

        listView = (ListView) findViewById(R.id.listview);


        ArrayList<String> questions = new ArrayList<>();
        questions.add("Due: November 10, 10 a.m.                        ETC: 1 hr " +
                "\nFuture of Technology Presentation" +
                "\nENC 3249");
        questions.add("Due: November 10, 2 p.m.                          ETC: 40 mins " +
                "\nCalculus Assignment" +
                "\nMAC 2312");
        questions.add("Due: November 11, 11 p.m.                        ETC: 2 hrs " +
                "\nFuture of Technology Reflection Essay" +
                "\nENC 3249");
        questions.add("Due: November 11, 8 a.m.                          ETC: 50 mins " +
                "\nOpinion Paper" +
                "\nIDH 3034");
        questions.add("Due: November 11, 8 a.m.                          ETC: 40 mins " +
                "\nCurrent Events Presentation" +
                "\nIDH 3034");
        questions.add("Due: November 11, 11 p.m.                          ETC: 35 mins " +
                "\nArrays Pseudo Code" +
                "\nCOP 2210");
        questions.add("Due: November 12, 8 a.m.                          ETC: 1 hr " +
                "\nChapters 1-5 Study Guide" +
                "\nMAC 2312");
        questions.add("Due: November 12, 8 a.m.                          ETC: 3 hrs " +
                "\nResearch Project" +
                "\nCOP2210");
        questions.add("Due: November 13, 8 a.m.                          ETC: 1 hr " +
                "\nPhysics 1 Homework Assignment" +
                "\nPHY2048");
        questions.add("Due: November 14, 11 p.m.                          ETC: 2 hrs " +
                "\nLaw of Gravity Paper" +
                "\nPHY2048");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, questions);


        listView.setAdapter(arrayAdapter);

/*        listView.setOnClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view) {
                Toast.makeText(, "Selected Task Now In Progress", Toast.LENGTH_SHORT).show();
                Toast toast = Toast.makeText(getApplicationContext(), "Selected Task Now in Progress", Toast.LENGTH_SHORT);
                toast.show();

            }
        });
*/
    }


}
