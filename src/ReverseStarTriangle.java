import java.util.Scanner;

public class ReverseStarTriangle {
    static void reverseStarTriangle(){
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        number = scanner.nextInt();
        System.out.println();

        for (int i = number; i >= 1; i--){
            for (int j = i * 2 - 1; j >= 1; j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
