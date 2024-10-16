import java.util.Arrays;
public class Note{
    public static int[] getFNote(int[] notes {
        int count = 0;
        for (int note : notes){
            if(note < 40){
                count++;
            }
        }
        int[] fNote = new int[count];
        int index = 0;
        for(int note : notes){
            if( note < 40) {
                fNote[index++] = note;
            }
        }
        return fNote;
    }
    public static double getAverage(int[] notes){
        int sum = 0;
        for(int note : notes){
            sum += note;
        }
        return (double)sum / notes.length;
    }
    public static int[] getRound(int[] notes) {
        int[] roundNotes = new int[notes.length];
        for(int i = 0; i< grades.length; i++){
           int note = notes[i];
            if (grade >= 38){
                int fiveMul = ((note / 5) + 1) * 5;
                if (fiveMul - note < 3 {
                    note = fiveMul;
                }
            }
            roundNotes[i] = note;
        }
        return roundNotes;
    }
    public static int getMaxRound(int[] notes){
        int max = 0;
        int[] roundNotes = getRound(notes);
        for (int grade : roundeGrades){
            if(grade > max){
                max = grade;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] grades = {29, 37,38,41,84,67};
        System.out.println("Nicht ausreichende Noten: " + Arrays.toString(getFGrades(grades)));
        System.out.println("Durchschnittswert: " + getAverage(grades));
        System.out.println("Abgerundeten Noten: " + Arrays.toString(getRound(grades)));
        System.out.println("Maximale abgerundete Noten: " + getMaxRound(grades));
    }
}
