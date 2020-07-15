import java.lang.Math;

class Linea {
    //atributos
    PuntoCartesiano punto1;
    PuntoCartesiano punto2;

    //constructor
    public Linea (double x1, double x2, double y1, double y2){
        this.punto1= new PuntoCartesiano(x1,y1);
        this.punto2= new PuntoCartesiano(x2,y2);
    }

    public double distancia() {
        double a= punto1.getX()-punto2.getX();
        double b = punto1.getY()-punto2.getY();
        double c = Math.hypot (a,b);
        return c;
        //System.out.println("La distancia de la linea es: " + distancia);
    }

    public void printPoint1(){
       punto1.getCoords();
    }
    
    public void printPoint2(){
        punto1.getCoords();
    }

    public double slope (){
        double slope = ((punto1.getY()-punto2.getY())/(punto1.getX()-punto2.getX())); 
        return slope;
    }
       
    public boolean sonParalelos (Linea linea1){
        if (linea1.slope() == slope()){
        return true;
        }else{
            return false;
        }  
    } 

    public boolean sonPerpendiculares (Linea linea1){
        if ((linea1.slope() * slope() == -1) ){
            return true;
        }else{
            return false; 
        }
    }
}
