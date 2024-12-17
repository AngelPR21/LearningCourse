public class Prueba {

    public static void main(String[] args) {

        Board board = new Board();

        // Pieza de la que queremos obtener los movimientos
        Piece piece = new Knight(board, new Coordinate('f', 3), Knight.Type.BLACK);

        // Otras piezas colocadas en el tablero
        new Knight(board,new Coordinate('d',4), Knight.Type.WHITE);
        new Rook(board,new Coordinate('e',5), Rook.Type.BLACK);


        // Resaltamos las celdas de los siguientes movimientos
        // board.highLight(piece.getNextMovements());

        // Imprimimos el tablero
        System.out.println(board);

    }
}
