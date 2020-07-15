//package ClasesJava.Clase7;

//import java.util.Arrays;

public class seventhclass {
    public static void main(String[] args) {
      //Rectangulo
        Rectangulo rectangulo1 = new Rectangulo (4,4);
        rectangulo1.dibujarRectangulo("* ");
        System.out.println("El area del rectangulo es: " + calcularAreaRectangulo(4, 4));
        System.out.println("HOLAAAA");
        
        //Triangulo de arriba a abajo
        Triangulo triangulo1 = new Triangulo (4,4);
        triangulo1.dibujarTri1("* ");
        System.out.println("El area del triangulo es: " + calcularAreaTriangulo(4,4));

        //Triangulo de abajo a arriba
        Triangulo triangulo2 = new Triangulo (4,4);
        triangulo2.dibujarTri2("* ");
        System.out.println("El area del triangulo es: " + calcularAreaTriangulo(4,4));
             
        //Piramide
        Piramide piramide1 = new Piramide(4);
        piramide1.printPiramide();

        //Casita
        Piramide techo = new Piramide(4);
        techo.printPiramide();
        Rectangulo casa1 = new Rectangulo (4,4);
        casa1.dibujarRectangulo("* ");

        
        /**
         * Crea la clase rectángulo
         * Tú debes de indicar los atributos
         * Debe de tener como métodos:
         *     Dibujar:
         *          + + + +
         *          + + + +
         *          + + + +
         *          + + + +
         *     Obtener área
         *     Seleccionar el punto "*,+,♦,..."
         * -----------------------------------
         * Crea la clase Triángulo
         * Igual, decide los atributos
         * Métodos:
         *     Dibujar: (Puede ser en dos direcciones)
         * 
         *      *     |     *
         *      * *   |   * *
         *      * * * | * * *
         *     Obtener área (como lo hemos visto previamente)
         *     Seleccionar el punto "*,+,♦,..."
         * --------------------------------------------------     
         * Apartir de la clase triángulo, crea una clase pirámide
         * Métodos:
         *     Obtener el área
         *     Dibujar
         *          *
         *        * * *
         *      * * * * *
         *    * * * * * * *
         *  * * * * * * * * *
         * --------------------------------
         * Apartir de la clase pirámide y rectángulo, crea la clase 
         * Casita.
         * Tú defines los atributos
         * Sólo tiene el método de dibujar:
         *         *
         *        * *
         *       * * *
         *      * * * *
         *     * * * * *
         *    * * * * * *
         *   * * * * * * *
         *   * * * * * * *
         *   * * * * * * *
         *   * * * * * * *
         *   * * * * * * *
         *   * * * * * * *
        */


    }

    private static int calcularAreaRectangulo(int base, int altura){
        int area= base*altura;
        return area;
    }

    private static int calcularAreaTriangulo(int base, int altura){
        int area= (base*altura)/2;
        return area;

    }

    public static void printArray(char[][] array) {
        
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j< array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    } public String [][] dibujar (){
        String [] [] arrayBi = new String [3][2];
        return arrayBi;
    }
}