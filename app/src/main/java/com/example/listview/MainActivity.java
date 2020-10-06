package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] namanegara=new String[]{
            "Belanda", "China", "Indonesia",
            "Inggris", "Italia", "Jepang",
            "Kore Selatan", "Malaysia", "Philipine",
            "Singapore", "Turkey", "Vietnam"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list_view);
        getSupportActionBar().setTitle("ListView Sederhana");


        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,android.R.id.text1,namanegara);

                listView.setAdapter(adapter);
        
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Anda memilih : "+namanegara[1],
                Toast.LENGTH_SHORT).show();

            }
        });
    }

}