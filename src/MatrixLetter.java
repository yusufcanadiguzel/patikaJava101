public class MatrixLetter {
    //Ekrana B harfini yazdıran program.
    static void letterB(){
        String[][] letter = new String[5][3];

        for(int i = 0; i < letter.length; i++){
            for(int j = 0; j < letter[i].length; j++){
                if((i == 1 && j == 1) || (i == 3 && j == 1)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
