
import java.util.Scanner;

class ChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();

        if (msg.equals("hi")) {
            System.out.println("Hello!"); 
        }else if (msg.equals("how are you")) {
            System.out.println("I am fine"); 
        }else {
            System.out.println("Okay");
        }
    }
}
