package com.example.android.arrayadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String fruitlList[] = {"Apple","Strawberry","Orang","Grape","Peach","Cherry","Pear","Banana", "Grapefruit", "Pinapple", "Mango", "Kiwifruit"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textView1, fruitlList);
        list.setAdapter(arrayAdapter);
    }
}
