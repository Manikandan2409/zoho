package advanced;

import java.util.*;
/**
 * InnerSortDiff
 */

/*
 * Create a Java program that generates a random sequence of numbers and sorts them using Bubble Sort,
 * Selection Sort, Insertion Sort, and Quick Sort algorithms. Compare their performance for large list sets.
 */

public class Exercise2 {
    public static void main(String[] args) {
        final int SIZE = 50000; // Adjust the size for performance testing
        ArrayList<Integer> originalList = new ArrayList<>(SIZE);
    
        Random random = new Random();

        // Generate random numbers
        for (int i = 0; i < SIZE; i++) {
            originalList.add(random.nextInt(SIZE));
        }

        // Bubble Sort
        ArrayList<Integer> listToSort = new ArrayList<>(originalList);
        
        long startTime = System.currentTimeMillis();
        bubbleSort(listToSort);
        long endTime = System.currentTimeMillis();
        System.out.println("Bubble Sort took: " + (endTime - startTime) + " ms");

        // Selection Sort
        listToSort = new ArrayList<>(originalList);
        startTime = System.currentTimeMillis();
        selectionSort(listToSort);
        endTime = System.currentTimeMillis();
        System.out.println("Selection Sort took: " + (endTime - startTime) + " ms");

        // Insertion Sort
        listToSort = new ArrayList<>(originalList);
        startTime = System.currentTimeMillis();
        insertionSort(listToSort);
        endTime = System.currentTimeMillis();
        System.out.println("Insertion Sort took: " + (endTime - startTime) + " ms");

        // Quick Sort
        listToSort = new ArrayList<>(originalList);
        startTime = System.currentTimeMillis();
        quickSort(listToSort, 0, listToSort.size() - 1);
        endTime = System.currentTimeMillis();
        System.out.println("Quick Sort took: " + (endTime - startTime) + " ms");
    }

    public static void bubbleSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr.get(j) > arr.get(j + 1)) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
    }

    public static void selectionSort(ArrayList<Integer> arr) {
        int n = arr.size();

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (arr.get(j) < arr.get(minIdx))
                    minIdx = j;

            int temp = arr.get(minIdx);
            arr.set(minIdx, arr.get(i));
            arr.set(i, temp);
        }
    }

    public static void insertionSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 1; i < n; ++i) {
            int key = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1, key);
        }
    }

    public static void quickSort(ArrayList<Integer> arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(ArrayList<Integer> arr, int begin, int end) {
        int pivot = arr.get(end);
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr.get(j) <= pivot) {
                i++;

                int swapTemp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, swapTemp);
            }
        }

        int swapTemp = arr.get(i + 1);
        arr.set(i + 1, arr.get(end));
        arr.set(end, swapTemp);

        return i + 1;
    }
}
