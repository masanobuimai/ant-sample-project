package com.example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class GreetingTest {
    @Test
    public void testSayHello() {
        Greeting greeting = new Greeting();
        assertThat(greeting.sayHello(), is("Hello World!!"));
    }

    @Test
    public void testName() throws Exception {
        fail();
    }
}
