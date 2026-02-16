package app;

public class SmartCalculator {

    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        System.out.println(calculate.calc(2, 3));           // → 5
        System.out.println(calculate.calc(2, 3, 4));        // → 9
        System.out.println(calculate.calc(2.5, 3.5));       // → 6.0
        System.out.println(calculate.calc(10));             // → 10
        System.out.println(calculate.calc());               // → 0
        System.out.println(calculate.calc(1, 2, 3, 4, 5));  // → 15
    }
}
