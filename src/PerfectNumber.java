import java.util.Scanner;

public class PerfectNumber {
    static void isPerfectNumber(){
        int number, total = 0;
        boolean isPerfect = false;
        String message;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();
        System.out.println();

        for (int i = 1; i < number; i++){
            if(number % i == 0){
                total += i;
            }
        }

        if(total == number) isPerfect = true;

        if(isPerfect){
            System.out.println(number + " mükemmel bir sayıdır.");
        }else {
            System.out.println(number + " mükemmel bir sayı değildir.");
        }
    }
}
