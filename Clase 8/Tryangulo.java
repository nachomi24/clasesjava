public class Tryangulo {
    public int h; //altura
    public int a; //ladoa
    public int b; //ladob
    public int c; //base

    public Tryangulo(int h, int a, int b, int c) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
    }
	
    public void calcularAreaTriangulo(){
    }
    //triangulo de arriba a abajo
    public void dibujarTri1(String punto){
       for (int y=0; y < 4; y++){ // la base
           for (int x=0; x< y+1 ; x++){
               System.out.print(punto); //* horizontal
            }
        System.out.println(" "); // como un <br>
        }
    }

    public boolean esEquilatero(int a, int b, int c){
        if (a ==b && b==c && c==a) {
            System.out.println("Es un triangulo equilatero");
            return true;
        }
        return false;
    }

    public boolean esIsoceles (int a, int b, int c){
        if (a==b){
            System.out.println("Es un triangulo isóceles");
            return true;
        }
        return false;
    }

    public boolean esEscaleno (int a, int b, int c){
        if (a!=b && b!=c && c!=a){
            System.out.println("Es un triangulo isóceles");
            return true;
        }
        return false;
    }



    /**
     * Método para saber si es equilatero
     * Método para saber si es rectángulo
     * Método para saber si es isóceles
     * Método para saber si es escaleno
     * Método para saber su área
     * Método para conocer su perímetro
     */
    
}
