import java.util.Arrays;
import java.util.List;

public class DisplaySquareOfListElements {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Square of List Elements are :");
        nums.stream().map(n -> n * n).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
