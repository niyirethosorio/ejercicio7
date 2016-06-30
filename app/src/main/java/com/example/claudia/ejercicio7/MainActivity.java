package com.example.claudia.ejercicio7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private TextView textView;

    String paises []={"Colombia","Ecuador", "Brasil","Argentina","Chile","Peru"};
    String habitantes []={"10000","20000", "30000","40000","50000","60000"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =(ListView)findViewById(R.id.listView);
        textView=(TextView)findViewById(R.id.textView);

        ArrayAdapter adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,paises);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                textView.setText("Población de "+ listView.getItemAtPosition(i) + " es "+ habitantes[i]);
            }
        });

    }
}
