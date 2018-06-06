//package tests;
//
//import java.awt.*;
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//
//import model.shapes.SSquare;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class SSquare_tst {
//
//    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//
//    @BeforeEach
//    public void setUpStreams(){
//        System.setOut(new PrintStream(outContent));
//    }
//
//    @AfterEach
//    public void restoreStreams(){
//        System.setOut(System.out);
//    }
//
//    @Test
//    void Given_DefaultSquare_When_toString_Then_ShouldReturnText(){
//        SSquare c = new SSquare();
//        assertEquals("Carré : startPoint=1|1 ; endPoint=2|2 ; isSelected=false" , c.toString());
//    }
//
//    @Test
//    void Given_DefaultSquare_When_print_ThenShouldReturnText(){
//        SSquare c = new SSquare();
//        c.print();
//        assertEquals("Carré : startPoint=1|1 ; endPoint=2|2 ; isSelected=false", outContent.toString().replace("\r\n", "\n"));
//    }
//
//    @Test
//    void Given_Square_When_getLoc_Then_ShouldReturn(){
//        SSquare c = new SSquare();
//        Point expectedLocation = new Point(1,1);
//        assertEquals(expectedLocation, c.getLoc());
//    }
//
//    @Test
//    void Given_SquareWithPointAndWidth_When_getLoc_Then_Location(){
//        SSquare c = new SSquare(new Point(10,10), 10);
//        Point expectedLocation = new Point(10,10);
//        assertEquals(expectedLocation, c.getLoc());
//
//    }
//
//    @Test
//    void Given_SquareWithPointS_When_getLoc_Then_Location(){
//        SSquare c = new SSquare(new Point(10,10), new Point(20,20));
//        Point expectedLocation = new Point(10,10);
//        assertEquals(expectedLocation, c.getLoc());
//
//    }
//
//    @Test
//    void Given_DefaultSquare_When_setLocation_Then_ShouldBe(){
//        SSquare c = new SSquare();
//        Point expectedLocation = new Point(40,40);
//        c.setLoc(expectedLocation);
//        assertEquals("Carré : startPoint=40|40 ; endPoint=41|41 ; isSelected=false", c.toString());
//    }
//
//    @Test
//    void Given_SquareWithTwoPoints_When_setLocation_Then_ShouldBe(){
//        SSquare c = new SSquare(new Point(2,2),new Point(5,5));
//        Point expectedLocation = new Point(30,30);
//        c.setLoc(expectedLocation);
//        assertEquals("Carré : startPoint=30|30 ; endPoint=33|33 ; isSelected=false", c.toString());
//    }
//
//    @Test
//    void Given_SquareWithPointAndWidth_When_setLocation_Then_ShouldBe(){
//        SSquare c = new SSquare(new Point(2,2),10);
//        Point expectedLocation = new Point(30,30);
//        c.setLoc(expectedLocation);
//        assertEquals("Carré : startPoint=30|30 ; endPoint=40|40 ; isSelected=false", c.toString());
//    }
//
//    @Test
//    void Given_DefaultSquare_When_GettingBounds_Then_ShouldReturnBounds(){
//        SSquare c = new SSquare();
//        Rectangle bounds = c.getBounds();
//
//        assertEquals(1,bounds.getWidth());
//        assertEquals(1,bounds.getHeight());
//
//    }
//
//    @Test
//    void Given_Square_When_GettingBounds_Then_ShouldReturnBounds(){
//        SSquare c = new SSquare();
//        Point expectedLocation = new Point(50,50);
//        c.setLoc(expectedLocation);
//        Rectangle bounds = c.getBounds();
//
//        assertEquals(1,bounds.getWidth());
//        assertEquals(1,bounds.getHeight());
//    }
//
//    @Test
//    void Given_SquareWithPointAndWidth_When_GettingBounds_Then_ShouldReturnBounds(){
//        SSquare c = new SSquare(new Point(30,30), 30);
//        Rectangle bounds = c.getBounds();
//
//        assertEquals(30, bounds.getWidth());
//        assertEquals(30, bounds.getHeight());
//    }
//
//    @Test
//    void Given_SquareWithPoints_When_GettingBounds_Then_ShouldReturnBounds(){
//        SSquare c = new SSquare(new Point(30,30), new Point(60,60));
//        Rectangle bounds = c.getBounds();
//
//        assertEquals(30, bounds.getWidth());
//        assertEquals(30, bounds.getHeight());
//    }
//
//    @Test
//    void Given_DefaultSquare_When_Translating_Then_ShouldReturn(){
//        SSquare c = new SSquare();
//        c.translate(50,50);
//        Rectangle bounds = c.getBounds();
//
//        assertEquals(1, bounds.getWidth());
//        assertEquals(1, bounds.getHeight());
//    }
//
//    @Test
//    void Given_SquareWithPointAndWidth_When_Translating_Then_ShouldReturn(){
//        SSquare c =new SSquare(new Point(20,20),10);
//        c.translate(10,10);
//        Point expectedLocation = new Point(30,30);
//        assertEquals(expectedLocation, c.getLoc());
//        Rectangle bounds = c.getBounds();
//        assertEquals(10, bounds.getWidth());
//        assertEquals(10, bounds.getHeight());
//    }
//
//    @Test
//    void Given_SquareWithPoints_When_Translating_Then_ShouldReturn(){
//        SSquare c =new SSquare(new Point(20,20),new Point(50,50));
//        c.translate(10,10);
//        Rectangle bounds = c.getBounds();
//
//        assertEquals(30, bounds.getWidth());
//        assertEquals(30, bounds.getHeight());
//    }
//}
