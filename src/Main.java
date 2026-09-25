import controller.MovieController;
import repository.MovieRepository;
import repository.MovieRepositoryImpl;
import service.MovieService;

public class Main {
    public static void main(String[] args) {
        // 1. Capa de Persistencia (Acceso a Datos)
        MovieRepository repository = new MovieRepositoryImpl();
        
        // 2. Capa de Negocio (Lógica)
        MovieService service = new MovieService(repository);
        
        // 3. Capa de Presentación (Interfaz de Usuario)
        MovieController controller = new MovieController(service);
        
        // Arrancamos el programa interactivo
        controller.start();
    }
}
