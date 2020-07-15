public class Usuario {
    String nombre;
    String id;
    int numeroDeCuentas;

    public Usuario (String nombre, String id, int numeroDeCuentas){
        this.nombre= nombre;
        this.id=id;
        this.numeroDeCuentas=numeroDeCuentas;
    
    }

    //getters
    public String getNombreUsuario(){
        return nombre;
    }

    public String getidUsuario(){
        return id;
    }

    public int getNumCuentas(){
        return numeroDeCuentas;
    }
}
