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
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + age + "! That's a good time to start programming! ");

        System.out.println("Now I will prove to you that I can count to any number you want!");

        int user_inp = scanner.nextInt();

        for (int i = 0; i <= user_inp; i++) {
            System.out.println(i + "!");
        }
    }
}