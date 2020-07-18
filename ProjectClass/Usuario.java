
public class Usuario {
    String nombreUsuario;
    String idUsuario;
    int numeroDeCuentas;

    public Usuario (String nombreUsuario, String idUsuario, int numeroDeCuentas){
        this.nombreUsuario=nombreUsuario;
        this.idUsuario=idUsuario;
        this.numeroDeCuentas=numeroDeCuentas;
    }
    
    //getters
    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public String getidUsuario(){
        return idUsuario;
    }

    public int getNumeroDeCuentas(){
        return numeroDeCuentas;
    }

	
    public void setNumeroDeCuentas(int numeroDeCuentas){
        this.numeroDeCuentas= numeroDeCuentas;
    }

    public void nuevoNumeroDeCuentas(){
        this.numeroDeCuentas++;
    }
    
    public void show() {
        System.out.println("Información de usuario:");
        System.out.println("Nombre: " + nombreUsuario);
        System.out.println("Id: " + idUsuario);
        System.out.println("# de cuentas: " + numeroDeCuentas);
    }
}


