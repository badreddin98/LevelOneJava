import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    static void main() {
        List<String> stringList = new ArrayList<>();
        //stringList.add(10);

        List list = new ArrayList<>();// This defaults to the Unbounded Wildcard
        list.add("Hello");
        list.add(true);
        list.add(10); // This way of using lists when coding is a very bad practice



        Calculator<Integer> integerCalculator = new Calculator<>(0, Integer::sum);

        integerCalculator.add();
    }
}
