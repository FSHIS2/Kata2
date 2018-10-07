package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer[] data = {1,2,4,5,5,9,6,3,4,5,1,2,8,7,5};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        for(Integer key : histogr.keySet()){
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
    
}
