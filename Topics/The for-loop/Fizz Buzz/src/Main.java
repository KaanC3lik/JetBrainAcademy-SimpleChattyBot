import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 >= number2) {
            for (int i = number2; i <= number1; i++) {
                int Fizz = i % 3;
                int Buzz = i % 5;
                if (Buzz == 0 && Fizz == 0) {
                    System.out.println("FizzBuzz");
                }
                else if (Buzz == 0) {
                    System.out.println("Buzz");
                }
                else if (Fizz == 0) {
                    System.out.println("Fizz");
                }
            }
        }
        else {
            for (int i = number1; i <= number2; i++) {
                int Fizz = i % 3;
                int Buzz = i % 5;
                if (Buzz == 0 && Fizz == 0) {
                    System.out.println("FizzBuzz");
                }
                else if (Buzz == 0) {
                    System.out.println("Buzz");
                }
                else if (Fizz == 0) {
                    System.out.println("Fizz");
                }
                else {
                    System.out.println(i);
                }
            }
        }
    }
}
