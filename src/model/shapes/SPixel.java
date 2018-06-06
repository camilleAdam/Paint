package model.shapes;

import java.awt.Point;
import java.awt.Rectangle;

public class SPixel extends Shape {

    // déclaration des coordonées et définition de leurs valeurs par défaut
    private int x=0, y=0;

    public SPixel() {
    }

    public SPixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public SPixel(Point p) {
        this.x = (int)p.getX();
        this.y = (int)p.getY();
    }

    @Override
    public Point getLoc() {
        return new Point(this.x, this.y);
    }

    @Override
    public void setLoc(Point p) {
        this.x = (int)p.getX();
        this.y = (int)p.getY();
    }

    @Override
    public void translate(int dx, int dy) {
        this.x = this.x+dx;
        this.y = this.y+dy;
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(this.x, this.y, 1, 1);
    }


    public void print() {
        System.out.print(this.toString());
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Pixel : ");
        sb.append((int)this.x).append("|").append((int)this.y);
        sb.append(" ; ").append(super.toString());
        return sb.toString();
    }

}
