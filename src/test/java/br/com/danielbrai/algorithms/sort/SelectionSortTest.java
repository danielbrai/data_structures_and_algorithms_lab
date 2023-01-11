package br.com.danielbrai.algorithms.sort;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class SelectionSortTest {

    @InjectMocks
    private SelectionSort selectionSort;

    @Test
    void shouldThrowAnExceptionIfArrayIsNull() {

        Exception exception = assertThrows(Exception.class, () -> {
            this.selectionSort.execute(null);
        });

        assertEquals("Input array cannot be null", exception.getMessage());
    }

    @Test
    void shouldThrowAnExceptionIfArrayIsEmpty() {

        Exception exception = assertThrows(Exception.class, () -> {
            this.selectionSort.execute(new int[]{});
        });

        assertEquals("Input array cannot be empty", exception.getMessage());
    }

    @Test
    void shouldSortAnUnorderedArray() throws Exception {

        int[] inputArr = {7, 3, 5, 1, 9, 0};
        int[] expectedResult = {0, 1, 3, 5, 7, 9};

        int[] actualResult = this.selectionSort.execute(inputArr);

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void shouldSortAnUnorderedArrayEvenIfItHasReapetedElements() throws Exception {

        int[] inputArr = {7, 3, 5, 1, 1, 9, 0};
        int[] expectedResult = {0, 1, 1, 3, 5, 7, 9};

        int[] actualResult = this.selectionSort.execute(inputArr);

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldSortAnArrayWithOnlyOneElement() throws Exception {
        int[] arr = {1};

        int[] result = this.selectionSort.execute(arr);

        assertArrayEquals(result, new int[]{1});
    }

    @Test
    public void shouldReturnTheArrayIfItsAlreadyOrdered() throws Exception {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int[] result = this.selectionSort.execute(arr);

        assertArrayEquals(result, new int[]{1, 2, 3, 4, 5, 6});
    }

    @Test
    public void shouldReturnTheArrayIfAllElementsAreEquals() throws Exception {
        int[] arr = {1, 1, 1, 1, 1};

        int[] result = this.selectionSort.execute(arr);

        assertArrayEquals(result, new int[]{1, 1, 1, 1, 1});
    }
}