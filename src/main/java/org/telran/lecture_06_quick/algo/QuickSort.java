package org.telran.lecture_06_quick.algo;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        // quickSort(array, start, end): void -> method for sort
        // partition(array, start, end): int indexPivot -> helper method for rearrange array elements form pivot
        // swap(array, first, second): void -> helper method for swapping two elements

        // Best O(n log n)
        // Aver O(n log n)
        // Worst O(n^2)

        int[] array = {39, 22, 2, 55, 6, 20};
        quickSortRecursive(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    public static void quickSortRecursive(int[] array, int start, int end) {
        if (start >= end) { // условие выходы из рекурсии
            return;
        }
        int indexPivot = partition(array, start, end);
        quickSortRecursive(array, start, indexPivot - 1);
        quickSortRecursive(array, indexPivot + 1, end);
    }

    private static int partition(int[] array, int partitionStart, int partitionEnd) {
        int pivot = array[partitionEnd]; //choose pivot element
        int index = partitionStart;

        for (int i = partitionStart; i < partitionEnd; i++) {
            if (array[i] <= pivot) {
                swap(array, i, index);
                index++;
            }
        }
        swap(array, partitionEnd, index);

        return index;
    }

    private static void swap(int[] array, int source, int destination) {
        int temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;
    }
}
