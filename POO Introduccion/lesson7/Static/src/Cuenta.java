public class Cuenta {

    public static int siguiente = 1;

    private int numero;

    public Cuenta(){
        numero = siguiente++;
    }

    public int getNumero() {
        return numero;
    }

    public static int obtenerSiguiente(){
        return siguiente;
    }

//    public static int obtenerNumero(){
//        return numero;
//    }

    @Override
    public String toString() {
        return "Cuenta: " + numero;
    }
}
