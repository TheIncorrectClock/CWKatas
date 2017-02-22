import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class AreSame {

    public static boolean comp(int[] firstArray, int[] secondArray) {
        try {
            return compareArrays(firstArray, secondArray);
        } catch(NullPointerException e) {
            return false;
        }
    }

    private static boolean compareArrays(int[] firstArray, int[] secondArray) {
        if(areArraysDifferentLength(firstArray, secondArray)) {
            return false;
        }

        List<Integer> values = createSortedListFromArray(firstArray);
        values = createListOfSquaresFromList(values);

        List<Integer> squares = createSortedListFromArray(secondArray);

        return areTwoListsTheSame(values, squares);
    }

    private static boolean areArraysDifferentLength(int[] firstArray, int[] secondArray) {
        return firstArray.length != secondArray.length;
    }

    private static List<Integer> createSortedListFromArray(int[] array) {
        return Arrays.stream(array).boxed().sorted().collect(toList());
    }

    private static List<Integer> createListOfSquaresFromList(List<Integer> values) {
        return values.stream().map(i -> i * i).collect(toList());
    }

    private static boolean areTwoListsTheSame(List<Integer> firstCollection, List<Integer> secondCollection) {
        return IntStream.range(1, firstCollection.size())
                        .allMatch(i -> areValuesTheSame(firstCollection.get(i), secondCollection.get(i)));
    }

    private static boolean areValuesTheSame(int valueOne, int valueTwo) {
        return valueOne == valueTwo;
    }
}
