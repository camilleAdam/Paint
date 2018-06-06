package model.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class SContruction extends Shape {

    private ArrayList<Shape> shapes;

    public void addShape(Shape s){
        shapes.add(s);
    }

    public SContruction(){

        this.shapes = new ArrayList<Shape>();
    }

    public static void main(String[]args ){
        SRectangle s = new SRectangle(new Point(20,20), new Point(20,20));
        SCircle c = new SCircle(new Point(10,10), 2);

        SContruction sContruction = new SContruction();
        sContruction.addShape(s);
        sContruction.addShape(c);
        System.out.println(sContruction.getLoc());
    }

    @Override
    public Point getLoc() {

        if(shapes.size() == 0){
            return new Point();
        }
//        Iterator<Shape> it = this.shapes.iterator();
        int maxX = -9999;
        int maxY = -9999;
        for(Iterator<Shape> it = shapes.iterator(); it.hasNext();){
            Shape shape = (Shape) it.next();
            if (shape.getBounds().x < maxX){
                maxX = shape.getBounds().x;
            }
            if (shape.getBounds().y < maxY){
                maxY = shape.getBounds().y;
            }
        }

        return new Point(maxX,maxY);
    }

    @Override
    public void setLoc(Point p) {


    }

    @Override
    public void translate(int dx, int dv) {

        //translate all shapes
        for(Shape shape : shapes){
            shape.translate(dx, dv);
        }
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }
}
