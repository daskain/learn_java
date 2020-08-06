import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.print("What's your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
