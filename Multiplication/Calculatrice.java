import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SUPER GÉNÉRATEUR DE TABLES ===");
        System.out.print("Entrez un nombre entier : ");
        
        // Sécurité : on vérifie que l'utilisateur saisit bien un entier
        while (!scanner.hasNextInt()) {
            System.out.println("[ERREUR] Ce n'est pas un nombre entier valide.");
            System.out.print("Veuillez entrer un nombre entier : ");
            scanner.next(); // efface la mauvaise saisie
        }
        
        int nombreBase = scanner.nextInt();
        System.out.println("\nCalcul des 10 premières tables de multiplication pour le facteur : " + nombreBase);
        System.out.println("========================================================================\n");

        // Première boucle (i) : représente le multiplicateur (de 1 à 10)
        for (int i = 1; i <= 10; i++) {
            
            // Deuxième boucle (table) : génère les 10 tables en parallèle sur la même ligne
            for (int table = 1; table <= 10; table++) {
                
                // Le calcul : (Le multiplicateur de la table) x (Le nombre choisi par le user) x (La ligne actuelle)
                // Exemple pour la table de 3, ligne 5, avec le nombre user 2 : (3 * 2) * 5
                int valeurTable = table * nombreBase;
                int resultat = valeurTable * i;
                
                // %d x %d = %-4d permet d'aligner proprement les colonnes dans la console
                System.out.printf("%d x %d = %-4d\t| ", valeurTable, i, resultat);
            }
            // Une fois qu'on a écrit la ligne pour les 10 tables, on passe à la ligne suivante
            System.out.println();
        }

        System.out.println("\n========================================================================");
        scanner.close();
    }
}