import java.util.ArrayList; // importation de l'interface List et de la classe ArrayList pour gérer une collection de véhicules
import java.util.List; // classe concrète qui implémente (réalise) le contrat de List

public class Main {
    public static void main(String[] args) {
        // Création d'une liste de "Vehicule" (le type générique)
        List<Vehicule> monGarage = new ArrayList<>();

        // Polymorphisme : on ajoute des objets enfants dans une liste du type parent
        monGarage.add(new Voiture("Mercedes", "ML", 4));
        monGarage.add(new Moto("Yamaha", "MT-07", false));
        monGarage.add(new Voiture("Jetour", "T01 3", 4));

        System.out.println("--- PRÉSENTATION ET DÉMARRAGE DU GARAGE ---");

        // On parcourt la liste de manière uniforme
        for (Vehicule v : monGarage) {
            // Appel d'une méthode commune
            v.afficherInfos();
            
            // Le polymorphisme dynamique s'applique ici : 
            // Java sait exactement s'il doit faire "Vroum Vroum" ou "Braaaap"
            v.demarrer();
            
            System.out.println("-----------------------------------");
        }
    }
}