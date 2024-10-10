package org.kata.meron;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    private final HelloWorld helloWorld = new HelloWorld();

    @Test
    public void shouldReturnHelloWorld() {
        assertEquals(helloWorld.helloWorld(), "Hello World!");
    }

}