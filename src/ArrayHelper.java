public class ArrayHelper {
    static void harmonicSeries(int[] numbers){
        double result = 0;

        for(int number : numbers){
            result += ((double) 1 / number);
        }

        System.out.println("Dizinin harmonik serisi: " + result);
    }
}
