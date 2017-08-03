package com.ea.orbit.sample;

import java.util.concurrent.Executor;

import cloud.orbit.actors.Actor;
import cloud.orbit.actors.Stage;

public class Main {
    public static void main(String[] args) throws Exception {
        Stage stage = new Stage.Builder().clusterName("orbit-helloworld-cluster").build();
        stage.start().join();

        for(int i=0;i<10;i++) {
            Thread r = new Thread() {
                @Override
                public void run() {
                    final Integer val = Actor.getReference(Counter.class, "0").count(1).join();
                    System.out.println(val);
                }
            };
            r.start();

        }


        stage.stop().join();


    }
}
