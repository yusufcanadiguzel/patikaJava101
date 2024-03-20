import java.util.Scanner;

public class BasicCalculator {

    static void calculate(){
        int number1, number2, select;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("İlk sayıyı giriniz: ");
            number1 = scanner.nextInt();

            System.out.print("\nİkinci sayıyı giriniz: ");
            number2 = scanner.nextInt();
            System.out.println();

            System.out.println("1 - Toplama");
            System.out.println("2 - Çıkarma");
            System.out.println("3 - Bölme");
            System.out.println("4 - Çarpma");
            System.out.println("5 - Üslü sayı hesaplama");
            System.out.println("6 - Faktoriyel hesaplama");
            System.out.println("7 - Mod Alma");
            System.out.println("8 - Dikdörtgen alan ve çevre hesabı");
            System.out.println("9 - Çıkış yap");
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            select = scanner.nextInt();
            System.out.println();

            switch (select){
                case 1:
                    System.out.println("Sonuç: " + add(number1, number2));
                    break;
                case 2:
                    System.out.println("Sonuç: " + subtract(number1, number2));
                    break;
                case 3:
                    System.out.println("Sonuç: " + divide(number1, number2));
                    break;
                case 4:
                    System.out.println("Sonuç: " + multiply(number1, number2));
                    break;
                case 5:
                    System.out.println("Sonuç: " + pow(number1, number2));
                    break;
                case 6:
                    System.out.println("Sonuç: " + (number1));
                    break;
                case 7:
                    System.out.println("Sonuç: " + mod(number1, number2));
                    break;
                case 8:
                    rectangle(number1, number2);
                    break;
                case 9:
                    exit();
                    break;
            }
        }while (select != 9);
    }

    static double add(double number1, double number2) {
        return number1 + number2;
    }

    static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    static double divide(double number1, double number2) {
        return number1 / number2;
    }

    static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    static double pow(double number1, double number2) {
        if (number2 == 1) return number1;
        if (number2 == 0) return 1;

        double total = 0;
        for (int i = 1; i <= number2; i++) {
            total += number1 * number1;
        }

        return total;
    }

    static int factorial(int number){
        if(number == 1) return 1;

        return factorial(number - 1) * number;
    }

    static double mod(double number1, double number2) {
        return number1 % number2;
    }

    static void rectangle(double number1, double number2){
        double field, environment;

        field = add(multiply(number1, 2), multiply(number2, 2));
        environment = multiply(number1, number2);

        System.out.println("Alan: " + field);
        System.out.println("Çevre: " + environment);
    }

    static void exit(){
        System.out.println("Program sonlandırıldı");
    }
}
