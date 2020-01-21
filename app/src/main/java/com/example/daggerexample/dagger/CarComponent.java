package com.example.daggerexample.dagger;

import com.example.daggerexample.MainActivity;
import com.example.daggerexample.car.Car;

import dagger.Component;

// The injector
@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
