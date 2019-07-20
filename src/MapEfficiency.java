import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MapEfficiency {
    private List<Demo> demoList = null;
    private List<Integer> forLoopList = null;
    private List<Integer> streamList = null;
    private final static long DATA_SIZE = 1000000;

    public void prepareData() {
        demoList = new ArrayList<>();
        forLoopList = new ArrayList<>();
        streamList = new ArrayList<>();
        String str = "我是谁我在哪我要干啥";
        for (int i = 0; i < DATA_SIZE; i++) {
            demoList.add(new Demo(i, str));
        }
    }

    public long getForLoopTime() {
        Date start = new Date();
        for (int i = 0; i < DATA_SIZE; i++) {
            forLoopList.add(demoList.get(1).getIndex());
        }
        Date end = new Date();
        return end.getTime() - start.getTime();
    }

    public long getStreamTime() {
        Date start = new Date();
        streamList = demoList.stream().map(Demo::getIndex).collect(Collectors.toList());
        Date end = new Date();
        return end.getTime() - start.getTime();
    }

}
