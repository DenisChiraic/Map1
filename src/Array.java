import java.sql.SQLOutput;
import java.util.Arrays;
public class Array {
    public static  int getMax(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }
    public static  int getMin(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }
    public static int getMaxSum(int[] arr) {
        return Arrays.stream(arr).sum() - getMin(arr);
    }
    public static int getMinSum(int[] arr) {
        return Arrays.stream(arr).sum() - getMax(arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(getMax(arr));
        System.out.println(getMin(arr));
        System.out.println(getMaxSum(arr));
        System.out.println(getMinSum(arr));
    }
}