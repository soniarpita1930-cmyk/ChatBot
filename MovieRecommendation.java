
import java.util.Scanner;

public class MovieRecommendation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("==================================");
        System.out.println("      MOVIE RECOMMENDATION");
        System.out.println("==================================");

        System.out.println("Choose your favorite category:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Horror");
        System.out.println("4. Romantic");
        System.out.println("5. Science Fiction");

        System.out.print("\nEnter your choice: ");
        choice = sc.nextInt();

        System.out.println();

        if (choice == 1) {
            System.out.println("Recommended Movies:");
            System.out.println("- Avengers");
            System.out.println("- John Wick");
            System.out.println("- Mission Impossible");
        } else if (choice == 2) {
            System.out.println("Recommended Movies:");
            System.out.println("- 3 Idiots");
            System.out.println("- Dhamaal");
            System.out.println("- Hera Pheri");
        } else if (choice == 3) {
            System.out.println("Recommended Movies:");
            System.out.println("- The Conjuring");
            System.out.println("- Annabelle");
            System.out.println("- IT");
        } else if (choice == 4) {
            System.out.println("Recommended Movies:");
            System.out.println("- Titanic");
            System.out.println("- Jab We Met");
            System.out.println("- The Notebook");
        } else if (choice == 5) {
            System.out.println("Recommended Movies:");
            System.out.println("- Interstellar");
            System.out.println("- Inception");
            System.out.println("- Avatar");
        } else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
