public class Adam {


    public static void main(String[] args){

        double[] data = {1,2,3,4,5,6,7,8,9,10};
        double[] data1 = {1,2,3,4,5,6,7,8,9,10};
        double[] data2 = {1,2,3,4,5,6,7,8,9,10};
//        double[] data1 = {10,234,6422,64567,70000,241353, 6, 632444,777777,888888};
//        double[] data2 = {12335,232,2456,24,1,674,2,6,32355,3};

        Repeat repeat = new Repeat();
        ArrayMax am = new ArrayMax();

        System.out.println("Find the max in an array\n");
        long start = System.nanoTime();
        am.arrayMax(data);
        System.out.println("To find the max of data: " + (System.nanoTime() - start) + " nanoseconds");

        start = System.nanoTime();
        am.arrayMax(data1);
        System.out.println("To find the max of data1: " + (System.nanoTime() - start) + " nanoseconds");

        start = System.nanoTime();
        am.arrayMax(data2);
        System.out.println("To find the max of data2: " + (System.nanoTime() - start) + " nanoseconds");


        System.out.println("\n\n");

        start = System.nanoTime();
        repeat.repeat1('d', 10);
        System.out.println("To repeat 'd' 10 times: " + (System.nanoTime() - start) + " nanoseconds");

        start = System.nanoTime();
        repeat.repeat1('d', 100);
        System.out.println("To repeat 'd' 100 times: " + (System.nanoTime() - start) + " nanoseconds");

        start = System.nanoTime();
        repeat.repeat1('d', 500);
        System.out.println("To repeat 'd' 500 times: " + (System.nanoTime() - start) + " nanoseconds");

        start = System.nanoTime();
        repeat.repeat1('d', 1000);
        System.out.println("To repeat 'd' 1000 times: " + (System.nanoTime() - start) + " nanoseconds");
    }

}
