import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        List<BigInteger> fibonacci = generateFibonacci(n);

        BigInteger sum = calculateSum(fibonacci);

        return sum.multiply(BigInteger.valueOf(4));
    }

    private static List<BigInteger> generateFibonacci(BigInteger limit) {
        if(limit.compareTo(BigInteger.ZERO) == 0) {
            return Collections.emptyList();
        }
        if(limit.compareTo(BigInteger.ONE) == 0) {
            return Arrays.asList(BigInteger.ONE);
        }
        if(limit.compareTo(BigInteger.valueOf(2)) == 0) {
            return Arrays.asList(BigInteger.ONE, BigInteger.ONE);
        }

        List<BigInteger> fibonacci = new ArrayList<>();

        BigInteger previous = BigInteger.ONE;
        BigInteger previousTwo = BigInteger.ONE;

        fibonacci.add(previous);
        fibonacci.add(previousTwo);

        for(BigInteger i = BigInteger.valueOf(2); i.compareTo(limit.add(BigInteger.ONE)) < 0; i = i.add(BigInteger.ONE)) {
            BigInteger current = previous.add(previousTwo);

            fibonacci.add(current);

            previous = previousTwo;
            previousTwo = current;
        }

        return fibonacci;
    }

    private static BigInteger calculateSum(List<BigInteger> integers) {
        BigInteger sum = BigInteger.ZERO;
        for(BigInteger f : integers) {
            sum = sum.add(f);
        }
        return sum;
    }
}