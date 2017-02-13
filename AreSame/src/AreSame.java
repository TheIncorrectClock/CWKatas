import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {
        if(a == null || b == null) {
            return false;
        }

        if(a.length != b.length) {
            return false;
        }

        List<Integer> values = new ArrayList<>(a.length);
        for(Integer value : a) {
            values.add(value * value);
        }
        Collections.sort(values, Integer::compareTo);

        List<Integer> squares = new ArrayList<>(b.length);
        for(Integer square : b) {
            squares.add(square);
        }
        Collections.sort(squares, Integer::compareTo);

        for(int i = 0; i < values.size(); i++) {
            if(squares.get(i).intValue() != values.get(i).intValue()) {
                return false;
            }
        }
        return true;
    }
}
