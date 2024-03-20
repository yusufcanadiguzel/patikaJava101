import java.util.Scanner;

public class MinMax {
    static void minMax(){
        int counter, number, bigger = 0, lower = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Gireceğiniz sayı adedini yazınız: ");
        counter = input.nextInt();

        for (int i = 1; i <= counter; i++){
            System.out.print("\nBir sayı giriniz: ");
            number = input.nextInt();

            if(i == 1){
                bigger = number;
            }

            if (i == 2){
                if (number > bigger){
                    lower = bigger;
                    bigger = number;
                }
            }

            if (number > bigger){
                bigger = number;
            }else if (number < lower){
                lower = number;
            }
        }

        System.out.println("\nEn büyük sayı: " + bigger);
        System.out.print("En küçük sayı: " + lower);
    }
}
