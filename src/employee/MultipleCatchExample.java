package employee;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
            int result = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("Some other exception occurred: " + e);
        }
    }
}
/*
Single try with multiple catch: You handle different types of exceptions separately within the same try block.
Multiple try with a single catch: You handle the same type of exception from different operations or sections of code.
 */