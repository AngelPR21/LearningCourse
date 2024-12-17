public class Persona {

    private String nombre;
    private String apellidos;
    private String DNI;

    public Persona(String nombre, String apellidos, String DNI) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
    }

   @Override
   public boolean equals(Object obj) { //equals sobreescribe un metodo de object
        if(obj == null || !(obj instanceof Persona))  //instancia significa "objeto de"
            return false;
        Persona auxiliar = (Persona) obj;
       return this.DNI.equals(auxiliar.DNI);
   }
}
