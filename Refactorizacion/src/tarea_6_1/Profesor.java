package tarea_6_1;
public class Profesor extends Persona{
    String str;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;
    public Profesor(String numeroDeTelefono){
        super(numeroDeTelefono);
    }

    public void printInformacionPersonal(){
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de teléfono: " + numeroDeTelefono);
    }
    public void printTodaLaInformacion(){
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de teléfono: " + this.numeroDeTelefono);
        for (Prestamo p : prestamos){
            System.out.println(p);
        }
    }
}
