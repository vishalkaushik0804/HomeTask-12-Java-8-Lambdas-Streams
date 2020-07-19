package epamtask10.SubTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alist {

    Scanner sc = new Scanner(System.in);

    void takeInput() {
        System.out.println("Enter the size of the list");
        int size = sc.nextInt();
        List<String> wordarray = new ArrayList<>();
        System.out.println("Enter the words");
        for (int i = 0; i < size; i++) {
            wordarray.add(sc.next());
        }
        compute(wordarray);
    }

    static void compute(List<String> wordarray) {
        List<String> resultarray = new ArrayList<>();

        wordarray.forEach(item -> {
            if (item.charAt(0) == 'a' && item.length() == 3) {
                resultarray.add(item);
            }
        });

        resultarray.forEach(i -> System.out.println(i));
    }
}
