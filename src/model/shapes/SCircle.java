package model.shapes;

import java.awt.*;

public class SCircle extends Shape {

    Point centerPoint;
    int r;
    Point startPoint;
    int p;

    public SCircle(){

//        centerPoint = new Point(1,1);
        centerPoint = new Point(0,0);
        r = 1;
    }

    public SCircle(Point p, int r){

        this.centerPoint = p;
        this.r= r;
    }


    @Override
    public Point getLoc() {

        return this.centerPoint;
    }

    @Override
    public void setLoc(Point p) {

        this.centerPoint = p;
    }

    @Override
    public void translate(int dx, int dv) {

        this.centerPoint = new Point((int)centerPoint.getX()+dx, (int)centerPoint.getY()+dv);
    }

    public Point getStartPoint(){

        int Lx = (int)centerPoint.getX() - r ;
        int Ly = (int)centerPoint.getY() - r;
        startPoint = new Point(Lx,Ly);
        return startPoint;
    }

    @Override
    public Rectangle getBounds() {
        int width = this.r*2;
        int height = this.r*2;
        getStartPoint();
        Rectangle r = new Rectangle((int)startPoint.getX(), (int)startPoint.getY(), width, height);
        return r;
    }

    @Override
    public String toString(){
        return "Cercle : " +
                "centerPoint="+(int)centerPoint.getX()+"|" + (int)centerPoint.getY()+
                " ; r=" + r;
    }
}
