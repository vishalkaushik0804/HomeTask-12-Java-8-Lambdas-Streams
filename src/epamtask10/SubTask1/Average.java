package epamtask10.SubTask1;

import java.util.Scanner;

public class Average {

    Scanner sc = new Scanner(System.in);

    public void takeInput() {
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int average = sum / n;
        System.out.println("Average of elements: " + average);
    }
}
