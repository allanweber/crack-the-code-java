import java.util.ArrayList;
import java.util.List;

public class OddNumbers {

    public static void main(String[] args) {
        System.out.println(oddNumbers(2,5));
        System.out.println(oddNumbers(3,9));
    }

    public static List<Integer> oddNumbers(int l, int r) {
        List<Integer> ood = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (i % 2 != 0) {
                ood.add(i);
            }
        }
        return ood;
    }
}
