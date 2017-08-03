package com.ea.orbit.sample;

import cloud.orbit.actors.Actor;
import cloud.orbit.concurrent.Task;

public interface Counter extends Actor{
    Task<Integer> count(Integer value);
}
