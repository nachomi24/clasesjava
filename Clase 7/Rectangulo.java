public class Rectangulo {
    public int base;
    public int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
	}

    public void dibujarRectangulo(String punto){
       for (int y=0; y < base; y++){
           for (int x=0; x< altura ; x++){
               System.out.print(punto); //* horizontal
            }
        System.out.println(" "); // como un <br>
        }
    }
}
