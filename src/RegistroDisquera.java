import java.util.ArrayList;
import java.util.List;

public class RegistroDisquera {
    private static RegistroDisquera instancia;
    private List<String> listaArtistas;
    private RegistroDisquera() {
        this.listaArtistas = new ArrayList<>();
    }

    public static RegistroDisquera getInstance() {
        if (instancia == null) {
            instancia = new RegistroDisquera();
        }
        return instancia;
    }
    public void registrarArtista(String nombre) {
        listaArtistas.add(nombre);
    }

    public void mostrarArtistas() {
        System.out.println("--- Catalogo Maestro de Artistas ---");
        for (String artista : listaArtistas) {
            System.out.println("- " + artista);
        }
    }
}
