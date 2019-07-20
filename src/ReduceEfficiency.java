import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class ReduceEfficiency {
    private int[] data = new int[1000000];

    public void initData() {
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt();
        }
    }

    public long getForLoopTime() {
        Date start = new Date();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++)
            if (data[i] > max)
                max = data[i];
        Date end = new Date();
        return end.getTime() - start.getTime();

    }

    public long getStreamTime() {
        Date start = new Date();
        int max = Arrays.stream(data)
                .reduce(Integer.MIN_VALUE, Math::max);
        Date end = new Date();
        return end.getTime() - start.getTime();

    }


}
