
import java.lang.Math;
import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
    int grados;
    int radianes;
    int catetoOpuesto;
    int catetoAdjacente;

    //Pythagoream Theorem 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Dame el cateto opuesto: ");
    catetoOpuesto = teclado.nextInt();
    System.out.println("Dame el cateto adjacente: ");
    catetoAdjacente = teclado.nextInt();
    

    //Grados a Radianes
    System.out.println("Dame los grados: ");
    grados = teclado.nextInt();

    //Radianes a Grados
    System.out.println("Dame los radianes: ");
    radianes = teclado.nextInt();

    //Regresar valores
    System.out.println("La hipotenusa es: " + calcularHipotenusa(catetoOpuesto, catetoAdjacente) );
    System.out.println("Valor en radianes: " + gradosRadianes(grados));
    System.out.println("Valor en grados: " + radianesGrados(radianes));
teclado.close(); 
    }

    //Calcular hipotenusa
    static double calcularHipotenusa (double catetoOpuesto, double catetoAdjacente){
        double hipotenusa = Math.sqrt((catetoOpuesto*catetoOpuesto) + (catetoAdjacente*catetoAdjacente));
        return hipotenusa;
    }

    //Calcular grados a radianes
    static double gradosRadianes (double grados){
       double radianes = grados/180; 
       return radianes;
    }
     //Calcular radianes a grados 
    static double radianesGrados (double radianes){
        double grados = radianes*180;
        return grados;
    }

    }
