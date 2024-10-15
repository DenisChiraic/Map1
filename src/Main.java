import java.util.ArrayList;

public class Main {

    // 1. Metodă pentru returnarea notelor nesatisfăcătoare (<40)
    public static int[] noteNesatisfacatoare(int[] note) {
        ArrayList<Integer> noteNesatisf = new ArrayList<>();
        for (int n : note) {
            if (n < 40) {
                noteNesatisf.add(n);
            }
        }
        // Convertim lista de rezultate într-un array
        int[] rezultat = new int[noteNesatisf.size()];
        for (int i = 0; i < noteNesatisf.size(); i++) {
            rezultat[i] = noteNesatisf.get(i);
        }
        return rezultat;
    }

    // 2. Metodă pentru calcularea mediei notelor
    public static double calculeazaMedia(int[] note) {
        int suma = 0;
        for (int n : note) {
            suma += n;
        }
        return (double) suma / note.length;
    }

    // 3. Metodă pentru rotunjirea notelor conform regulilor
    public static int[] rotunjesteNote(int[] note) {
        int[] noteRotunjite = new int[note.length];
        for (int i = 0; i < note.length; i++) {
            int nota = note[i];
            if (nota >= 38) {
                int multipluDe5 = ((nota / 5) + 1) * 5;
                if (multipluDe5 - nota < 3) {
                    noteRotunjite[i] = multipluDe5;
                } else {
                    noteRotunjite[i] = nota;
                }
            } else {
                noteRotunjite[i] = nota;
            }
        }
        return noteRotunjite;
    }

    // 4. Metodă pentru a returna nota maximă rotunjită
    public static int notaMaximaRotunjita(int[] note) {
        int[] noteRotunjite = rotunjesteNote(note);
        int maxNota = noteRotunjite[0];
        for (int n : noteRotunjite) {
            if (n > maxNota) {
                maxNota = n;
            }
        }
        return maxNota;
    }

    // Exemplu de rulare
    public static void main(String[] args) {
        int[] note = {24, 39, 21, 41, 84, 67};

        // 1. Note nesatisfăcătoare
        int[] noteNesatisf = noteNesatisfacatoare(note);
        System.out.print("Note nesatisfăcătoare: ");
        for (int n : noteNesatisf) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 2. Media notelor
        System.out.println("Media notelor: " + calculeazaMedia(note));

        // 3. Note rotunjite
        int[] noteRotunjite = rotunjesteNote(note);
        System.out.print("Note rotunjite: ");
        for (int n : noteRotunjite) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 4. Nota maximă rotunjită
        System.out.println("Nota maximă rotunjită: " + notaMaximaRotunjita(note));
    }
}
