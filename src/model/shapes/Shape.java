package model.shapes;


import java.awt.*;

public abstract class Shape implements Printable{

    private boolean isSelected = false;

    public abstract Point getLoc();
    public abstract void setLoc( Point p);
    public abstract void translate(int dx, int dv);
    public abstract Rectangle getBounds();

    /**
     *
     * @return
     */
    public boolean isSelected(){
        return this.isSelected;
    }

    public void select(){

        this.isSelected = true;
    }

    public void unSelect(){

        this.isSelected = false;
    }

    public void togleSelection() {

        this.isSelected = !this.isSelected;
    }


    @Override
    public String toString() {
        return "isSelected=" + this.isSelected();
    }

    @Override
    public void print(){
        System.out.print(this.toString());
    }
}
