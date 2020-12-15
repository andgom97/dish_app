package com.example.dishapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class DishList extends AppCompatActivity {

    private RecyclerView dishes_RecyclerView;
    private MaterialButton new_dish_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dish_list);

        // Button to register a new dish
        new_dish_button = (MaterialButton)findViewById(R.id.new_dish_button);
        new_dish_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openDishCreation();
           }
        });

        dishes_RecyclerView = (RecyclerView)findViewById(R.id.dishes_RecyclerView);

    }

    // Method to open DishCreation Activity
    public void openDishCreation(){
        Intent intent = new Intent(this, DishCreation.class);
        startActivity(intent);
    }
}