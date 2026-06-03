import java.util.Scanner;

public class Devinettespays {
    public static void main(String[] args) {
        // 1. Initialisation du scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // 2. Structure des données : Pays, Options (A, B, C, D) et Réponses correctes
        String[] pays = {
            "la France",
            "le Japon",
            "le Canada",
            "l'Australie",
            "le Brésil"
        };

        String[][] options = {
            {"A) Lyon", "B) Paris", "C) Marseille", "D) Berlin"},
            {"A) Kyoto", "B) Osaka", "C) Tokyo", "D) Séoul"},          
            {"A) Toronto", "B) Montréal", "C) Vancouver", "D) Ottawa"},
            {"A) Sydney", "B) Melbourne", "C) Canberra", "D) Brisbane"},
            {"A) Rio de Janeiro", "B) Brasilia", "C) São Paulo", "D) Buenos Aires"}
        };

        char[] reponsesCorrectes = {'B', 'C', 'D', 'C', 'B'};

        // 3. Message de bienvenue
        System.out.println("=================================================");
        System.out.println("🌍 BIENVENUE AU JEU DES CAPITALES (5 QCM) 🌍");
        System.out.println("=================================================");
        System.out.println("Répondez en entrant la lettre correspondante (A, B, C ou D).\n");

        // 4. Boucle principale du jeu
        for (int i = 0; i < pays.length; i++) {
            System.out.println("Question " + (i + 1) + " : Quelle est la capitale de " + pays[i] + " ?");
            
            // Affichage des 4 options de réponse
            for (String option : options[i]) {
                System.out.println(option);
            }

            // Récupération et validation de la réponse
            char reponseUser;
            while (true) {
                System.out.print("Votre réponse : ");
                String saisie = scanner.next().toUpperCase(); // Convertit en majuscule pour éviter les erreurs
                
                if (saisie.length() == 1 && (saisie.charAt(0) >= 'A' && saisie.charAt(0) <= 'D')) {
                    reponseUser = saisie.charAt(0);
                    break; // Saisie valide, on sort de la boucle de validation
                }
                System.out.println("⚠️ Veuillez entrer une lettre valide entre A, B, C et D.");
            }

            // Vérification de la réponse
            if (reponseUser == reponsesCorrectes[i]) {
                System.out.println("✨ Correct !\n");
                score++;
            } else {
                System.out.println("❌ Faux ! La bonne réponse était la lettre " + reponsesCorrectes[i] + ".\n");
            }
        }

        // 5. Affichage du score final
        System.out.println("=================================================");
        System.out.println("🎉 Partie terminée ! 🎉");
        System.out.println("Votre score final est de : " + score + " / " + pays.length);
        
        // Petit commentaire personnalisé selon le score
        if (score == 5) {
            System.out.println("Un sans-faute ! Vous êtes un expert en géographie ! 🏆");
        } else if (score >= 3) {
            System.out.println("Pas mal du tout ! Bon score. 👍");
        } else {
            System.out.println("Il va falloir réviser un peu vos cartes de géographie... 🗺️");
        }
        System.out.println("=================================================");

        // Fermeture du scanner
        scanner.close();
    }
}