import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Board b = new Board();

        new Knight(b,new Coordinate('B',1), Knight.Type.BLACK);
        new Knight(b,new Coordinate('G',1), Knight.Type.BLACK);
        new Knight(b,new Coordinate('B',8), Knight.Type.WHITE);
        new Knight(b,new Coordinate('G',8), Knight.Type.WHITE);

        System.out.println(b);
        String enumString = "Knight$Type";

    }
}
