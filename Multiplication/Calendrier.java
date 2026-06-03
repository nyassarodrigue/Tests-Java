// Importation de la classe LocalDate pour manipuler les dates sans notion de fuseau horaire
import java.time.LocalDate;
// Importation de la classe TextStyle pour gérer le format d'affichage du texte (court, long...)
import java.time.format.TextStyle;
// Importation de la classe Locale pour adapter l'affichage à la langue française
import java.util.Locale;

public class Calendrier {
    public static void main(String[] args) {
        
        // 1. Récupération de la date du jour (la date système à jour)
        LocalDate aujourdHui = LocalDate.now();
        
        // 2. Extraction du jour actuel, du mois actuel et de l'année actuelle
        int jourActuel = aujourdHui.getDayOfMonth();
        int moisActuel = aujourdHui.getMonthValue();
        int anneeActuelle = aujourdHui.getYear();
        
        // 3. Création d'une instance pointant exactement sur le 1er jour du mois en cours
        LocalDate premierDuMois = LocalDate.of(anneeActuelle, moisActuel, 1);
        
        // 4. Détermination du jour de la semaine pour ce 1er jour (Lundi = 1, Mardi = 2...)
        int valeurJourSemaine = premierDuMois.getDayOfWeek().getValue();
        
        // 5. Récupération de la longueur totale du mois actuel en jours (ex: 30 ou 31 jours)
        int nombreJoursDansMois = aujourdHui.lengthOfMonth();
        
        // 6. Récupération du nom du mois en texte complet et en français
        String nomMois = aujourdHui.getMonth().getDisplayName(TextStyle.FULL, Locale.FRANCE);
        
        // 7. Affichage de l'en-tête du calendrier (Mois et Année)
        System.out.println("\n=====================================");
        System.out.printf("      CALENDRIER : %s %d\n", nomMois.toUpperCase(), anneeActuelle);
        System.out.println("=====================================");
        
        // 8. Affichage des initiales des jours de la semaine pour former les colonnes
        System.out.println(" Lun  Mar  Mer  Jeu  Ven  Sam  Dim");
        
        // 9. Création d'espaces vides pour décaler le 1er jour du mois sous la bonne colonne
        // Par exemple, si le 1er est un Mercredi (valeur 3), on laisse 2 espaces vides (Lundi, Mardi)
        for (int i = 1; i < valeurJourSemaine; i++) {
            System.out.print("     ");
        }
        
        // 10. Boucle principale : Parcours et affichage de tous les jours du mois un par un
        for (int jour = 1; jour <= nombreJoursDansMois; jour++) {
            
            // Condition : Si le jour en cours d'impression correspond au jour d'aujourd'hui
            if (jour == jourActuel) {
                // On l'affiche entouré de crochets [ ] pour le mettre en évidence visuellement
                System.out.printf("[%2d]", jour);
            } else {
                // Sinon, on l'affiche normalement avec un alignement de 3 caractères
                System.out.printf(" %2d ", jour);
            }
            
            // 11. Gestion du saut de ligne à la fin de chaque semaine (le dimanche)
            // On fait le calcul : (le décalage initial + le jour actuel)
            // Si le résultat est un multiple de 7, cela signifie que la semaine est finie
            if ((jour + valeurJourSemaine - 1) % 7 == 0) {
                // On passe à la ligne suivante pour la nouvelle semaine
                System.out.println(); 
            }
        }
        
        // 12. Affichage final d'une ligne esthétique de fermeture et rappel de la date exacte
        System.out.println("\n=====================================");
        System.out.println(" (*) Date du jour marquée entre [ ]");
        System.out.println("=====================================");
    }
}