public class Vehicule {
    // Attributs communs
    protected String marque;
    protected String modele;

    // Constructeur
    public Vehicule(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }

    // Méthode qui sera redéfinie
    public void demarrer() {
        System.out.println("Le véhicule démarre de manière générique.");
    }

    // Méthode standard héritée telle quelle
    public void afficherInfos() {
        System.out.println("Véhicule : " + marque + " " + modele);
    }
}