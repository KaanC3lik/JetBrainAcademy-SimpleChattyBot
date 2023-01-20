import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int divider = scanner.nextInt();
        int counter = 0;
        for (int i = start; i <= end; i++) {
            if (i % divider == 0) {
                counter++; 
            }
        }
        System.out.println(counter);
    }
}
