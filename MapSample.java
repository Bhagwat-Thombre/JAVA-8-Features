import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapSample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        // Stream<Integer> data = nums.stream();
        // Stream<Integer> mappedData = data.map(n -> n * 2);
        // mappedData.forEach(n -> System.out.print(n + " "));

        Stream<Integer> data = nums.stream().map(n -> n * n);
        data.forEach(n -> System.out.println(n));
    }
}
