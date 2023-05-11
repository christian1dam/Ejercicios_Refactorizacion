package tarea_6_1;
import java.util.ArrayList;

public class Profesor extends Persona{
    String nombre;
    int edad;
    String numeroDeTelefono;

    //Cambio List por un ArrayList para no tener que implementar todos los métodos de la interfaz List en la clase.
    ArrayList<Prestamo> prestamos;
    public Profesor(String numeroDeTelefono){
        super(numeroDeTelefono);
    }

    //Uso this. para acceder a los atributos de la propia clase.
    public void printInformacionPersonal(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Numero de teléfono: " + this.numeroDeTelefono);
    }
    public void printTodaLaInformacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Numero de teléfono: " + this.numeroDeTelefono);
        //Dejo el foreach en una sola línea
        for (Prestamo p : prestamos) System.out.println(p);
    }
}
