package com.example.daggerexample.dagger;

import com.example.daggerexample.car.Engine;
import com.example.daggerexample.car.DieselEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}