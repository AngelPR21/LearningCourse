
public class Piece {

    private Type type;

    public Piece(Type type) {
        this.type = type;
    }

    public enum Color {
        WHITE("Blanco"), BLACK("Negro");
        private String color;
        Color(String text){
            this.color=text;
        }
        public String getColor(){
            return color;
        }
    }

    public enum Type {

        //put your task here

    }

}

