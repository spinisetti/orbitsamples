package com.ea.orbit.sample;

import cloud.orbit.actors.runtime.AbstractActor;
import cloud.orbit.concurrent.Task;

public class CounterActor extends AbstractActor implements Counter{


    private int val = 0;

    public Task<Integer> count(Integer value) {
        System.out.println("About to increase counterA");
        val += value;
        return Task.fromValue(val);
    }
}
