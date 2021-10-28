import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {
        List<Double> dList = new ArrayList<>();
        dList.add(3.14);
        dList.add(2.71);
        dList.add(3.14);
        dList.add(3.14);
        dList.add(2.71);
        System.out.println(dList);
    }
}
