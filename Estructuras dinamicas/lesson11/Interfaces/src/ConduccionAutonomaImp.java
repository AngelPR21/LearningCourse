public class ConduccionAutonomaImp implements IConduccionAutonoma{

    @Override
    public void acelerar(float aceleracion) {
        System.out.println("Implementacion de aceler " + aceleracion +" m/s²");
    }

    @Override
    public void frenar(float aceleracion) {
        System.out.println("Implementacion de frenar con una aceleracion de " + aceleracion +" m/s²");
    }

    @Override
    public void establecerVelocidad(int velocidad) {
        System.out.println("Implementacion de establecer la velocidad a " + velocidad +" km/h");
    }

    @Override
    public void girar(int angulo) {
        System.out.println("Implementacion de girar " + angulo +"º");
    }
}
