package com.example.projet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private MainController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.my_recycler_view);
        controller = new MainController(this);
        controller.onStart();
    }

    public void showList(final List<F1> input){
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new MyAdapter(input);
        recyclerView.setAdapter(mAdapter);
        recyclerView.addOnItemTouchListener(new Click(getApplicationContext(), recyclerView, new Click.ClickListener() {
            public void onClick(View view, int position) {
                F1 f1 = input.get(position);
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("round", f1.getRound());
                intent.putExtra("raceName", f1.getRaceName());
                intent.putExtra("circuitName", f1.getCircuitName());
                intent.putExtra("locality", f1.getLocality());
                intent.putExtra("country", f1.getCountry());
                intent.putExtra("circuiturl", f1.getCircuiturl());
                startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }

}