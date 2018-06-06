package model.shapes;

import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;
import model.shapes.SChainedShapeList;

public class SChainedConstruction extends Shape {

// class qui va construire des formes grace a la list, est au même niveau que les autres formes

    SChainedShapeList lis = new SChainedShapeList();
    LinkedList<Shape> shapes;

    public SChainedConstruction(){

        this.shapes = new LinkedList<>();
    }

    @Override
    public Point getLoc() {

        if (shapes.size() == 0){
            return new Point();
        }
        int maxX = -9999;
        int maxY = -9999;
        for (Iterator<Shape> it = shapes.iterator(); it.hasNext();){
            Shape shape = (Shape) it.next();
            if(shape.getBounds().x < maxX){
                maxX = shape.getBounds().x;
            }
            if(shape.getBounds().y < maxY){
                maxY = shape.getBounds().y;
            }
        }
        return new Point(maxX, maxY);
    }

    @Override
    public void setLoc(Point p) {

    }

    @Override
    public void translate(int dx, int dv) {

    }

    @Override
    public Rectangle getBounds() {
        return null;
    }


}
