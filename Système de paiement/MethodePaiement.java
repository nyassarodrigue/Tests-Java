public abstract class MethodePaiement {
    protected double soldeDisponible;

    public MethodePaiement(double solde) {
        //TODO Auto-generated constructor stub
    }

    public void Methodepaiement(double soldeDisponible) {
        this.soldeDisponible = soldeDisponible;
    }

    // Méthode abstraite : Chaque moyen de paiement doit définir sa propre logique technique
    public abstract boolean traiterPaiement(double montant);

    // Méthode concrète commune : Génération d'un reçu universel
    public void afficherRecu(double montant, boolean succes) {
        System.out.println("\n===== REÇU DE TRANSACTION =====");
        if (succes) {
            System.out.println("Statut : SUCCÈS");
            System.out.println("Montant débité : " + montant + " FCFA");
            System.out.println("Reste sur le compte : " + soldeDisponible + " FCFA");
        } else {
            System.out.println("Statut : ÉCHEC (Fonds insuffisants ou sécurité rejetée)");
        }
        System.out.println("===============================");
    }
}
