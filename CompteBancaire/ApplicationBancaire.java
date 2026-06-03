import java.util.Scanner;

public class ApplicationBancaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Consultation Solde Bancaire ===");

        System.out.print("Entrez le nom du titulaire : ");
        String titulaire = scanner.nextLine();

        System.out.print("Entrez le numéro de compte : ");
        String numeroCompte = scanner.nextLine();

        System.out.print("Entrez le solde actuel (en €) : ");
        double solde = Double.parseDouble(scanner.nextLine());

        System.out.print("Entrez le numéro de téléphone : ");
        String telephone = scanner.nextLine();

        System.out.print("Entrez l'adresse : ");
        String adresse = scanner.nextLine();

        System.out.print("Entrez l'email : ");
        String email = scanner.nextLine();

        System.out.print("Entrez le nom de la banque : ");
        String nomBanque = scanner.nextLine();

        // Création d’un objet (classe CompteBancaire)
        CompteBancaire compte = new CompteBancaire(titulaire, numeroCompte, solde, telephone, adresse, email, nomBanque );

        // Affichage
        System.out.println();
        compte.afficherSolde();

        scanner.close();
    }
}