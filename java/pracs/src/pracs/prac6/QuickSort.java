package pracs.prac6;

import java.util.Arrays;
import java.util.Comparator;

public class QuickSort {


    public static void quickSort(Student[] array, int low, int high,  Comparator<Student> comp) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (comp.compare(array[i],opora) < 0) {
                i++;
            }

            while (comp.compare(array[i],opora) > 0) {
                j--;
            }

            if (i <= j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j, comp);

        if (high > i)
            quickSort(array, i, high, comp);
    }
}