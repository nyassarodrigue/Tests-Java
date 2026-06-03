public interface Securisable {
    // Un contrat pour valider la sécurité avant de payer
    boolean validerDoubleFacteur(String codeOTP);
}