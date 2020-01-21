package com.example.daggerexample;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.daggerexample.dagger.CarComponent;
import com.example.daggerexample.car.Car;
import com.example.daggerexample.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends Activity {
    @Inject
    Car car; // Better to use constructor if possible

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);

        car.drive();
    }
}
