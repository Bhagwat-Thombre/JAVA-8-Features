import java.util.Arrays;
import java.util.List;

public class FindEvenElementsFromList {
    public static void main(String[] args) {
        System.out.println("Even Numbers from the List are :");
        List<Integer> nums = Arrays.asList(10, 11, 12, 15, 17, 19, 20, 18, 25);
        nums.stream().filter(n -> n % 2 == 0).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
