import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class AreSameTest {

    @Test
    public void shouldPassIfSecondArrayContainSquareValuesOfFirstArray() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11, 10000};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361, 100000000};

        boolean arraysAreSame = AreSame.comp(a, b);

        assertTrue(arraysAreSame);
    }

    @Test
    public void shouldFailIfSecondArrayNotContainSquareValuesOfFirstArray() {
        int[] firstArray = new int[]{11, 4, 9};
        int[] secondArray = new int[]{16, 81, 120};

        boolean arraysAreNotSame = AreSame.comp(firstArray, secondArray);

        assertFalse(arraysAreNotSame);
    }

    @Test
    public void shouldFailIfSecondArrayNotContainExactSquareValuesOfFirstArray() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 20736};

        boolean arraysAreNotSame = AreSame.comp(a, b);

        assertFalse(arraysAreNotSame);
    }

    @Test
    public void shouldFailIfSecondArrayNotContainTheSameNumberOfValuesAsFirstArray() {
        int[] firstArray = new int[]{1, 4, 11};
        int[] secondArray = new int[]{1, 16, 121, 16};

        boolean arraysAreNotSame = AreSame.comp(firstArray, secondArray);

        assertFalse(arraysAreNotSame);
    }

    @Test
    public void shouldFailIfOneOfArraysIsNull() {
        int[] firstArray = null;
        int[] secondArray = new int[]{11, 121, 4};

        boolean arraysAreNotSame = AreSame.comp(firstArray, secondArray);

        assertFalse(arraysAreNotSame);


        firstArray = new int[]{11, 121, 4};
        secondArray = null;

        arraysAreNotSame = AreSame.comp(firstArray, secondArray);

        assertFalse(arraysAreNotSame);
    }

    @Test
    public void shouldPassIfBothArraysAreEmpty() {
        int[] firstArray = new int[]{};
        int[] secondArray = new int[]{};

        boolean arraysAreSame = AreSame.comp(firstArray, secondArray);

        assertTrue(arraysAreSame);
    }
}
