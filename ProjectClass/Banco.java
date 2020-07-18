import java.util.Scanner;
public class Banco {
    private String nombreBanco;
    String nuevoUsuario;
    String nuevoid;
    static int nuevaCuentadinero;
    static int cuentasEnBanco;

    public void verCrear (String string, int i){
    }

        Usuario usuariosDelBanco []={ 
        new Usuario("Armando Paredes", "1234", 3),
        new Usuario ("Aquiles Limpio", "5678", 3),
        new Usuario ("Elba Zurita", "9012", 1),
        new Usuario ("Elvis Tek", "3456", 1),
        new Usuario ("Elmer Curio", "7890", 1),
        new Usuario ("Mario Neta", "1234", 1)};

    //constructor
    public Banco (String nombreBanco){
        this.nombreBanco= nombreBanco;
    }

    public String getBanco(){
        return nombreBanco;
    }

    public boolean estaRegistrado(String nombreUsuario){
        for (Usuario usuario : usuariosDelBanco){
        if (usuario.getNombreUsuario().equals(nombreUsuario)){
            return true;
        }
        }return false;
    }

    public int usuariosFaltantes(Usuario[] numeroDeCuentas){
        int usuariosRegistrados = 6 ;
        for (Usuario registrado : numeroDeCuentas){
            for (Usuario usuario : usuariosDelBanco){
                if (numeroDeCuentas.equals(usuario.getNombreUsuario()) &&
                registrado.getNumeroDeCuentas()== usuario.getNumeroDeCuentas()){
                    usuario.nuevoNumeroDeCuentas();
                    usuariosRegistrados++;
                }
            
            }
        }return usuariosRegistrados;
    }


    public void showBanco(){
        System.out.println("El banco: " + nombreBanco);
        System.out.println("Está compuesto de: ");
        for (Usuario registrado: usuariosDelBanco){
            System.out.println("\t");
            ((Usuario) registrado).show();
        }
    } 

    public static void nuevoUsuario(){
      Scanner teclado = new Scanner(System.in);
      String [] newUsers = new String [10];

    for (int counter = 0; counter < 1; counter++){
        System.out.println("Ingrese su nombre completo");
        newUsers[counter] = teclado.nextLine();
    }

    System.out.println("Cree una contraseña");

    System.out.println("Ingrese cuanto dinero quiere depositar ");
      nuevaCuentadinero= teclado.nextInt();
      teclado.skip(System.lineSeparator());
    teclado.close();

    System.out.println("Se ha creado un nuevo usuario exitosamente: ");
    for (int counter=0; counter <1; counter++){
        System.out.println(newUsers[counter]);
    }

    }
    
}
