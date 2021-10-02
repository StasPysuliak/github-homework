import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        print(scanner.nextLine());
        print(scanner.nextLine(), scanner.nextInt());

    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void print(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
}
