import java.util.Scanner;

public class gcdAndLcmFinder {
    static  void gcdAndLcm(){
        int number1, number2, gcd = 0, lcm, counter, biggerNumber;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        number1 = input.nextInt();

        System.out.print("\nİkinci sayıyı giriniz: ");
        number2 = input.nextInt();

        biggerNumber = Math.max(number1, number2);
        counter = biggerNumber;

        while (counter >= 1){
            if(number1 % counter == 0 && number2 % counter == 0){
                gcd = counter;
                break;
            }
            counter--;
        }

        lcm = (number1 * number2) / gcd;

        System.out.print("\nEBOB: " + gcd);
        System.out.print("\nEKOK: " + lcm);
    }
}
