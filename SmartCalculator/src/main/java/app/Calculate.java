package app;

public class Calculate {


    public int calc(int... numbers){
        int sum = 0;
        for(int n : numbers){
            sum += n;
        } return sum;
    }

    public double calc(double... numbers){
        double sum = 0;
        for(double n : numbers){
            sum += n;
        }return sum;
    }


}
