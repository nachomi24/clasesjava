public class Cuadrilatero {
    public int base;
    public int altura;
    public boolean esCuadrado;
    public boolean esRectangulo; 
    
    public Cuadrilatero(final int base, final int altura, final boolean esCuadrado, boolean esRectangulo) {
        this.base = base;
        this.altura = altura;
        this.esCuadrado = esCuadrado;
        this.esRectangulo = esRectangulo; 
    }

    /**
     * Método para saber si es un cuadrado Método para saber si es un rectángulo
     * Método para saber si es irregular Método para saber su área Método para
     * conocer su perímetro
     */
    public void dibujarCuadrilatero(final String punto) {
        for (int y = 0; y < base; y++) {
            for (int x = 0; x < altura; x++) {
                System.out.print(punto); // * horizontal
            }
            System.out.println(" "); // como un <br>
        }
    }

    public boolean esCuadrado(final int base, final int altura, final boolean esCuadrado) {
        if (base == altura) {
            System.out.println("Es un cuadrado");
            return true;
        }
        return false;
    }

    public boolean esRectangulo(final int base, final int altura, boolean esRectangulo) {
        if (base>altura){
            System.out.println("Es un rectangulo");
            return true; 
        }else{
            System.out.println("No es un rectangulo");
        }
        return false; 
    }

    public int calcularAreaCuadrilatero( int base, int altura){
        int area= (base*altura);
        return area; 
    }
}