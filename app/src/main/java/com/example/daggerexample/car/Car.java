package com.example.daggerexample.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    //Constructor injection
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive(){
        engine.start();
        Log.d(TAG, "Driving");
    }

    // Dagger will call this method after construction creation is finished
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
}
