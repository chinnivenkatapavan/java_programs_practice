package com.java.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class WebHooks {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("before all TestCase");
    }

    @Before
    public void before() {
        System.out.println("before TestCase");
    }

    @BeforeStep
    public void beforeStep() {
        System.out.println("before Step TestCase");
    }
}
