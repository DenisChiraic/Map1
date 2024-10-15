import java.util.Arrays;
public class Auf4 {
    public static int getChKeyboard(int[] keyboards) {
        return Arrays.stream(keyboards).min().getAsInt();
    }
    public static int getMostExp(int[] keyboards, int[] usbs) {
        return Math.max(Arrays.stream(keyboards).max().orElse(0), Arrays.stream(usbs).max().orElse(0));
    }
    public static int getExpUsb(int[] usbs, int buget) {
        return Arrays.stream(usbs).filter(price -> price <= buget).max().orElse(-1);
    }
    public static int getMaxGeldbetrag(int[] keyboards, int[] usbs, int buget) {
        int maxSpent = -1;
        for (int keyboard : keyboards) {
            for (int usb : usbs) {
                int total = keyboard + usb;
                if (total > maxSpent && total <= buget) {
                    maxSpent = total;
                }
            }
        }
        return maxSpent;
    }
    public static void main(String[] args) {
        int[] keyboards = {50, 70};
        int[] usbs = {4, 5};
        int buget = 100;

        System.out.println(getMaxGeldbetrag(keyboards, usbs, buget));
        System.out.println(getChKeyboard(keyboards));
        System.out.println(getMostExp(keyboards, usbs));
        System.out.println(getExpUsb(usbs, buget));
    }
}