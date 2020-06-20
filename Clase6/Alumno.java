package ClasesJava.Clase6;

public class Alumno {
    //La siguiente clase tiene un par de errores
    //Tienes que corregirlos para poder
    //Resolver los ejercicios

    //Además de hacer que funcione, tienes que
    //Poner en práctica los principios de encapsulamiento

    int edad;
    String nombre;
    int asistencias;

    public Alumno (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        asistencias = 0;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public int getEdad() {
        return edad;
    }
//faltaba el getter pero ya está
    public String getNombre() {
        return nombre; 
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public void incrementarAsistencias() {
        this.asistencias++;
    }

    public void show(){
        System.out.println("Hola!, soy " + nombre + " tengo " + 
                           edad + " años, y " + asistencias + " asistencias.");
    }
}