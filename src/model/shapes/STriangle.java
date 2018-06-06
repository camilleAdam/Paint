package model.shapes;

import java.awt.*;

public class STriangle extends Shape{

    Point startPoint;
    Point endPoint;
    Point centerPoint;

    public STriangle(){

        this.startPoint = new Point(1,1);
        this.endPoint = new Point(3,5);
    }


    @Override
    public Point getLoc() {
        return null;
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

    @Override
    public String toString(){
        return "Triangle : " +
                "startPoint=" + (int)startPoint.getX()+ "|"+ (int)startPoint.getY() +
                " ; endPoint=" + (int)endPoint.getX()+ "|"+ (int)endPoint.getY() +
                " ; isSelected=" + isSelected();
    }
}
