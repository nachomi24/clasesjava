public class OperadorMain{
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Bancomi");

        Cuenta cuenta1 = new Cuenta(); 
        cuenta1.nombreUsuario();cuenta1.idUsuario();cuenta1.getDineroInit();cuenta1.acciones();
        Cuenta cuenta2= new Cuenta();
        cuenta2.nuevaCuenta();
        
        
    }
}