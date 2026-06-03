public class Main {
    public static void main(String[] args) {
        ProcesseurPaiement processeur = new ProcesseurPaiement();

        // 1. Achat par Carte de Crédit (Simple)
        MethodePaiement maCarte = new CarteCredit(500.0, "4973-XXXX-XXXX-1234");
        processeur.encaisser(maCarte, 45.99);

        // 2. Achat par PayPal (Nécessite une sécurité d'abord)
        PayPal monPayPal = new PayPal(150.0, "client@email.com");
        
        // Tentative sans OTP (Va échouer)
        processeur.encaisser(monPayPal, 80.0);
        
        // On valide la sécurité (Interface Securisable)
        monPayPal.validerDoubleFacteur("1234");
        
        // Nouvelle tentative après validation (Va réussir)
        processeur.encaisser(monPayPal, 80.0);
    }
}
