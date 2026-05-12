
import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ChatBot Started!");
        System.out.println("Type 'bye' to exit.\n");

        while (true) {

            System.out.print("You: ");
            String msg = sc.nextLine().toLowerCase();

            if (msg.equals("hi") || msg.equals("hello")) {
                System.out.println("Bot: Hey!");

            } else if (msg.equals("how are you")) {
                System.out.println("Bot: I'm fine, thanks!");

            } else if (msg.equals("your name")) {
                System.out.println("Bot: I'm a Java ChatBot.");

            } else if (msg.equals("bye")) {
                System.out.println("Bot: Goodbye");
                break;

            } else {
                System.out.println("Bot: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}
