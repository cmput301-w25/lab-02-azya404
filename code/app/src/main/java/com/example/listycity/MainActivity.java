package com.example.listycity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // 3 attributes defined by us
    ListView cityList;
    ArrayAdapter<String> cityAdapter;
    ArrayList<String> dataList;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the content to be the layout file
        //set it first so we can define the UI first before starting to refer to it
        setContentView(R.layout.activity_main);

        //option read up on them for navbar
        EdgeToEdge.enable(this);

        // basic empty views
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        cityList = findViewById(R.id.city_list);
        //Button button = findViewById(R.id.button);

        String[] cities = {"Edmonton", "Guelph", "Nairobi"};

        dataList = new ArrayList<>();
        dataList.addAll(Arrays.asList(cities));

        //adapter used to link the visual elements, adapts the content of the list view to the
        cityAdapter = new ArrayAdapter<>(this, R.layout.content, dataList);
        cityList.setAdapter(cityAdapter);

        //cityAdapter.setOn()

            //dynamic inputs
            // delete things

    }
}