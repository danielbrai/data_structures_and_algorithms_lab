package br.com.danielbrai.algorithms.sort;

import java.util.Objects;

public class SelectionSort {

    public int[] execute(int[] arr) throws Exception {

        if (Objects.isNull(arr)) {
            throw new Exception("Input array cannot be null");
        }

        if (arr.length == 0) {
            throw new Exception("Input array cannot be empty");
        }

        for (int i = 0; i < arr.length - 1; i++) {

            int indexFromMinimumElement = i;

            for (int k = i + 1; k < arr.length; k++) {

                if (arr[k] < arr[indexFromMinimumElement]) {
                    indexFromMinimumElement = k;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[indexFromMinimumElement];
            arr[indexFromMinimumElement] = tmp;
        }

        return arr;
    }
}
