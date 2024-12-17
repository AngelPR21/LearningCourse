public class Main {
   public static void main(String[] args) {

      IConduccionAutonoma iConduccionAutonoma = new ConduccionAutonomaImp();

      iConduccionAutonoma.acelerar(3);
      iConduccionAutonoma.frenar(2.2f);
      iConduccionAutonoma.establecerVelocidad(120);
      iConduccionAutonoma.girar(45);

   }
}