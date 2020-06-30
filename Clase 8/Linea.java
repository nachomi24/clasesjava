import java.awt.Graphics;
import java.lang.Math;

class Linea {
    int x1;
    int x2;
    int y1;
    int y2;

    

    public void dibujarlinea(Graphics g){
        g.drawLine(0, 480, 960, 480);
    }

    public double distancia(int x1, int x2, int y1, int y2) {
        double distancia = Math.sqrt((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        return distancia;
    }

    public int printPoint1 (int x1, int y1){
       int coordi1 = (x1 + y1);
       return coordi1;
    }
    
    public int printPoint2 (int x2, int y2){
        int coordi2 = (x2 + y2);
        return coordi2;
    }

    public double mlinea1 (int x1, int x2, int y1, int y2){
        double mlinea1 = ((y2-y1)/(x2-x1)); //where m stands for slope
        return mlinea1;
    }
       
    public double mlinea2 (int x1, int x2, int y1, int y2){
        double mlinea2 = ((y2-y1)/(x2-x1)); //where m stands for slope of line 2
        return mlinea2;
    }
       
    public boolean sonParalelos (double mlinea1, double mlinea2){
        if (mlinea1==mlinea2);
        System.out.println("Son paralelas");
        return true;
    }
    
    
}
