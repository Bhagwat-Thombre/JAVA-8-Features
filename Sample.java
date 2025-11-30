import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Sample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(53, 54, 3, 32, 45, 12, 56, 32);

        Stream<Integer> data = nums.stream();
        data.sorted().forEach(n -> System.out.print(n + " "));
    }
}