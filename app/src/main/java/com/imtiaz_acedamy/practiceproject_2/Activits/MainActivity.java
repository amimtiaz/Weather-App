package com.imtiaz_acedamy.practiceproject_2.Activits;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.imtiaz_acedamy.practiceproject_2.Adapters.HourlyAdapters;
import com.imtiaz_acedamy.practiceproject_2.Domains.Hourly;
import com.imtiaz_acedamy.practiceproject_2.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterHourly;
    private RecyclerView recyclerView;
    private TextView nextBtn;
    LinearLayout rainBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initRecyclerView();
        nextinitBtn();
    }

    private void nextinitBtn() {

        nextBtn = (TextView) findViewById(R.id.nextBtn);
        rainBtn = (LinearLayout) findViewById(R.id.rainBtn);
        

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, FutureActivity.class));

            }
        });
    }

    private void initRecyclerView() {

        ArrayList<Hourly> items = new ArrayList<>();

        items.add(new Hourly("9 pm", 28, "cloudy"));
        items.add(new Hourly("11 am", 16, "sunny"));
        items.add(new Hourly("11 am", 16, "wind"));
        items.add(new Hourly("11 am", 16, "rainy"));
        items.add(new Hourly("11 am", 16, "storm"));
        
        recyclerView = (RecyclerView) findViewById(R.id.view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapterHourly = new HourlyAdapters(items);
        recyclerView.setAdapter(adapterHourly);


    }
}