public class Main {
    public static void main(String[] args) {
        RegistroDisquera departamentoMarketing = RegistroDisquera.getInstance();
        RegistroDisquera departamentoProduccion = RegistroDisquera.getInstance();
        departamentoMarketing.registrarArtista("Dua Lipa");
        departamentoMarketing.registrarArtista("The Weeknd");
        departamentoProduccion.registrarArtista("Rosalia");
        departamentoProduccion.mostrarArtistas();
        System.out.println("\n¿Ambas variables apuntan a la misma instancia?");
        System.out.println(departamentoMarketing == departamentoProduccion);
    }
}
