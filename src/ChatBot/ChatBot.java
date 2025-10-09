import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        String bot_name = "Akaza";
        int birth_year = 2025;

        System.out.println("Hello! My name is " + bot_name);
        System.out.println("I was created in " + birth_year);
        System.out.println("Please, remind me your name");

        Scanner scanner =  new Scanner(System.in);
        String your_name = scanner.nextLine();


        System.out.println("What a great name you have, " + your_name);
    }
}