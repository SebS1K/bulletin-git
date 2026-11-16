public class Bulletin {
    private static final int BONUS = 5;
	private static final int NB_NOTES = 3;

	public static void main(String[] args){
        String etudiant = "Étudiant démonstration";
        int note1 = 70;
        int note2 = 100;
        int note3 = 70;
	int total = note1 + note2 + note3;
	int bonus = BONUS;
        int moyenne = total / NB_NOTES + bonus;
        System.out.println("Étudiant: " + etudiant);
	System.out.println("Notes : " + note1 + ", " + note2 + ", " + note3);
	System.out.println("Total: " + total);
        System.out.println("Moyenne : " + moyenne);
	System.out.println("----------");
	String etudiant2 = "Étudiante assidue";
	int note4 = 90;
	int note5 = 80;
	int note6 = 85;
	int total2 = note4 + note5 + note6;
	int moyenne2 = total2 / 3 + 5;
	System.out.println("Étudiant : " + etudiant2);
	System.out.println("Notes : " + note4 + ", " + note5 + ", " + note6);
	System.out.println("Total : " + total2);
	System.out.println("Moyenne : " + moyenne2);
    }
}
