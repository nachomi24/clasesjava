public class Casita {
    String techo;
    String casa;
    int base;
    int altura;

    public Casita(int base, int altura) {
        this.base = base;
        this.altura = altura;
	}

    public void dibujarCasa(String punto){
       for (int y=0; y < base; y++){
           for (int x=0; x< altura ; x++){
               System.out.print(punto); 
            }
        System.out.println(" "); 
        }
    }
    public void Piramide(int base) {
        this.base=base;

    }
    public String [][] p1(){
        String[][] t2 = new String [base][base];
        for (int y = 0; y < base; y++){
            for (int x = (base-y)-1; x< base; x++) {
                t2 [y][x] = "* "; 
            }
        }
        return t2; 
    }

    public String [][] p2(){
    String[][] t2 = new String [base][base];
    for (int y = 0; y < base; y++){
        for (int x = (base-y)-1; x< base; x++) {
            t2 [y][x] = "* "; 
        }
    }
    return t2; 
}

    public String[][] printPiramide(){
        String[][] piramide = new String [base][base*2];
        String[][] t1 = p1();
        String[][] t2 = p2();
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < piramide[i].length; j++) {
                if (j < base){
                    piramide[i][j] = t1[i][j]; 
                }else{
                    piramide[i][j] = t2[i][j-base-1];
                }
              
            
            }  System.out.println("* ");
        }
        return piramide; 
    }
}