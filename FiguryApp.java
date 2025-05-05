import java.util.Scanner;

public class FiguryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tworzymy obiekt Scanner do pobierania danych od użytkownika
        
        while (true) { // Pętla, która pozwala na wielokrotne korzystanie z aplikacji
            System.out.println("\n=== KALKULATOR POLA FIGUR ===");
            System.out.println("1. Kwadrat");
            System.out.println("2. Prostokąt");
            System.out.println("3. Trójkąt");
            System.out.println("4. Wyjście");
            System.out.print("Wybierz figurę (1-4): ");
            
            // Pobieramy wybór użytkownika
            int wybor = scanner.nextInt();

            // Sprawdzamy wybór użytkownika
            switch (wybor) {
                case 1: // Kwadrat
                    System.out.print("Podaj długość boku kwadratu: ");
                    double bok = scanner.nextDouble(); // Pobieramy długość boku kwadratu
                    System.out.println("Pole kwadratu: " + (bok * bok)); // Obliczamy pole i wyświetlamy
                    break;
                case 2: // Prostokąt
                    System.out.print("Podaj długość prostokąta: ");
                    double dlugosc = scanner.nextDouble(); // Pobieramy długość prostokąta
                    System.out.print("Podaj szerokość prostokąta: ");
                    double szerokosc = scanner.nextDouble(); // Pobieramy szerokość prostokąta
                    System.out.println("Pole prostokąta: " + (dlugosc * szerokosc)); // Obliczamy pole i wyświetlamy
                    break;
                case 3: // Trójkąt
                    System.out.print("Podaj podstawę trójkąta: ");
                    double podstawa = scanner.nextDouble(); // Pobieramy podstawę trójkąta
                    System.out.print("Podaj wysokość trójkąta: ");
                    double wysokosc = scanner.nextDouble(); // Pobieramy wysokość trójkąta
                    System.out.println("Pole trójkąta: " + (0.5 * podstawa * wysokosc)); // Obliczamy pole i wyświetlamy
                    break;
                case 4: // Wyjście
                    System.out.println("Do zobaczenia!"); // Komunikat po wyjściu
                    return; // Kończy program
                default:
                    System.out.println("Nieprawidłowy wybór."); // Obsługuje błędny wybór
            }

            // Prosi użytkownika o naciśnięcie ENTER przed kolejnym cyklem
            System.out.println("\nNaciśnij ENTER, aby kontynuować...");
            scanner.nextLine(); // Wchłania Enter po liczbie
            scanner.nextLine(); // Czeka na Enter od użytkownika
        }
    }
}
