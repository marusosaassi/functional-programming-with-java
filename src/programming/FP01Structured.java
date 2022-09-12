package programming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(12,1,13,4,6,2,4,12,20));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number:numbers) {
            System.out.println(number);
        }
    }
}
