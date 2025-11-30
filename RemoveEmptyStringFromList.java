import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RemoveEmptyStringFromList {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Bhagwat", "", "Thombre", "", "Ramdas", "", "Gitanjali", "Mauli", "Shital");

        Stream<String> data = str.stream().filter(s -> !s.isEmpty());
        data.forEach(s -> System.out.print(s + " "));
    }
}
