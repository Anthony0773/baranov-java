import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите перовое число:");
            int one = new Scanner(System.in).nextInt();
            System.out.println("Введите второе число:");
            int two = new Scanner(System.in).nextInt();
            if (one < two || one > two ) {
                System.out.println("Строки неидентичны");
            } else {
                System.out.println("Строки идентичны");
                break;
            }
        }
    }
}

