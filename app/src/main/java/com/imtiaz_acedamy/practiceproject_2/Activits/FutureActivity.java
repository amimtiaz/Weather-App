package com.imtiaz_acedamy.practiceproject_2.Activits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.imtiaz_acedamy.practiceproject_2.Adapters.FutureAdapter;
import com.imtiaz_acedamy.practiceproject_2.Domains.FutureDomain;
import com.imtiaz_acedamy.practiceproject_2.R;

import java.util.ArrayList;

public class FutureActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterTommorow;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future);

        setVeriable();
        initRecyclerView();
    }

    private void initRecyclerView() {

        ArrayList<FutureDomain> items = new ArrayList<>();
        items.add(new FutureDomain("Sat","storm", "storm",24, 12));
        items.add(new FutureDomain("Sun","windy", "windy",24, 12));
        items.add(new FutureDomain("Mon","cloudy_sunny", "Cloudy Sunny",24, 12));
        items.add(new FutureDomain("Tue","sunny", "Sunny",24, 12));
        items.add(new FutureDomain("Wen","storm", "storm",24, 12));
        items.add(new FutureDomain("Thu","rainy", "Rainy",24, 12));
        items.add(new FutureDomain("Sat","storm", "storm",24, 12));
        items.add(new FutureDomain("Sun","windy", "windy",24, 12));
        items.add(new FutureDomain("Mon","cloudy_sunny", "Cloudy Sunny",24, 12));
        items.add(new FutureDomain("Tue","sunny", "Sunny",24, 12));
        items.add(new FutureDomain("Wen","storm", "storm",24, 12));
        items.add(new FutureDomain("Thu","rainy", "Rainy",24, 12));

        recyclerView = (RecyclerView) findViewById(R.id.view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        adapterTommorow = new FutureAdapter(items);
        recyclerView.setAdapter(adapterTommorow);
    }

    private void setVeriable() {

        ImageView backBtn = (ImageView) findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(FutureActivity.this, MainActivity.class));

            }
        });


    }
}