import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] words = {"banana", "apple", "cherry"};
        sort(words);
        System.out.println(Arrays.toString(words));

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(5);
        ints.add(2);
        ints.add(9);
        sortIntegers(ints);
        System.out.println(ints);

        ArrayList<String> strs = new ArrayList<>();
        strs.add("banana");
        strs.add("apple");
        strs.add("cherry");
        sortStrings(strs);
        System.out.println(strs);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}