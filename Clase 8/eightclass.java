public class eightclass {

    public static void main(String[] args) {
        //Punto
        System.out.println("El punto:");
        PuntoCartesiano punto1 = new PuntoCartesiano (2,4);
        punto1.getCoords();
        System.out.println(" ");

        //Linea
        System.out.println("La linea:");
        Linea linea1 = new Linea(4,-2,2,4); //x1,x2,y1,y2
        Linea linea2 = new Linea(0,1,2,5); //x1,x2,y1,y2
        System.out.println("La distancia es:" + linea1.distancia());
        if (linea1.sonParalelos(linea2)) {
            System.out.println("Son paralelas"); }
            else{ System.out.println("No son paralelas");}
        if (linea1.sonPerpendiculares(linea2)) {
            System.out.println("Son perpendiculares"); }
            else{System.out.println("No son perpendiculares");}
        System.out.println(" ");

        //Triangulo
        System.out.println("El triangulo: ");
        Tryangulo triangulo1 = new Tryangulo(-2,0,2,0,4,0); // x1,x2,x3,y1,y2,y3
        System.out.println("El lado a mide: " + triangulo1.sidea());
        System.out.println("El lado b mide: " + triangulo1.sideb());
        System.out.println("El lado c mide: " + triangulo1.sidec());
        System.out.println("El perimetro del triangulo es: " + triangulo1.perimetroTriangulo(triangulo1));
        System.out.println("El area es: " + triangulo1.areaTriangulo(triangulo1));
        
        if (triangulo1.esEquilatero(triangulo1)) {
            System.out.println("Es equilatero");}
            else{ System.out.println("No es equilatero");}

        if (triangulo1.esIsoceles(triangulo1)) {
            System.out.println("Es Isóceles");}
            else{ System.out.println("No es Isóceles");}
        
        if (triangulo1.esEscaleno(triangulo1)) {
            System.out.println("Es Escaleno");}
            else{ System.out.println("No es Escaleno");}
        
        System.out.println(" ");
        
        //Cuadrilatero
        System.out.println("El cuadrilatero: ");
        Cuadrilatero cuadrilatero1 = new Cuadrilatero(0,2,0,0,4,0,4,2); //x1,y1,x2,y2,x3,y3,x4,y4
        System.out.println("El lado 1 mide: " + cuadrilatero1.lado1());
        System.out.println("El lado 2 mide: " + cuadrilatero1.lado2());
        System.out.println("El lado 3 mide: " + cuadrilatero1.lado3());
        System.out.println("El lado 4 mide: " + cuadrilatero1.lado4());
        System.out.println("El perimetro es: " + cuadrilatero1.perimetroCuadrilatero(cuadrilatero1));
        System.out.println("El area es: " + cuadrilatero1.areaCuadrilatero(cuadrilatero1));
        
        if (cuadrilatero1.esCuadrado(cuadrilatero1)){
            System.out.println("Es un cuadrado");}
            else{ System.out.println("No es un cuadrado");}
        
        if (cuadrilatero1.esRectangulo(cuadrilatero1)){
            System.out.println("Es un rectángulo");}
            else{ System.out.println("No es un rectángulo");}
        
        if (cuadrilatero1.esIrregular(cuadrilatero1)){
            System.out.println("Es irregular");}
            else{ System.out.println("No es irregular");}
        }
}
