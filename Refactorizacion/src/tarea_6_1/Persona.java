package tarea_6_1;

public class Persona {
    String numeroDeTelefono;
    public Persona(String numeroDeTelefono){
        //Como la clase Persona no hereda de ninguna otra clase no hace falta usar un super();
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getNumeroDeTelefono(){
        //Uso this. para acceder a los atributos de la propia clase.
        return this.numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono){
        //Uso this. para acceder a los atributos de la propia clase.
        this.numeroDeTelefono = numeroDeTelefono;
    }
}
