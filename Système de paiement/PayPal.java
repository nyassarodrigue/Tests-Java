public class PayPal extends MethodePaiement implements Securisable {
    private String email;
    private boolean otpVerifie = false;

    public PayPal(double solde, String email) {
        super(solde);
        this.email = email;
    }

    @Override
    public boolean validerDoubleFacteur(String codeOTP) {
        if ("1234".equals(codeOTP)) {
            System.out.println("[PayPal] Authentification OTP réussie pour " + email);
            this.otpVerifie = true;
            return true;
        }
        System.out.println("[PayPal] Échec de l'authentification OTP.");
        return false;
    }

    @Override
    public boolean traiterPaiement(double montant) {
        // 1. Vérification de la sécurité
        if (!otpVerifie) {
            System.out.println("[PayPal] Erreur : Vous devez valider le code OTP avant de payer.");
            return false;
        }
        
        // 2. Consommation du jeton de sécurité (On force la réinitialisation pour le prochain achat)
        this.otpVerifie = false; 

        // 3. Vérification du solde et traitement
        if (soldeDisponible >= montant) {
            soldeDisponible -= montant;
            return true;
        }
        
        System.out.println("[PayPal] Échec : Solde insuffisant.");
        return false;
    }
}