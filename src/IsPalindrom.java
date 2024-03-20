public class IsPalindrom {
    static boolean isPalindrom(int number){
        int tempNumber = number, total = 0;

        while(tempNumber != 0){
            total = (total * 10) + (tempNumber % 10);
            tempNumber /= 10;
        }

        return total == number;
    }
}
