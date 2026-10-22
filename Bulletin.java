public class Bulletin {
    public static void main(String[] args){
        String etudiant = "Étudiant démonstration";
        int note1 = 70;
        int note2 = 100;
        int note3 = 70;
	int bonus = 5;
        int moyenne = (note1 + note2 + note3) / 3 + bonus;
        System.out.println("Étudiant: " + etudiant);
        System.out.println("Moyenne : " + moyenne);
    }
}
