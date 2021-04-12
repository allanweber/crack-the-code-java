import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class FindTheNumber {

    public static void main(String[] args) {
        System.out.println(findNumber(Arrays.asList(5,1,2,3,4,5,1),1));
        System.out.println(findNumber(Arrays.asList(2,3,1),5));
    }

    public static String findNumber(List<Integer> arr, int k) {
        return Optional.ofNullable(arr)
                .orElse(Collections.emptyList())
                .stream()
                .filter(n -> n == k)
                .findAny()
                .map(__-> "YES")
                .orElse("NO");
    }
}
