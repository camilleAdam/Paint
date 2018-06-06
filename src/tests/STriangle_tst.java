package tests;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import model.shapes.STriangle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class STriangle_tst {

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
    void Given_DefaultTriangle_When_toString_Then_ShouldReturnText(){
        STriangle t = new STriangle();
        assertEquals("Triangle : startPoint=1|1 ; endPoint=3|5 ; isSelected=false", t.toString());
    }
}
