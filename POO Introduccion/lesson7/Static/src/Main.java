public class Main {
   public static void main(String[] args) {
      Cuenta c1 = new Cuenta();
      Cuenta c2 = new Cuenta();

      System.out.println(c1);
      System.out.println(c2);
      System.out.println("Numero de c1: " + c1.getNumero());
      System.out.println("Numero de c2: " + c2.getNumero());
      System.out.println("Valor del atributo estatico: " + Cuenta.obtenerSiguiente());
      System.out.println("Valor del atributo estatico: " + Cuenta.siguiente);

   }
}