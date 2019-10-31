public class ArrayMax {

    public static double arrayMax(double[] data){
        int n = data.length;
        double currentMax = data[0];
        for(int j = 1; j < n; j++){
            if(data[j] > currentMax){
                currentMax = data[j];
            }
        }
        return currentMax;
    }

}
