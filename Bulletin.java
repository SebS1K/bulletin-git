public class Bulletin {
    public static void main(String[] args){
        String etudiant = "Étudiant démonstration";
        int note1 = 70;
        int note2 = 100;
        int note3 = 70;
	int total = note1 + note2 + note3;
	int bonus = 5;
        int moyenne = total / 3 + bonus;
        System.out.println("Étudiant: " + etudiant);
	System.out.println("Total: " + total);
        System.out.println("Moyenne : " + moyenne);
    }
}
