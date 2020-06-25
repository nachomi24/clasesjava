public class Triangulo {
    public int base;
    public int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
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

    //triangulo de abajo a arriba
    public void dibujarTri2(String punto){
        for( int y=0; y < (base+1); y++){
            for (int x=0; x < 4-y; x++) {
                System.out.print("  ");
            }
            for (int x2=0; x2 < y; x2++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
