public class PuntoCartesiano {
    //Atributos:
    double x;
    double y;
    
    //Constructor
    public PuntoCartesiano(double x, Double y){
        this.x=x;
        this.y=y;
    }

    public PuntoCartesiano(int x, int y){
        this.x=x;
        this.y=y;
    }
 
    //Getters
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void getCoords(){
        System.out.println("Las coordenadas (x,y) son: " );
        System.out.println("(" + x + "," + y + ")" );
    }
    


}