public class Coordinate {
    private int fila;
    private char columna;

    //CONSTRUCTOR

    public Coordinate(int fila, char columna){
        this.fila = fila;
        this.columna = columna;
    }



    //GETTER
    public int getFila(){return fila;}
    public char getColumna(){return columna;}

    //SETTER
    public void setFila(int fila){
        this.fila = fila;
    }

    public void setColumna(char columna){
        this.columna = columna;
    }





}