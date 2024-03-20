import java.util.Scanner;

public class PrimeNumbers {
    static void primeNumbers(){
        int number;
        boolean isPrime = true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        number = scanner.nextInt();
        System.out.println();

        for (int i = 2; i <= number; i++){
            for (int j = 2; j < i; j++){
                if(i % j == 0) isPrime = false;
            }

            if (isPrime) System.out.print(i + " ");

            isPrime = true;
        }
    }
}
