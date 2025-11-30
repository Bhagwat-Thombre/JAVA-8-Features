
import java.util.Arrays;
import java.util.List;

public class FindOddElementsFromList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 10);
        System.out.println("Odd Numbers from the List are :");
        nums.stream().filter(d -> d % 2 == 1).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
