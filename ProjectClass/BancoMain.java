public class BancoMain {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Bancomi");

        Usuario usuariosdeBancomi [] = {
            new Usuario("Armando Paredes", "1234", 3),
            new Usuario ("Aquiles Limpio", "5678", 3),
            new Usuario ("Elba Zurita", "9012", 1),
            new Usuario ("Elvis Tek", "3456", 1),
            new Usuario ("Elmer Curio", "7890", 1),
            new Usuario ("Mario Neta", "1234", 1),};
        
        Banco banco = new Banco("Bancomi");

        int registrados= banco.usuariosFaltantes(usuariosdeBancomi);
        System.out.println("Los usuarios registrados son: " + registrados);

        banco.showBanco();
        Banco.nuevoUsuario();
        }

        
}