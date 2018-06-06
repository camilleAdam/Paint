package model.shapes;

public class NotASquareException extends Exception {

    public NotASquareException() {

        final String ANSI_RED = "\u001B[31m";
        System.out.println(ANSI_RED+ "Not a Square");
        System.exit(1);
    }
}
