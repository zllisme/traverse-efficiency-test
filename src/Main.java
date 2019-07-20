public class Main {

    public static void main(String[] args){
        MapEfficiency efficiency = new MapEfficiency();
        efficiency.prepareData();
        System.out.println("----------------map test---------------");
        System.out.println("for loop spend time: " + efficiency.getForLoopTime());
        System.out.println("stream spend time: " + efficiency.getStreamTime());
        ReduceEfficiency reduceEfficiency = new ReduceEfficiency();
        reduceEfficiency.initData();
        System.out.println("----------------reduce test------------");
        System.out.println("for loop spend time: " + reduceEfficiency.getForLoopTime());
        System.out.println("stream spend time: " + reduceEfficiency.getStreamTime());



    }

}
