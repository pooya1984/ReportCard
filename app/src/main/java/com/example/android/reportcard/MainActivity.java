package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        ArrayList<Word> avrrageMarks = new ArrayList<Word>();
        avrrageMarks.add(new Word("Mathemathics","79.8%","80.6%","73.6%",R.drawable.math));
        avrrageMarks.add(new Word("Physics","83.2%","79.8%","75.9%",R.drawable.phisic));
        avrrageMarks.add(new Word("Chemistery","86.2%","71.2%","78.6%",R.drawable.exp));
        avrrageMarks.add(new Word("Drawing","59.0%","73.8%","60.7",R.drawable.dave));

        WordAdapter adapter = new WordAdapter(this, avrrageMarks);
        ListView listView = (ListView) findViewById(R.id.List);

        listView.setAdapter(adapter);

    }
}
