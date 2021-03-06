import java.util.Scanner;

public class Cuenta {
    //Atributos
    double dineroEnCuenta; 
    String nombreUsuario;
    String idUsuario;
    double accionPrevia;

    public void Acciones(String string, int i) {
    }
    
    //tener una varibale estatica cambia de valor cada que se crea una nueva cuenta, para
    //saber cuantas cuentas hay y agregar las iniciales de la persona
    public static void idUnico(){
    }

	public String nombreUsuario(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese su nombre completo");
        nombreUsuario= teclado.next();
        return nombreUsuario;
    }

    void idUsuario(){
        Scanner teclado = new Scanner (System.in);
        String idUsuario, input;
        int intentos;
        idUsuario="1234";
        intentos= 0;
        while (intentos<3){
            System.out.println("Ingresa tu contraseña: ");
            input = teclado.nextLine();
            if (input.equals(idUsuario)){
            System.out.println("Contraseña válida");
            break;
            }else{ System.out.println("Contraseña incorrecta. Intente de nuevo.");
        intentos ++; }
            
        }
    }

    //Getters
    public double getDineroInit(){
       Scanner teclado = new Scanner (System.in);
       System.out.println("¿Cuánto dinero tiene en su cuenta?");
       dineroEnCuenta = teclado.nextDouble();
       return dineroEnCuenta;
    }

    //Métodos deposito, retiro, transferencia

    void depositar (double montoDeposito) {
        if(montoDeposito !=0){
            dineroEnCuenta = dineroEnCuenta + montoDeposito;
            accionPrevia= montoDeposito;

        }
    }
    
    public void retirar(double montoRetiro) {
        if(montoRetiro !=0){
            dineroEnCuenta = dineroEnCuenta - montoRetiro;
            accionPrevia= -montoRetiro;
        }
    }

    void getAccionPrevia(){
        if (accionPrevia > 0) {
            System.out.println("Se han depositado: " +accionPrevia);}
        else if(accionPrevia < 0 ){
            System.out.println("Se han retirado: "+ Math.abs(accionPrevia));}
    }
    
    void nuevaCuenta( ) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese su nombre completo");
        nombreUsuario=teclado.next();
        System.out.println("Ingrese una contraseña");
        idUsuario= teclado.nextLine();
        System.out.println("Ingrese el dinero a depositar en la nueva cuenta");
        dineroEnCuenta= teclado.nextDouble();
        System.out.println("Se ha creado exitosamente su cuenta");
    
    }
            
    //Mostrar y seleccionar opciones 
    void acciones(){
        char accion;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Bienvenido(a) "+ nombreUsuario);
        System.out.println("¿Qué acción quiere realizar hoy?");
        System.out.println(" ");
        System.out.println("A. Checar estatus de la cuenta");
        System.out.println("B. Depositar");
        System.out.println("C. Retirar");
        System.out.println("D. Crear nueva cuenta");
        System.out.println("E. Transacción previa");
        System.out.println("F. Salir");
        
	do{
        System.out.println("Ingrese una opción");
        accion = teclado.next().charAt(0);
    
        switch(accion){
          case 'A' :
          System.out.println("El estatus de la cuenta es: " + dineroEnCuenta);
          break;

          case 'B' :
          System.out.println("Ingrese el monto a depositar: ");
          double montoDeposito= teclado.nextDouble();
          depositar(montoDeposito);
          break;

          case 'C' :
          System.out.println("Ingrese el monto a retirar: ");
          double montoRetiro= teclado.nextDouble();
          retirar(montoRetiro);
          break;

          case 'D' :
          nuevaCuenta();
          break;
    
          case 'E' :
          getAccionPrevia();
          break;

          default:
          //if (accion != ('A'|| 'B'|| 'C' || 'D' || 'E' || 'F' )){
          System.out.println("¡Opción no válida! Ingrese una opción.");
          break;
        }
        }while(accion != 'F');
        System.out.println("Gracias por usar los servicios Bancomi");
        teclado.close();  }
        
        
}