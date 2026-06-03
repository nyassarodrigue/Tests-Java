public class Voiture extends Vehicule {
    private int nombreDePortes;

    public Voiture(String marque, String modele, int nombreDePortes) {
        // Appelle le constructeur de Vehicule
        super(marque, modele); 
        this.nombreDePortes = nombreDePortes;
    }

    // Redéfinition de la méthode demarrer
    @Override
    public void demarrer() {
        System.out.println("La voiture " + marque + " vrombit : Vroum Vroum ! (les " + nombreDePortes + " portes sont verrouillées)");
    }
}


