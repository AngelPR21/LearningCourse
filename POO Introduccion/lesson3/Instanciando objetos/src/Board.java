public class Board {

    private final int size;

    public Board() {
        this.size = 8;
    }

    public Board(int size) {

        this.size = size;

    }

    @Override
    public String toString() {
        return "Board{" +
                "size=" + size +
                '}';
    }
}
