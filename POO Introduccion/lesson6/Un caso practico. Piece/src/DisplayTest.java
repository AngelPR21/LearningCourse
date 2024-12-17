import static com.diogonunes.jcolor.Ansi.colorize;

public class DisplayTest {
    //put your task here
    public static void main(String[] args) {
        Cell whiteCell1 = new Cell(null, new Coordinate('c', 3));
        Cell whiteCell2 = new Cell(null, new Coordinate('c', 3));
        Cell blackCell1 = new Cell(null, new Coordinate('c', 2));
        Cell blackCell2 = new Cell(null, new Coordinate('c', 2));
        Piece blackPiece1 = new Piece(Piece.Type.BLACK_KNIGHT, null);
        Piece whitePiece1 = new Piece(Piece.Type.WHITE_KNIGHT, null);
        Piece blackPiece2 = new Piece(Piece.Type.BLACK_KNIGHT, null);
        Piece whitePiece2 = new Piece(Piece.Type.WHITE_KNIGHT, null);

        System.out.println("Black piece: " + blackPiece1);
        System.out.println("White piece: " + whitePiece1);
        System.out.println("Empty black cell: " + blackCell1);
        System.out.println("Empty white cell: " + whiteCell1);

        whitePiece1.setCell(whiteCell1);
        whitePiece2.setCell(blackCell2);
        blackPiece1.setCell(blackCell1);
        blackPiece2.setCell(whiteCell2);
        System.out.println("Black piece on cell: " + blackPiece1 + " " + blackPiece2);
        System.out.println("White piece on cell: " + whitePiece1 + " " + whitePiece2);

        whiteCell1.setPiece(whitePiece1);
        whiteCell2.setPiece(blackPiece2);
        blackCell1.setPiece(blackPiece1);
        blackCell2.setPiece(whitePiece2);
        System.out.println("Black cell with piece: " + blackCell1 + " " + blackCell2);
        System.out.println("White cell with piece: " + whiteCell1 + " " + whiteCell2);


    }
}