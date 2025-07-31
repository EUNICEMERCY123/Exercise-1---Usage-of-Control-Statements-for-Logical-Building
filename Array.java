import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        int count = 0;
        System.out.print("Numbers that are smaller than " + x + " are: ");
        for (int num : numbers) {
            if (num < x) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println("\nCount = " + count);
        System.out.println("The numbers are: " +n);
        scanner.close();
    }
}

