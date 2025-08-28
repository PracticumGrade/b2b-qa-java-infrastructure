package edu.grade.b2b.qa.java.infrastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {

    @Test
    public void sampleTest1() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void sampleTest2() {
        assertEquals(8, 2 * 4);
    }

    @Test
    public void sampleTest3() {
        assertEquals(10, 12 - 2);
    }

    @Test
    public void sampleTest4() {
        assertEquals(3, 2 + 1);
    }
}
