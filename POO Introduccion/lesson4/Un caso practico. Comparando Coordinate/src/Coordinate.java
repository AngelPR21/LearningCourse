public class Coordinate {

    private Character letter;
    private Integer number;

    public Coordinate(char letter, int number) {
        this.letter = Character.toUpperCase(letter);
        this.number = number;
    }

    //put your task here
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;

        if(!(obj instanceof Coordinate)) return false;
        Coordinate c = (Coordinate) obj;
        return c.letter.equals(letter) && c.number.equals(number);
    }
}