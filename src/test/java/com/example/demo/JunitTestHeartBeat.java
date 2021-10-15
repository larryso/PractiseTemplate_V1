package com.example.demo;

import org.junit.Before;
import org.junit.Test;

public class JunitTestHeartBeat {

    @Before
    public void setup(){
        System.out.println("Unit test setup");
    }
    @Test
    public void heartbeat(){
        System.out.println("Unit test heartbeat first");
    }
}
