package com.example.comparation;

import java.util.Comparator;
import java.util.List;

public class GenericQuickSort {

    public static <T> void quickSort(List<T> list, int low, int high, Comparator<T> comparator) {
        if (low < high) {
            int partitionIndex = partition(list, low, high, comparator);

            quickSort(list, low, partitionIndex - 1, comparator);  // Before partitionIndex
            quickSort(list, partitionIndex + 1, high, comparator); // After partitionIndex
        }
    }

    private static <T> int partition(List<T> list, int low, int high, Comparator<T> comparator) {
        T pivot = list.get(high);
        int i = (low - 1); // index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (comparator.compare(list.get(j), pivot) < 0) {
                i++;

                // swap list[i] and list[j]
                T temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        // swap list[i+1] and list[high] (or pivot)
        T temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);

        return i + 1;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 7, 8, 9, 1, 5);
        Comparator<Integer> integerComparator = Integer::compare;
        quickSort(numbers, 0, numbers.size() - 1, integerComparator);
        System.out.println(numbers);

        List<String> words = List.of("banana", "apple", "cherry", "date");
        Comparator<String> stringComparator = String::compareTo;
        quickSort(words, 0, words.size() - 1, stringComparator);
        System.out.println(words);
    }
}

