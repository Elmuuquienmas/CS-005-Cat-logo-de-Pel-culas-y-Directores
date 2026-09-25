package controller;

import model.Movie;
import service.MovieService;

import java.util.List;
import java.util.Scanner;

public class MovieController {
    private final MovieService service;
    private final Scanner scanner;

    public MovieController(MovieService service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int option = 0;
        do {
            System.out.println("\n=== MENÚ CATÁLOGO DE PELÍCULAS ===");
            System.out.println("1. Registrar nueva película");
            System.out.println("2. Listar todas las películas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingresa un número válido.");
                continue;
            }

            switch (option) {
                case 1:
                    registerMovie();
                    break;
                case 2:
                    listMovies();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (option != 3);
    }

    private void registerMovie() {
        System.out.println("\n--- REGISTRO DE PELÍCULA ---");
        System.out.print("Título: ");
        String title = scanner.nextLine();
        
        System.out.print("Director: ");
        String director = scanner.nextLine();
        
        System.out.print("Género: ");
        String genre = scanner.nextLine();
        
        System.out.print("Duración (minutos): ");
        Integer duration = 0;
        try {
            duration = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Duración inválida. Se registrará como 0.");
        }

        service.registerMovie(title, director, genre, duration);
        System.out.println("✅ Película registrada con éxito.");
    }

    private void listMovies() {
        System.out.println("\n--- LISTADO DE PELÍCULAS ---");
        List<Movie> movies = service.getAllMovies();
        if (movies.isEmpty()) {
            System.out.println("No hay películas registradas.");
        } else {
            for (Movie m : movies) {
                System.out.println(m);
            }
        }
    }
}
