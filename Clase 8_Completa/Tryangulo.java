public class Tryangulo {
    PuntoCartesiano punto1;
    PuntoCartesiano punto2;
    PuntoCartesiano punto3;
    
    //constructor
    public Tryangulo(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.punto1= new PuntoCartesiano(x1,y1);
        this.punto2= new PuntoCartesiano(x2,y2);
        this.punto3= new PuntoCartesiano(x3,y3);
    }
	
   

    public double sidea() {
        double c= punto1.getX()-punto2.getX();
        double b = punto1.getY()-punto2.getY();
        double a = Math.hypot (c,b);
        return a;
    }

    
    public double sideb() {
        double c= punto2.getX()-punto3.getX();
        double a = punto2.getY()-punto3.getY();
        double b = Math.hypot (c,a);
        return b;
    }

    public double sidec() {
        double a= punto1.getX()-punto3.getX();
        double b = punto1.getY()-punto3.getY();
        double c = Math.hypot (a,b);
        return c;
    }

    public boolean esEquilatero(Tryangulo triangulo1){
        if (triangulo1.sidea() == triangulo1.sideb() &&
            triangulo1.sideb()==triangulo1.sidec() && 
            triangulo1.sidec()==triangulo1.sidea()) 
        {
            return true;
        }else{ 
            return false;
        }
    }

    public boolean esIsoceles (Tryangulo triangulo1){
        if (triangulo1.sidea() == triangulo1.sideb()
         || triangulo1.sidec()==triangulo1.sidea()
         || triangulo1.sideb()==triangulo1.sidec())
        {
            return true;
        }
        return false;
    }

    public boolean esEscaleno (Tryangulo triangulo1){
        if (triangulo1.sidea()!=triangulo1.sideb() && 
            triangulo1.sideb()!= triangulo1.sidec() && 
            triangulo1.sidec()!=triangulo1.sidea())
        {
            return true;
        }
        return false;
    }

	public double perimetroTriangulo(Tryangulo triangulo1) {
        double perimetroTri= triangulo1.sidea() + triangulo1.sideb() +triangulo1.sidec();
        return perimetroTri;
    }
    
    public double areaTriangulo(Tryangulo triangulo1) {
        double s= 0.5*(triangulo1.sidea()+triangulo1.sideb()+triangulo1.sidec());
        double areaTri= Math.sqrt(s*(s-triangulo1.sidea())*(s-triangulo1.sideb())*(s-triangulo1.sidec()));
        return areaTri;
    }
}
