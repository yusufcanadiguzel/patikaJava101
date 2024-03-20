public class IsPrimeRecursive {
    static boolean isPrimeNumber(int number, int divider){

        if (divider == number) return true;

        if (number == 0 || number == 1) return false;

        if (number % divider == 0) return false;

        return isPrimeNumber(number, divider + 1);
    }
}
