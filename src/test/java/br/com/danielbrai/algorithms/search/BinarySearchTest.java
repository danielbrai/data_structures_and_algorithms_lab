package br.com.danielbrai.algorithms.search;

import br.com.danielbrai.algorithms.search.BinarySearch;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(MockitoExtension.class)
class BinarySearchTest {

    @InjectMocks
    private BinarySearch binarySearch;

    @Test
    void shouldReturnNullIfElementIsntInArray() {
        int[] arr = {3, 4, 5, 6};
        int desiredElement = 1;
        Integer result = this.binarySearch.execute(arr, desiredElement);
        assertNull(result);
    }

    @Test
    void shouldReturnTheIndexWhereElementIsLocatedIfItIsInTheFisrtPositionInArray() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int desiredElement = 1;
        Integer result = this.binarySearch.execute(arr, desiredElement);
        assertEquals(0, result);
    }

    @Test
    void shouldReturnTheIndexWhereElementIsLocatedIfItIsInTheLastPositionInArray() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int desiredElement = 6;
        Integer result = this.binarySearch.execute(arr, desiredElement);
        assertEquals(5, result);
    }

    @Test
    void shouldReturnNullIfArrayIsEmpty() {
        int[] arr = {};
        int desiredElement = 1;
        Integer result = this.binarySearch.execute(arr, desiredElement);
        assertNull(result);
    }

    @Test
    void shouldReturnNullIfArrayIsNull() {
        int[] arr = null;
        int desiredElement = 1;
        Integer result = this.binarySearch.execute(arr, desiredElement);
        assertNull(result);
    }

    @Test
    void shouldReturnTheIndexWhereElementIsLocatedIfItIsInTheLastPositionInArrayEvenInGreatINputs() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        int desiredElement = 17;
        Integer result = this.binarySearch.execute(arr, desiredElement);
        assertEquals(16, result);
    }

    @Test
    void shouldReturnTheIndexWhereElementIsLocatedIfItIsInTheFisrtPositionInArrayEvenInGreatINputs() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        int desiredElement = 1;
        Integer result = this.binarySearch.execute(arr, desiredElement);
        assertEquals(0, result);
    }
}