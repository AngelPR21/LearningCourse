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
   public boolean equals(Object obj) {
        if(obj == null) return false;

       if(!(obj instanceof Persona)) return false;
         Persona p = (Persona) obj;
       return p.nombre.equals(nombre) && p.apellidos.equals(apellidos) && p.DNI.equals(DNI);
   }
}
