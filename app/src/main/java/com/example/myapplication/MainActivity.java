package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PizzaItem> pizzaItems=new ArrayList<>();
        pizzaItems.add(new PizzaItem(R.drawable.pizza1,
                Utils.PIZZA_1_TITLE, Utils.PIZZA_1_DESCRIPTION,
                Utils.PIZZA_1_RECIPE));
        pizzaItems.add(new PizzaItem(R.drawable.pizza2,
                Utils.PIZZA_2_TITLE, Utils.PIZZA_2_DESCRIPTION,
                Utils.PIZZA_2_RECIPE));
        pizzaItems.add(new PizzaItem(R.drawable.pizza3,
                Utils.PIZZA_3_TITLE, Utils.PIZZA_3_DESCRIPTION,
                Utils.PIZZA_3_RECIPE));
        pizzaItems.add(new PizzaItem(R.drawable.pizza4,
                Utils.PIZZA_4_TITLE, Utils.PIZZA_4_DESCRIPTION,
                Utils.PIZZA_4_RECIPE));
        pizzaItems.add(new PizzaItem(R.drawable.pizza5,
                Utils.PIZZA_5_TITLE, Utils.PIZZA_5_DESCRIPTION,
                Utils.PIZZA_5_RECIPE));
        pizzaItems.add(new PizzaItem(R.drawable.pizza6,
                Utils.PIZZA_6_TITLE, Utils.PIZZA_6_DESCRIPTION,
                Utils.PIZZA_6_RECIPE));
        pizzaItems.add(new PizzaItem(R.drawable.pizza7,
                Utils.PIZZA_7_TITLE, Utils.PIZZA_7_DESCRIPTION,
                Utils.PIZZA_7_RECIPE));
        pizzaItems.add(new PizzaItem(R.drawable.pizza8,
                Utils.PIZZA_8_TITLE, Utils.PIZZA_8_DESCRIPTION,
                Utils.PIZZA_8_RECIPE));
        pizzaItems.add(new PizzaItem(R.drawable.pizza9,
                Utils.PIZZA_9_TITLE, Utils.PIZZA_9_DESCRIPTION,
                Utils.PIZZA_9_RECIPE));
        pizzaItems.add(new PizzaItem(R.drawable.pizza10,
                Utils.PIZZA_10_TITLE, Utils.PIZZA_10_DESCRIPTION,
                Utils.PIZZA_10_RECIPE));

        recyclerView=findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        adapter=new PizzaRecyclerViewAdapter(pizzaItems, this);
        layoutManager=new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);



    }

}