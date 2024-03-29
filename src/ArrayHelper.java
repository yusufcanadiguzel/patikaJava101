import java.util.Arrays;

public class ArrayHelper {
    //Verilen dizideki elemanların harmonik ortalmasını hesaplayan program.
    static void harmonicSeries(int[] numbers) {
        double result = 0;

        for (int number : numbers) {
            result += ((double) 1 / number);
        }

        System.out.println("Dizinin harmonik serisi: " + result);
    }

    //En küçük ve en büyük elemana en yakın sayıyıları bulan program.
    static void nearestAndFurthest(int[] numbers) {
        int min, max, nearest, furthest;

        Arrays.sort(numbers);

        min = numbers[0];
        max = numbers[numbers.length - 1];
        nearest = numbers[Arrays.binarySearch(numbers, min) + 1];
        furthest = numbers[Arrays.binarySearch(numbers, max) - 1];

        System.out.println("En küçük sayıya en yakın sayı: " + nearest);
        System.out.println("En büyük sayıya en yakın sayı: " + furthest);
    }

    //Dizi içerisindeki hem çift hemde kendini tekrar eden sayıları bulan algoritma.
    static void isRepeatedEvenNumbers(int[] numbers) {
        int[] evenNumbers = new int[numbers.length];
        int currentIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] == numbers[j]) && (numbers[i] % 2 == 0)) {
                    if (!isContains(evenNumbers, numbers[i])) {
                        evenNumbers[currentIndex++] = numbers[i];
                        break;
                    }
                }
            }
        }

        System.out.print("Tekrar eden çift sayılar: ");

        for (int number : evenNumbers) {
            System.out.print(number + ", ");
        }
    }

    //Değerin dizi içerisinde olup olmadığını bulan algoritma.
    static boolean isContains(int[] numbers, int number) {
        boolean result = false;

        for (int tempNumber : numbers) {
            if (tempNumber == number) {
                result = true;
                break;
            }
        }

        return result;
    }

    static boolean isContainsMatrix(int[][] numbers, int key) {
        boolean result = false;
        int[] tempArray = new int[numbers.length];

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = numbers[i][0];
        }

        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] == key) {
                result = true;
                break;
            }
        }

        return result;
    }

    static int isContainsMatrixIndex(int[][] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i][0] == key) {
                return i;
            }
        }

        return -1;
    }

    static void repeatingFrequency(int[] numbers) {
        int[][] resultArray = new int[numbers.length][2];
        int currentIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i != j){
                    if (isContainsMatrix(resultArray, numbers[i])) {
                        resultArray[isContainsMatrixIndex(resultArray, numbers[i])][1]++;
                        break;
                    } else {
                        resultArray[currentIndex][0] = numbers[i];
                        resultArray[currentIndex][1] = 1;
                        currentIndex++;
                        break;
                    }
                }
            }
        }

        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i][0] != 0) {
                System.out.println(resultArray[i][0] + " sayısı " + resultArray[i][1] + " kere tekrar edildi.");
            }
        }
    }
}
