public class Cuadrilatero {
   PuntoCartesiano punto1;
   PuntoCartesiano punto2;
   PuntoCartesiano punto3;
   PuntoCartesiano punto4;
    
   //constrcutor
    public Cuadrilatero(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.punto1= new PuntoCartesiano(x1,y1);
        this.punto2= new PuntoCartesiano(x2,y2);
        this.punto3= new PuntoCartesiano(x3,y3);
        this.punto4= new PuntoCartesiano(x4,y4);
    }

    public double lado1() {
        double c= punto1.getX()-punto2.getX();
        double b= punto1.getY()-punto2.getY();
        double a= Math.hypot (c,b);
        return a;
    }

    public double lado2() {
        double c= punto2.getX()-punto3.getX();
        double a= punto2.getY()-punto3.getY();
        double b= Math.hypot (c,a);
        return b;
    }

    public double lado3() {
        double a= punto3.getX()-punto4.getX();
        double b= punto3.getY()-punto4.getY();
        double c= Math.hypot (a,b);
        return c;
    }

    public double lado4() {
        double b= punto1.getX()-punto4.getX();
        double c= punto1.getY()-punto4.getY();
        double d= Math.hypot (b,c);
        return d;
    }

    public boolean esCuadrado(Cuadrilatero cuadrilatero1){
        if (cuadrilatero1.lado1() == cuadrilatero1.lado2() &&
            cuadrilatero1.lado2()== cuadrilatero1.lado3() &&
            cuadrilatero1.lado3()==cuadrilatero1.lado4()&&
            cuadrilatero1.lado4()==cuadrilatero1.lado1())
        {
            return true; 
        }else{
            return false;
        }   
    }

    public boolean esRectangulo(Cuadrilatero cuadrilatero1){
        if (cuadrilatero1.lado2()!= cuadrilatero1.lado3()||
            cuadrilatero1.lado1()!= cuadrilatero1.lado4()) 

        {
            return true; 
        }else{
            return false;
        }   
    }

    public boolean esIrregular(Cuadrilatero cuadrilatero1){
        if (cuadrilatero1.lado1()!= cuadrilatero1.lado2() &&
            cuadrilatero1.lado2()!= cuadrilatero1.lado3() &&
            cuadrilatero1.lado3()!=cuadrilatero1.lado4() &&
            cuadrilatero1.lado4()!=cuadrilatero1.lado1())
        {
            return false; 
        }else{
            return true;
        }   
    }

    public double perimetroCuadrilatero(Cuadrilatero cuadrilatero1){
        double perimetroCuadri= cuadrilatero1.lado1() + cuadrilatero1.lado2() + 
                                cuadrilatero1.lado3() + cuadrilatero1.lado4();
        return perimetroCuadri;
    }

    public double areaCuadrilatero (Cuadrilatero cuadrilatero1){
        double areaCuadri= cuadrilatero1.lado2()*cuadrilatero1.lado3();
        return areaCuadri;
    }
}