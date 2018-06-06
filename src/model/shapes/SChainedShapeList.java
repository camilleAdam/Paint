package model.shapes;

import java.util.Iterator;
import java.util.LinkedList;


public class SChainedShapeList implements Iterable<Shape>{

    private ShapeNode start;
    private int numberOfNodes;
    private int x;
    private ShapeNode last;
    private int size = 0;

    //class qui va permettre de faire la liste et d'ajouter des elements
    protected LinkedList<Shape> shapes = new LinkedList<Shape>();

    public SChainedShapeList(){

    }

    //add a shape to the end of the list
    public void addShape(Shape s){

        if(this.size == 0){
            ShapeNode first = new ShapeNode(s);
            this.start = first;
            this.last = first;
            this.size++;
        }

        this.size++;
        ShapeNode newLast = new ShapeNode(s);
        this.last.setNext(newLast);
        this.last = newLast;
    }

    /**
     * return the size of the node
     * @return size the node
     */
    public int size(){

        return this.size;
    }

    public Shape getShapeAtIndex(int index){

        int where = 0;
        ShapeNode current= this.start;

        if(index >= size ||  index<0){
            throw new IndexOutOfBoundsException();
        }

        for(; where < index; where++){
            current = current.getNext();
        }

        return current.getShape();
    }

    public static void main(String[]args){

        SChainedShapeList list = new SChainedShapeList();
        list.addShape(new SPixel());
        list.addShape(new SRectangle());

        System.out.println(list.getShapeAtIndex(0));
        System.out.println(list.getShapeAtIndex(1));
    }

    //get the shape at the x position of the list
    public int getShapes(int x){

        this.numberOfNodes = x;

        return x;
    }

    @Override
    public Iterator<Shape> iterator() {
        return null;
    }
}
