import java.awt.Graphics;

public class eightclass {

    public static void main(String[] args, Graphics g) {
        //Cuadrilatero
          Cuadrilatero cuadrilatero1 = new Cuadrilatero (4,4, true, false);
          cuadrilatero1.dibujarCuadrilatero("* ");
          cuadrilatero1.esCuadrado(4, 4, true);
          cuadrilatero1.esRectangulo(4,4, false);
          System.out.println("El area del cuadrilatero es: " + calcularAreaCuadrilatero(4, 4));
          System.out.println("El perimetro del cuadrilatero es: " + calcularPerimetroCuadrilatero(4, 4));

        //Triangulo
        Tryangulo tryangulo1 = new Tryangulo (2,4, 4, 4);
        tryangulo1.dibujarTri1("* ");
        System.out.println("El area del triangulo es: " + calcularAreaTriangulo(4, 4));
        System.out.println("El perimetro del triangulo es: " + calcularPerimetroTriangulo(1, 2, 3));

        //Linea
        Linea linea1 = new Linea();
        linea1.dibujarlinea(g);
        System.out.println("Las líneas son paralelas? " + sonParalelos(4,4));
        linea1.printPoint1(2,4);
        linea1.printPoint2(4,4);
    }

        private static boolean sonParalelos(double mlinea1, double mlinea2) {
            if (mlinea1==mlinea2);
            System.out.println("Son paralelas");
            return true;
        }


        private static int calcularAreaCuadrilatero(int base, int altura) {
            int area= base*altura;
            return area;
        }

        private static int calcularPerimetroCuadrilatero(int base, int altura){
            int perimetro= ((base*2)+(altura*2));
            return perimetro; 
        }

        private static int calcularAreaTriangulo(int h, int c){
            int areaTri= (h*c)/2;
            return areaTri;
        }

        private static int calcularPerimetroTriangulo(int a, int b, int c){
            int perimetroTri= a+b+c;
            return perimetroTri;
        }
}
