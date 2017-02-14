import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        List<Integer> values = createListFromArray(firstArray);
        values = createListOfSquaresFromList(values);
        Collections.sort(values, Integer::compareTo);

        List<Integer> squares = createListFromArray(secondArray);
        Collections.sort(squares, Integer::compareTo);

        return isSecondCollectionPowerOfFirstCollection(values, squares);
    }

    private static boolean areArraysDifferentLength(int[] firstArray, int[] secondArray) {
        return firstArray.length != secondArray.length;
    }

    private static List<Integer> createListFromArray(int[] array) {
        List<Integer> list = new ArrayList<>(array.length);
        for(Integer value : array) {
            list.add(value);
        }
        return list;
    }

    private static List<Integer> createListOfSquaresFromList(List<Integer> values) {
        List<Integer> squares = new ArrayList<>(values.size());
        for(Integer value : values) {
            squares.add(value * value);
        }
        return squares;
    }

    private static boolean isSecondCollectionPowerOfFirstCollection(List<Integer> firstCollection, List<Integer> secondCollection) {
        boolean areSame = true;
        for (int i = 0; i < firstCollection.size(); i++) {
            areSame = areSame && areValuesTheSame(firstCollection.get(i), secondCollection.get(i));
        }
        return areSame;
    }

    private static boolean areValuesTheSame(int valueOne, int valueTwo) {
        return valueOne == valueTwo;
    }
}
