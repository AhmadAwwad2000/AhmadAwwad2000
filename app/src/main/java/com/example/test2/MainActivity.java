package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

import model.Car;
import model.CarModel;

public class MainActivity extends AppCompatActivity {
    private EditText edtResult;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtResult=findViewById(R.id.edtResult);
        spinner=findViewById(R.id.spinner);

    }

    public void btnselect(View view) {
        String s="";
        String type=spinner.getSelectedItem().toString();
        CarModel model=new CarModel();
        ArrayList<Car>cars =model.getCarByType(type);
        if (!cars.isEmpty()){
            for(int i=0;i<cars.size();i++) {
                s+=cars.get(i).getMake() +" ,and model : " + " "+cars.get(i).getModel();
                s+=" \n";

            }
            edtResult.setText(s);

        }else{
            edtResult.setText("car not found");
        }

    }
}
