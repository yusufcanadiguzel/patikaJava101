public class FibonacciRecursive {
    static int fibonacci(int number){

        if(number <= 2) return 1;

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
