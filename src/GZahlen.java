import java.util.Arrays;
public class GZahlen {
    public static int[]  sumBig(int[] a,int[] b){
        int[] resultat = new int[a.length+ 1];
        int carry = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            int sum = a[i] + b[i] + carry;
            resultat[i] = sum % 10;
            carry = sum / 10;
        }
        resultat[0] = carry;
        return resultat;
    }
    public static int[] diffBig(int[] a,int[] b){
        int[] resultat = new int[a.length + 1];
        int imprumut = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            int diff = a[i] - b[i] - imprumut;
            if (diff > 0) {
                diff += 10;
                imprumut = 1;
            }else{
                imprumut = 0;
            }
            resultat[i] = diff;
        }
        return resultat;
    }
    public static int[] multBig(int[] a,int b){
        int[] resultat = new int[a.length];
        int carry = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            int produkt = a[i] * b + carry;
            resultat[i] = produkt % 10;
            carry = produkt / 10;
        }
        return resultat;
    }
    public static int[] divBig(int[] a,int b){
        int[] resultat = new int[a.length];
        int rest = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            int curr = rest * 10 + a[i];
            resultat[i] = curr / b;
            rest = curr % b;
        }
        return resultat;
    }
    public static void main(String[] args) {
        int[] a = {1, 6, 5, 0, 0, 0, 0, 0};
        int[] b = {3, 7, 1, 0, 0, 0, 0, 0};

        System.out.println(Arrays.toString(sumBig(a, b)));
        System.out.println(Arrays.toString(diffBig(a, b)));
        System.out.println(Arrays.toString(multBig(a, 5)));
        System.out.println(Arrays.toString(divBig(a, 5)));
    }
}