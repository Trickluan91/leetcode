import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class SumArrays {
    public int sum(int[][] arr){
        int result = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                result += anInt;
            }
        }
        return result;
    }

    public int sumParallel(int[][] arr){
        AtomicInteger result = new AtomicInteger(0);
        Semaphore semaphore = new Semaphore(2);
        try (ExecutorService pool = Executors.newFixedThreadPool(arr.length)) {
            for (int[] ints : arr) {
                pool.execute(() -> {
                    try {
                        semaphore.acquire();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    int sum = 0;
                    for (int anInt : ints) {
                        sum += anInt;
                    }
                    result.addAndGet(sum);

                    semaphore.release();
                });
            }
        }
        return result.intValue();
    }
}
