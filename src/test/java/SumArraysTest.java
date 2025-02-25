import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.random.RandomGenerator;

class SumArraysTest {

    int[][] ints = new int[12][50000000];
    int actual = 0;

    {
        RandomGenerator rg = RandomGenerator.getDefault();
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                int rand = rg.nextInt();
                ints[i][j] = rand;
                actual += rand;
            }
        }
    }

    @Test
    void sum() {
        long before = System.currentTimeMillis();
        int result = new SumArrays().sum(ints);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
        Assertions.assertEquals(actual, result);
    }

    @Test
    void sumParallel() {

        long before = System.currentTimeMillis();
        int result = new SumArrays().sumParallel(ints);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
        Assertions.assertEquals(actual, result);
    }
}