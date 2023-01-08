package br.com.danielbrai.algoritmos;

import java.util.Arrays;
import java.util.Objects;

public class BinarySearch {

    public Integer execute(int[] arr, int elemento) {

        if (Objects.isNull(arr) || arr.length == 0) {
            return null;
        }

        do {

            int index = arr.length / 2;

            if (arr[index] == elemento) {
                return index;
            }

            if (arr[index] > elemento) {
                arr = Arrays.copyOfRange(arr, 0, arr.length - 1);
            } else {
                arr = Arrays.copyOfRange(arr, 0, arr.length + 1);
            }

        } while (arr.length > 0);

        return null;
    }
}
