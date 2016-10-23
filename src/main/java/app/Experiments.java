package app;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Experiments {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n > 0) {
            int l = sc.nextInt();
            int[] arr = new int[l];
            int i = 0;
            while (i < l) {
                arr[i] = sc.nextInt();
                i++;
            }

            int k = sc.nextInt();
            System.out.println(maximize(arr,k));
        }
    }

    public static int maximize(int[] arr, int k) {
        for (int i = 0; i < k; i++) {

            int value = IntStream.of(arr).min().getAsInt();

            if ( value >= 0 ) break;

            int index = indexOf(arr, value);
            arr[index] = -arr[index];
        }

        return IntStream.of(arr).sum();
    }

    public static int indexOf(int arr[], int value) {
        int index = -1;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }

        return index;
    }
}
