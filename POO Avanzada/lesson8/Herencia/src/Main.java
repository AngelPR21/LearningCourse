
public class Main {
   public static void main(String[] args) throws Exception {

      Object o;

      o = new Programador();
      System.out.println("La clase Programador hereda de Empleado: " + (o instanceof Empleado));
      o = new Empleado();
      System.out.println("La clase Empleado hereda de Persona: " + (o instanceof Persona));
      o = new Cliente();
      System.out.println("La clase Cliente hereda de Empleado: " + (o instanceof Persona));

   }
}