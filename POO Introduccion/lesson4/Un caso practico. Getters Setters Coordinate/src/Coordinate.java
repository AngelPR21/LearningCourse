public class Coordinate {
    private char letter;
    private int number;

    public Coordinate(char letter, int number) {
        this.letter = Character.toUpperCase(letter);
        this.number = number;
    }

    //GETTER
    public char getLetter(){
        return letter;
    }
    public int getNumber(){
        return number;
    }



    @Override
    public String toString() {
        return ("("+ getLetter() + "," + getNumber() + ")");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (!(obj instanceof Coordinate)) return false;

        Coordinate c = (Coordinate) obj;

        return c.letter == letter && c.number == number;
    }
}