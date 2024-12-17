public class Main {
   public static void main(String[] args) {

      Day[] days = Day.values();

      for(int i=0;i<days.length;i++)
         System.out.println(days[i] +" es festivo: " + days[i].esFestivo());

      System.out.println("Despues del " + Day.DOMINGO + " siempre viene el " + Day.DOMINGO.nextDay());

   }

   public enum Day {

      // Unicos objetos permitidos
      LUNES(false),
      MARTES(false),
      MIERCOLES(false),
      JUEVES(false),
      VIERNES(false),
      SABADO(true),
      DOMINGO(true);

      // Declaracion de atributos
      private boolean festivo;

      // Constructor privado
      Day(boolean festivo){
         this.festivo = festivo;
      }

      // Metodos
      public boolean esFestivo(){
         return festivo;
      }

      public Day nextDay(){
         return values()[(ordinal()+1)% values().length];
      }

   }

}