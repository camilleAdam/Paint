package model.shapes;

import java.awt.*;

public class ShapeNode {

    Shape shape;
    ShapeNode next;

    public static void main(String[]args ){

        ShapeNode a = new ShapeNode(new SPixel(
                new Point(10,30)
        ));
        ShapeNode b = new ShapeNode(new SRectangle());

        System.out.println(a.getShape());
        System.out.println(b.getShape());

        a.setNext(b);
        System.out.println(a.getNext().getShape());
    }

    //une info qui connait un suivant
    public ShapeNode(Shape s){

        this.shape = s;
    }

    public Shape getShape(){

        return shape;
    }

    public void setNext(ShapeNode sn){

        this.next = sn;
    }

    public ShapeNode getNext(){

        return this.next;
    }
}
