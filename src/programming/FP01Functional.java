package programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        printAllNumbersInListFunctional(List.of(12,1,13,4,6,2,4,12,20));
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .forEach(FP01Functional::print); //method reference
    }
}
