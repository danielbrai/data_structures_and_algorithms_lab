package br.com.danielbrai.algorithms.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class BubbleSortTest {

    @InjectMocks
    private BubbleSort bubbleSort;

    @Test
    public void shouldThrowAnExceptionIfArrayIsNull() {
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            this.bubbleSort.execute(null);
        });

        assertEquals("Input array cannot be null", exception.getMessage());
    }

    @Test
    public void shouldThrowAnExceptionIfArrayIsEmpty() {
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            this.bubbleSort.execute(new int[]{});
        });

        assertEquals("Input array cannot be empty", exception.getMessage());
    }

    @Test
//    @Disabled
    public void shouldSortAnUnorderedArray() throws Exception {
        int[] arr = {5, 3, 7, 9, 8, 1};

        int[] result = this.bubbleSort.execute(arr);

        assertArrayEquals(result, new int[]{1, 3, 5, 7, 8, 9});
    }

    @Test
//    @Disabled
    public void shouldSortAnUnorderedArrayEvenIfItContainsEqualsElements() throws Exception {
        int[] arr = {5, 3, 9, 7, 9, 8, 1, 1, 3};

        int[] result = this.bubbleSort.execute(arr);

        assertArrayEquals(result, new int[]{1, 1, 3, 3, 5, 7, 8, 9, 9});
    }

    @Test
//    @Disabled
    public void shouldSortAnArrayWithOnlyOneElement() throws Exception {
        int[] arr = {1};

        int[] result = this.bubbleSort.execute(arr);

        assertArrayEquals(result, new int[]{1});
    }

    @Test
//    @Disabled
    public void shouldReturnTheArrayIfItsAlreadyOrdered() throws Exception {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int[] result = this.bubbleSort.execute(arr);

        assertArrayEquals(result, new int[]{1, 2, 3, 4, 5, 6});
    }

    @Test
    public void shouldReturnTheArrayIfAllElementsAreEquals() throws Exception {
        int[] arr = {1, 1, 1, 1, 1};

        int[] result = this.bubbleSort.execute(arr);

        assertArrayEquals(result, new int[]{1, 1, 1, 1, 1});
    }
}