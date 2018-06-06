package model.shapes;


import java.awt.*;

public class SRectangle extends Shape {

    private Point startPoint;
    private Point endPoint;
    private int width;
    private int height;


    public SRectangle() {

        this.startPoint = new Point(1,1);
        this.endPoint = new Point(3,5);
        getBounds();
    }

    public SRectangle(Point loc, Point end) {

        this.startPoint = loc;
        this.endPoint = end;
        getBounds();

    }


    public SRectangle(Point loc, int width, int height){

        this.startPoint = loc;
        endPoint = new Point(150,100);
        this.width = width;
        this.height = height;
        getBounds();
    }

    @Override
    public Point getLoc() {

        return this.startPoint;
    }

    @Override
    public void setLoc(Point p) {

        this.startPoint = p;
        this.endPoint = new Point((int)startPoint.getX()+ width, (int)startPoint.getY()+ height);
    }

    @Override
    public void translate(int dx, int dv) {


        this.startPoint.x = this.startPoint.x+dx;
        this.startPoint.y = this.startPoint.y+dv;
        setLoc(startPoint);

    }

    @Override
    public Rectangle getBounds() {
        width = this.endPoint.x - this.startPoint.x;
        height = this.endPoint.y - this.startPoint.y;

        Rectangle r2d2 = new Rectangle((int)startPoint.getX(), (int)startPoint.getY(), width, height);
      return r2d2;
    }

    @Override
    public String toString() {
        return "Rectangle : " +
                "startPoint=" + (int)startPoint.getX()+ "|"+ (int)startPoint.getY() +
                " ; endPoint=" + (int)endPoint.getX()+ "|"+ (int)endPoint.getY() +
                " ; isSelected=" + isSelected();
    }

}

