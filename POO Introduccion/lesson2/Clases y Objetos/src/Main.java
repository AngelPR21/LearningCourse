public class Main {
   public static void main(String[] args) {

      // Create a point using default constructor
      Point point = new Point();

      // Set values for x and y attributes.
      point.setX(2);
      point.setY(5);

      // Show values using getters.
      System.out.println("X:" + point.getX() + ", Y:" + point.getY());
   }
}