import java.util.Scanner;

public class Fibonacci {
    static void fibonacci(){
        int number, total = 0, x = 0, y = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        number = scanner.nextInt();
        System.out.println();

        for (int i = 1; i < number; i++){
            total = x + y;
            System.out.println(x + " + " + y + " = " + total);
            x = y;
            y = total;
        }
    }
}
