public class RecursiveDesign {
    static void recursiveDesign(int number, int target, boolean increment) {
        System.out.print(number + " ");

        if(number > 0 && !increment)
            recursiveDesign(number -5, target, false);
        else
        if (number < target)
            recursiveDesign(number + 5, target, true);
        else if (number == target)
            return;
    }
}
