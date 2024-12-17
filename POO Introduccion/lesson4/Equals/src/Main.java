public class Main {
   public static void main(String[] args) {
      // Write your solution here
      Persona persona1 = new Persona("Jose","Garcia Lopez","12345632G");

      Persona persona2 = new Persona("Jose","Garcia Lopez","12345632G");

      System.out.println("persona1.equals(persona2) -> " + persona1.equals(persona2));

      System.out.println("persona1 == persona2 -> " + (persona1==persona2));

      Persona persona3 = persona1;

      System.out.println("persona1 == persona3 -> " + (persona1 == persona3));

   }
}