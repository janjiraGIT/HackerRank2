import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxSumTest {

    @Test
    void shouldGetCorrectMinMaxResult() {
        List<Integer> testList = Arrays.asList(1,2,3,4,5);
        var minMaxSum = new MinMaxSum();
        int min = minMaxSum.findMin(testList);
        int max = minMaxSum.findMax(testList);
        assertEquals(10, min);
        assertEquals(14, max);
    }

    @Test
    void shouldGetCorrectResult() {
        List<Integer> testList = Arrays.asList(2,3,14,5,6);

        var minMaxSum = new MinMaxSum();
        testList = minMaxSum.result(testList);
        assertEquals(16, testList.get(0)); // min
        assertEquals(28, testList.get(1)); // max
    }

}