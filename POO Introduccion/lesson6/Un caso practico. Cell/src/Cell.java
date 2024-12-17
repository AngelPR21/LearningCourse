import com.diogonunes.jcolor.Attribute;

public class Cell {

    private Piece piece;
    private Board board;
    private Coordinate coordinate;
    private Color originalColor;
    private Color color;

    public Cell(Board board, Coordinate coordinate) {
        this.board = board;
        this.coordinate = coordinate;
        this.piece = null;

        //put your task here

    }
    public boolean isEmpty(){
        return piece==null;
    }

    public Piece getPiece() {
        return piece;
    }

    public Board getBoard() {
        return board;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Color getColor() {
        return color;
    }

    public enum Color {
        //put your task here
    }
}