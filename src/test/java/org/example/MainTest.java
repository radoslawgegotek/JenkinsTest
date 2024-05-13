package org.example;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testAdd() {
        Main main = new Main();
        assertEquals(10, main.add(4,6));
    }
}