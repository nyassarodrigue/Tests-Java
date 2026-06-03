public class Moto extends Vehicule {
    private boolean aUnSidecar;

    public Moto(String marque, String modele, boolean aUnSidecar) {
        // Appelle le constructeur de Vehicule
        super(marque, modele);
        this.aUnSidecar = aUnSidecar;
    }

    // Redéfinition de la méthode demarrer
    @Override
    public void demarrer() {
        System.out.println("La moto " + marque + " rugit : Braaaap ! " + (aUnSidecar ? "Attention au sidecar !" : ""));
    }
}