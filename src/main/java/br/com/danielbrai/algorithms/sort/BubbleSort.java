package br.com.danielbrai.algorithms.sort;

import java.util.Objects;

public class BubbleSort {
    public int[] execute(int[] arr) throws Exception {

        if (Objects.isNull(arr)) {
            throw new Exception("Input array cannot be null");
        }

        if (arr.length == 0) {
            throw new Exception("Input array cannot be empty");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }
}
