
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // Le Scanner permet de lire ce que l'utilisateur tape au clavier
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULATRICE : SOMME DE 2 ENTIERS ===");

        // 1. Demande et récupération du premier nombre
        System.out.print("Entrez le premier nombre entier : ");
        int nombre1 = scanner.nextInt();

        // 2. Demande et récupération du deuxième nombre
        System.out.print("Entrez le deuxième nombre entier : ");
        int nombre2 = scanner.nextInt();

        // 3. Calcul de la somme
        int somme = nombre1 + nombre2;

        // 4. Affichage du résultat
        System.out.println("\n-----------------------------------------");
        System.out.println("Le résultat de l'addition est : " + nombre1 + " + " + nombre2 + " = " + somme);
        System.out.println("-----------------------------------------");

        // Bonne pratique : on ferme le scanner pour libérer les ressources système
        scanner.close();
    }
}
