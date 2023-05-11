package tarea_6_1;
public class Profesor extends Persona{
    String nombre;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;
    public Profesor(String numeroDeTelefono){
        super(numeroDeTelefono);
    }

    //usamos this. para acceder a los atributos de la propia clase.
    public void printInformacionPersonal(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Numero de teléfono: " + this.numeroDeTelefono);
    }
    public void printTodaLaInformacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Numero de teléfono: " + this.numeroDeTelefono);
        for (Prestamo p : prestamos) System.out.println(p);
    }
}
