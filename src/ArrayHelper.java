import java.util.Arrays;

public class ArrayHelper {
    //Verilen dizideki elemanların harmonik ortalmasını hesaplayan program.
    static void harmonicSeries(int[] numbers){
        double result = 0;

        for(int number : numbers){
            result += ((double) 1 / number);
        }

        System.out.println("Dizinin harmonik serisi: " + result);
    }

    //En küçük ve en büyük elemana en yakın sayıyıları bulan program.
    static void nearestAndFurthest(int[] numbers){
        int min, max, nearest, furthest;

        Arrays.sort(numbers);

        min = numbers[0];
        max = numbers[numbers.length - 1];
        nearest = numbers[Arrays.binarySearch(numbers, min) + 1];
        furthest = numbers[Arrays.binarySearch(numbers, max) - 1];

        System.out.println("En küçük sayıya en yakın sayı: " + nearest);
        System.out.println("En büyük sayıya en yakın sayı: " + furthest);
    }
}
