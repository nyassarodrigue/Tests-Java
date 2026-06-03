public class CarteCredit extends MethodePaiement {
    private String numeroCarte;

    public CarteCredit(double solde, String numeroCarte) {
        super(solde);
        this.numeroCarte = numeroCarte;
    }

    @Override
    public boolean traiterPaiement(double montant) {
        System.out.println("Connexion au réseau bancaire pour la carte " + numeroCarte + "...");
        if (soldeDisponible >= montant) {
            soldeDisponible -= montant;
            return true;
        }
        return false;
    }
}
