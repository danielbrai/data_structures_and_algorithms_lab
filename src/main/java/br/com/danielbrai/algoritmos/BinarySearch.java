package br.com.danielbrai.algoritmos;

import java.util.Objects;

public class BinarySearch {

    public Integer execute(int[] arr, int elemento) {

        if (Objects.isNull(arr) || arr.length == 0) {
            return null;
        }

        int start = 0;
        int end = arr.length;
        int index = (end - start) / 2;

        do {

            if (arr[index] == elemento) {
                return index;
            }

            if (arr[index] < elemento) {
                start = index + 1;
                index = start + ((end - start) / 2);
            } else {
                end = index - 1;
                index = (end - start) / 2;
            }

        } while (end >= 0);

        return null;
    }
}
