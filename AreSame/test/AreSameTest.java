import static org.junit.Assert.*;
        import org.junit.Test;


public class AreSameTest {

    @Test
    public void shouldSecondArrayContainSquareValuesOfFirstArray() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};

        boolean arraysAreSame = AreSame.comp(a, b);

        assertTrue(arraysAreSame);
    }

    @Test
    public void shouldSecondArrayNotContainSquareValuesOfFirstArray() {
        int[] firstArray = new int[]{11, 4, 9};
        int[] secondArray = new int[]{16, 81, 120};

        boolean arraysAreNotSame = AreSame.comp(firstArray, secondArray);

        assertFalse(arraysAreNotSame);
    }
}
