package model;

import java.util.ArrayList;
import java.util.Locale;

public class CarModel {

    private ArrayList<Car>carTypes=new ArrayList<>();

    public CarModel(){

        carTypes.add(new Car("SUV",  "tocan",   2018));
        carTypes.add(new Car("SUV",  "santa fe",   2018));
        carTypes.add(new Car("SUV",  "sorinto",   2018));
        carTypes.add(new Car("Sedan",  "Accent",   2019));
        carTypes.add(new Car("Sedan",  "focas",   2014));
        carTypes.add(new Car("Sedan",  "mercedes",   2021));
        carTypes.add(new Car("hatch-bag",  "Golf",   2017));
        carTypes.add(new Car("hatch-bag",  "mazda",   2018));
        carTypes.add(new Car("hatch-bag",  "bmw",   2020));

    }
    public ArrayList<Car> getCarByType(String type){
        Car car =null;
        ArrayList<Car>carselection=new ArrayList<>();

        for(Car c: carTypes){
            if(c.getType().toLowerCase().equals(type.toLowerCase())){
                carselection.add(c);
            }

        }
        return carselection;
    }
}
