package ClasesJava.Clase6;
 //Debes construir esta clase
    //y completar los métodos existentes

    //De de tener los siguientes atributos:
        // Array de n alumnos DONE 
        // Nombre del profesor DONE 
        // Salón DONE
public class Salon {
    String profesor;
    boolean salon; 
    Alumno alumnosDeLaClase [] = {
        new Alumno("Juanito", 10 ),
        new Alumno("Pedrito", 11),
        new Alumno("Anita", 10),
        new Alumno("Maria", 9),
        new Alumno("Danielita", 10),
        new Alumno("Camilita", 11),
        new Alumno("Betito", 9),
        new Alumno("Marianito", 9)};

     /* Método que te indica si un alumno está
     * registrado o no. 
     * @param nombreAlumno
     * @return true si está, false si no
     */
    public boolean estaRegistrado(String nombreAlumno){

        for (Alumno integrante: alumnosDeLaClase){
            if (integrante.getNombre().equals(nombreAlumno))
            {
                return true;
            }
                
        }
        return false;
    }        
    
    /**
     * Dado un array de alumnos, 
     * te dice CUÁNTOS alumnos faltaron.
     * Incrementa en uno las asistencias 
     * de los alumnos.
     * @param asistencias
     * @return número de faltantes
     */
    public int alumnosFaltantes(Alumno[] asistencias){
        int faltantes = 0;
        for (Alumno integrante: alumnosDeLaClase){
            if (integrante.getAsistencias().equals(asistencias))
        { if (asistencias>8) {

        }
            return asistencias;
        }
        return faltantes;
    }
    

    public void mostrarSalon(){
        System.out.println("La clase del profesor: ");
        System.out.println("Está en el salón: ");
        System.out.println("Sus alumnos son: ");
        for (Alumno integrante: alumnosDeLaClase){
            System.out.print("\t");
            integrante.show();
        }
    }


}