package com.codecool.line;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LineTest {
    private Line line;
    private Line lineZeroX;
    private Line pararelline;
    private Line lineTwo;

    @BeforeEach
    void setUp() {
        line = new Line(5.0,3.0,2.0,4.0);
        lineZeroX = new Line(0.0,4.0,0.0,9.0);
        pararelline = new Line(5.0,4.0,2.0,5.0);
        lineTwo = new Line(8.0,1.0,9.0,3.0);

    }

    @Test
    void getSlopeException() {
        try{
            lineZeroX.getSlope();
        } catch(Exception e) {
            assertTrue(e instanceof  ArithmeticException);
        }
    }

    @Test
    void getSlopeReturn() {
       assertEquals(-0.33333333333333333,line.getSlope());
    }

    @Test
    void getDistanceReturn() {
        assertEquals(3.1622776601683795,line.getDistance());
    }

    @Test
    void parallelToTrue() {
        assertTrue(line.parallelTo(pararelline));
    }

    @Test
    void parallelToFalse() {
        assertFalse(line.parallelTo(lineTwo));
    }
}
