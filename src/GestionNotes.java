import java.util.Scanner;
public class GestionNotes {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        //entete du relevé de notes
        System.out.println("RELEVE DE NOTES");
        System.out.println("L2");
        //demande des informations à l'utilisateur
        System.out.print("Entrrez vote nom: ");
        String nom = clavier.nextLine();
        System.out.print("Entrez la note de mathématiques: ");
        double noteMath = clavier.nextDouble();
        System.out.print("Entrez la note de physique: ");
        double notePhys = clavier.nextDouble();
        System.out.print("Entrez la note de informatique: ");
        //calcul de la moyenne des notes
        double noteInfo = clavier.nextDouble();
        double moyenne = (noteMath + notePhys + noteInfo) / 3.0;
        //affichage du relevé de notes
        System.out.println("========================================");
        System.out.println("          RELEVÉ DE NOTES               ");
        System.out.println("========================================");
        System.out.println("Étudiant : " + nom);
        System.out.println("----------------------------------------");
        System.out.println("Maths    : " + noteMath + " / 20");
        System.out.println("Physique : " + notePhys + " / 20");
        System.out.println("Info     : " + noteInfo + " / 20");
        System.out.println("----------------------------------------");
        System.out.printf("Moyenne  :%.2f / 20\n", moyenne);
        System.out.println("========================================");
        clavier.close();
    }
}
