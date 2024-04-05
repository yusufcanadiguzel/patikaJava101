import java.util.Scanner;

public class MineSweeper {
    static void play() {
        int mineCount, targetPoint;

        String[][] gameField = createGameField();
        String[][] hiddenGameField = hideGameField(gameField);

        mineCount = (gameField.length * gameField[1].length) / 4;
        targetPoint = (gameField.length * gameField[1].length) - mineCount;

        placeMines(mineCount, gameField);

        takeGuess(gameField, targetPoint, hiddenGameField);

        printGameField(hiddenGameField);
    }

    static void printGameField(String[][] gameField){
        for (int i = 0; i < gameField.length; i++){
            for (int j = 0; j < gameField[1].length; j++){
                System.out.print(" " + gameField[i][j] + " " );
            }
            System.out.println();
        }
    }

    static String[][] createGameField(){
        String[][] gameField;
        String[] values = {"0", "1", "2"};
        int vertical, horizontal;

        vertical = positionChecker("Lütfen satır sayısını giriniz: ");
        horizontal = positionChecker("Lütfen sütun sayısını giriniz: ");

        gameField = new String[vertical][horizontal];

        for (int i = 0; i < gameField.length; i++){
            for (int j = 0; j < gameField[1].length; j++){
                int value = (int)(Math.random() * 3);
                gameField[i][j] = values[value];
            }
        }

        return gameField;
    }

    static String[][] hideGameField(String[][] gameField){
        String[][] hiddenGameField = new String[gameField.length][gameField[1].length];
        for (int i = 0; i < hiddenGameField.length; i++){
            for (int j = 0; j < hiddenGameField[1].length; j++){
                hiddenGameField[i][j] = "-";
            }
        }

        return hiddenGameField;
    }

    static void placeMines(int mineCount, String[][] gameField){
        while (mineCount > 0){
            int tempVertical, tempHorizontal;
            tempVertical = (int) (Math.random() * gameField.length);
            tempHorizontal = (int) (Math.random() * gameField[1].length);

            if (isPlacable(tempVertical, tempHorizontal, gameField)){
                gameField[tempVertical][tempHorizontal] = "*";
                mineCount--;
            }
        }
    }

    static boolean isPlacable(int vertical, int horizontal, String[][] gameField) {
        if (gameField[vertical][horizontal].equals("*"))
            return false;
        else
            return true;
    }

    static void takeGuess(String[][] gameField, int targetPoint, String[][] screenField){
        int row, column;

        do {
            printGameField(screenField);

            row = positionChecker(gameField.length, "Satır numarasını giriniz: ");
            column = positionChecker(gameField[1].length, "Sütun numarasını giriniz: ");

            if(isAvailable(screenField[row][column])){
                if (isOver(gameField[row][column], screenField)){
                    screenField[row][column] = gameField[row][column];
                    printGameField(gameField);
                    return;
                }else {
                    screenField[row][column] = Integer.toString(checkMines(gameField, row, column));
                    targetPoint--;
                }
            }else {
                System.out.println("Bu tahmini gerçekleştirdiniz. Lütfen farklı bir tahmin yapınız.");
            }
        } while (targetPoint > 0);

        System.out.println("Oyunu Kazandınız !");
    }

    static int checkMines(String[][] gameField, int x, int y){
        int counter = 0;
        int ix = (x == 0 ? 0 : x - 1);
        int iLimit = (x == gameField.length - 1 ? x : x + 1);
        int jy = (y == 0 ? 0 : y - 1);
        int jLimit = (y == gameField[1].length - 1 ? y : y + 1);

        for (int i = ix; i <= iLimit; i++){
            for (int j = jy; j <= jLimit; j++){
                if(!(i == x && j == y)){
                    if(gameField[i][j].equals("*")){
                        counter++;
                    }
                }
            }
        }

        return counter;
    }

    static boolean isAvailable(String value){
        return value.equals("-");
    }

    static boolean isOver(String value, String[][] gameField){
        if (value.equals("*")){
            printGameField(gameField);
            System.out.println("Mayın buldunuz. Kaybettiniz.");
            return true;
        }

        return false;
    }

    static int positionChecker(int limit, String text){
        Scanner scanner = new Scanner(System.in);

        int guess;
        boolean result;

        do {
            System.out.print(text);
            guess = scanner.nextInt();

            if (guess < 0 || guess >= limit){
                result = false;
                System.out.println("Hatalı giriş yaptınız.");
            }else{
                result = true;
            }
        } while (!result);

        System.out.println();

        return guess;
    }

    static int positionChecker(String text){
        Scanner scanner = new Scanner(System.in);

        int guess;
        boolean result;

        do {
            System.out.print(text);
            guess = scanner.nextInt();

            if (guess < 2){
                result = false;
                System.out.println("Hatalı giriş yaptınız.");
            }else{
                result = true;
            }
        } while (!result);

        System.out.println();

        return guess;
    }
}
