package model.shapes;

import java.awt.*;

public class SSquare extends Shape {

    int width;
    Point localisation;
    Point end;

    public SSquare(){

        localisation = new Point(1,1);
        end = new Point(7,5);
        this.width = (int)end.getX()-(int)localisation.getX();
        isTrueSquare();
    }

    public SSquare(Point start, Point end){

        this.localisation = start;
        this.end = end;
        this.width = (int)end.getX()-(int)start.getX();
        isTrueSquare();
    }

    public SSquare(Point localisation, int width){

        this.localisation = localisation;
        this.width = width;
        this.end = getEndPoint();
        isTrueSquare();

    }

    private Point getEndPoint(){

        this.end = new Point((int)localisation.getX()+width, (int)localisation.getY()+width);
        return end;
    }

    @Override
    public void print() {

        System.out.print(this.toString());
    }

    @Override
    public Point getLoc() {

        return this.localisation;
    }

    @Override
    public void setLoc(Point p) {

        this.localisation = p;
        this.end = getEndPoint();
    }

    @Override
    public void translate(int dx, int dv) {

        this.localisation.x = (int)this.localisation.getX()+dx;
        this.localisation.y = (int)this.localisation.getY()+dv;
        getEndPoint();
    }

    @Override
    public Rectangle getBounds() {

        Rectangle r = new Rectangle((int)localisation.getX(), (int)localisation.getY(),width,width);
        return r;
    }

    @Override
    public String toString(){
        return "Carré : " +
                "startPoint=" + (int)localisation.getX()+ "|"+ (int)localisation.getY() +
                " ; endPoint=" + (int)end.getX()+ "|"+ (int)end.getY() +
                " ; isSelected=" + isSelected();
    }

    protected boolean isTrueSquarie(){

        final String ANSI_RED = "\u001B[31m";
        boolean trueSquare;
        int height = this.end.y - this.localisation.y;

        if(height == width){

            trueSquare = true;
        }
        else{

            int i = 0;
            trueSquare = false;

            while(i != 100) {
                System.out.println(ANSI_RED + "THIS IS NOT A SQUARE !");
                i++;
            }
            System.exit(0);
        }

        return trueSquare;
    }

    private void isTrueSquare(){

        int height = this.end.y - this.localisation.y;
        if(height != width){

            try {
                throw new NotASquareException();

            } catch (NotASquareException e) {
                e.printStackTrace();
            }
        }
    }
}
