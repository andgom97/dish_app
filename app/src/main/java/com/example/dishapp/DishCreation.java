package com.example.dishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DishCreation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dish_creation);

        // Spinner element
        Spinner moment_spinner = (Spinner) findViewById(R.id.moment_spinner);
        Spinner diet_spinner = (Spinner) findViewById(R.id.diet_spinner);

        // Creating adapters
        ArrayAdapter<CharSequence> moment_adapter = ArrayAdapter.createFromResource(this,R.array.moments,android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> diet_adapter = ArrayAdapter.createFromResource(this,R.array.diets,android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        moment_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        diet_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        moment_spinner.setAdapter(moment_adapter);
        diet_spinner.setAdapter(diet_adapter);

    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}

