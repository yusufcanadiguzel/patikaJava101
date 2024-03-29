import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    //Kullanıcıdan dizinin eleman sayısını ve elemanları alıp küçükten büyüğe doğru ekrana yazdıran program.
    static void arraySort(){
        int[] numbers;
        int arrayLenght;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        arrayLenght = scanner.nextInt();
        numbers = new int[arrayLenght];

        System.out.println("\nDizinin elemanlarını giriniz : ");
        for (int i = 0; i < arrayLenght; i++){
            System.out.print(i + 1 + ". Elemanı : ");
            numbers[i] = scanner.nextInt();
            System.out.println();
        }

        Arrays.sort(numbers);

        System.out.print("Sıralama : ");
        for (int number : numbers){
            System.out.print(number + " ");
        }
    }
}
