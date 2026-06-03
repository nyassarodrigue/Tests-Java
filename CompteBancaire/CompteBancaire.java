public class CompteBancaire {
    // Attributs privés du user final
    private String titulaire;
    private String numeroCompte;
    private double solde;
    private String telephone; // Ajout d'un attribut pour le numéro de téléphone
    private String adresse; // Ajout d'un attribut pour l'adresse
    private String email; // Ajout d'un attribut pour l'email
    private String nomBanque; // Ajout d'un attribut pour le nom de la banque

    // Constructeur
    public CompteBancaire(String titulaire, String numeroCompte, double solde, String telephone, String adresse, String email, String nomBanque) {
        this.titulaire = titulaire;
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
        this.nomBanque = nomBanque;
    }

    // Méthode : afficher le solde
    public void afficherSolde() {
        System.out.println("nom de la banque : " + nomBanque);
        System.out.println("Titulaire : " + titulaire);
        System.out.println("Numéro compte : " + numeroCompte);
        System.out.printf("Solde bancaire : %.2f €%n", solde);
    }

    // (Optionnel) méthode getter si besoin plus tard
    public double getSolde() {
        return solde;
    }
}