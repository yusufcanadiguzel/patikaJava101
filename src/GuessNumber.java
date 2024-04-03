import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static void guessNumber(){
        int randomNumber, guessedNumber, counter = 0;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        randomNumber = random.nextInt() * 101;

        do {
            System.out.print("Tahmininizi giriniz: ");
            guessedNumber = scanner.nextInt();
            if(guessedNumber != randomNumber){
                System.out.println("Bilemediniz.");
                counter++;
            }
        } while (guessedNumber != randomNumber);

        System.out.println("\nTebrikler! Bildiniz.");
        System.out.println("Doğru cevap: " + randomNumber);
        System.out.println("Toplam deneme: " + counter);
    }
}
