package programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,1,13,4,6,2,4,12,20);
        //printAllNumbersInListFunctional(numbers);
        printEvenNumbersInListFunctional(numbers);
    }

    /*private static void print(int number) {
        System.out.println(number);
    }*/

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .forEach(System.out::println); //method reference

        //.forEach(FP01Functional::print);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(FP01Functional::isEven) //filter: only allow even numbers
                .forEach(System.out::println); //method reference
    }
}
