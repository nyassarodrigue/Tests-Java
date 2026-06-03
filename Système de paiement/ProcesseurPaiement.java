public class ProcesseurPaiement {
    
    // Le processeur encaisse n'importe quelle méthode de paiement (Polymorphisme)
    public void encaisser(MethodePaiement methode, double montant) {
        System.out.println("\n[Processeur] Tentative de prélèvement de " + montant + " FCFA...");
        
        boolean resultat = methode.traiterPaiement(montant);
        methode.afficherRecu(montant, resultat);
    }
}