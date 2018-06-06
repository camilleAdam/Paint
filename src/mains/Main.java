package mains;
import java.awt.Point;
import java.awt.Rectangle;

import model.shapes.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");

        SPixel p = new  SPixel();

        System.out.println(p.toString());
        p.print();
        System.out.println(p.getLoc());

        p.setLoc( new Point(1,1));
        System.out.print("après repositionnement : ");
        p.print();
        System.out.println("\n       " + p.getBounds());



        SCircle c = new SCircle();

        SSquare s = null;
        try {
            s = new SSquare(new Point(), new Point(3,5));
        } catch (Exception e) {
            e.printStackTrace();
        }
        s.print();


    }

}
