public class IsPalindrom {
    static boolean isPalindromNumber(int number){
        int tempNumber = number, total = 0;

        while(tempNumber != 0){
            total = (total * 10) + (tempNumber % 10);
            tempNumber /= 10;
        }

        return total == number;
    }

    static void isPalindromWord(String word){
        String tempWord = "";
        for(int i = word.length() - 1; i >= 0; i--){
            tempWord += word.charAt(i);
        }

        if(word.equals(tempWord)){
            System.out.println("Girdiğiniz kelime palindromdur.");
        }else{
            System.out.println("Girdiğiniz kelime palindrom değildir.");
        }
    }
}