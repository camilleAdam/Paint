package tests;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import model.shapes.SCircle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SCircle_tst {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams(){
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams(){
        System.setOut(System.out);
    }

    @Test
    void Given_DefaultCircle_When_toString_Then_ShouldReturnText(){
        SCircle c = new SCircle();
        assertEquals("Cercle : centerPoint=1|1 ; r=10", c.toString());
    }

    @Test
    void Given_DefaultCircle_When_print_ThenShouldReturnText(){
        SCircle c = new SCircle();
        c.print();
        assertEquals("Cercle : centerPoint=1|1 ; r=10", outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    void Given_Circle_When_getLoc_Then_ShouldReturn(){
        SCircle c = new SCircle();
        Point expectedLocation = new Point(1,1);
        assertEquals(expectedLocation, c.getLoc());
    }

    @Test
    void Given_CircleWithPoint_When_getLoc_Then_Location(){
        SCircle c = new SCircle(new Point(10,10), 10);
        Point expectedLocation = new Point(10,10);
        assertEquals(expectedLocation, c.getLoc());

    }

    @Test
    void Given_DefaultCircle_When_setLocation_Then_ShouldBe(){
        SCircle c = new SCircle();
        Point expectedLocation = new Point(40,40);
        int r = 10;
        c.setLoc(expectedLocation);
        assertEquals("Cercle : centerPoint=40|40 ; r=10", c.toString());
    }

    @Test
    void Given_CircleWithPointAndRayon_When_setLocation_Then_ShouldBe(){
        SCircle c = new SCircle(new Point(40,40), 10);
        Point expectedLocation = new Point(40,40);
        c.setLoc(expectedLocation);
        assertEquals("Cercle : centerPoint=40|40 ; r=10", c.toString());
    }

    @Test
    void Given_DefaultCircle_When_GettingBounds_Then_ShouldReturnBounds(){
        SCircle c = new SCircle();
        Rectangle bounds = c.getBounds();
        Point expectedBoundsL = new Point(-9,-9);
        assertEquals(expectedBoundsL, c.getStartPoint());
        assertEquals(20,bounds.getWidth());
        assertEquals(20,bounds.getHeight());

    }

    @Test
    void Given_Circle_When_GettingBounds_Then_ShouldReturnBounds(){
        SCircle c = new SCircle();
        Point expectedLocation = new Point(50,50);
        c.setLoc(expectedLocation);
        Rectangle bounds = c.getBounds();
        Point expectedBounds = new Point(40,40);
        assertEquals(expectedBounds, c.getStartPoint());
        assertEquals(20,bounds.getWidth());
        assertEquals(20,bounds.getHeight());
    }

    @Test
    void Given_CircleWithPointAndRayon_When_GettingBounds_Then_ShouldReturnBounds(){
        SCircle c = new SCircle(new Point(30,30), 30);
        Rectangle bounds = c.getBounds();
        Point expectedBounds = new Point(0,0);
        assertEquals(expectedBounds, c.getStartPoint());
        assertEquals(60, bounds.getWidth());
        assertEquals(60, bounds.getHeight());
    }

    @Test
    void Given_DefaultCircle_When_Translating_Then_ShouldReturn(){
        SCircle c = new SCircle();
        c.translate(50,50);
        Rectangle bounds = c.getBounds();
        Point expectedBoundsLocation = new Point(-59, -59);
        assertEquals(expectedBoundsLocation, bounds.getLocation());
        assertEquals(20, bounds.getWidth());
        assertEquals(20, bounds.getHeight());
    }

    @Test
    void Given_CircleWithPointAndRayon_When_Translating_Then_ShouldReturn(){
        SCircle c =new SCircle(new Point(20,20), 5);
        c.translate(10,10);
        Point expectedLocation = new Point(10,10);
        assertEquals(expectedLocation, c.getLoc());
        Rectangle bounds = c.getBounds();
        Point expectedBoundsLocation = new Point(5,5);
        assertEquals(expectedBoundsLocation, bounds.getLocation());
        assertEquals(10, bounds.getWidth());
        assertEquals(10, bounds.getHeight());
    }
}
